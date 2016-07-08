package com.sap.hana.cloud.samples.dq.util;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.text.MessageFormat;

import javax.ws.rs.core.Response;

import org.apache.commons.io.IOUtils;
import org.apache.cxf.jaxrs.client.ResponseExceptionMapper;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sap.hana.cloud.samples.dq.api.DataQualityServiceFactory;
import com.sap.hana.cloud.samples.dq.api.ServiceException;
import com.sap.hana.cloud.samples.dq.model.output.ErrorMessage;

/**
 * In case we get anything else than HTTP status code 200 (ok)
 */
public class ErrorResponseExceptionMapper implements ResponseExceptionMapper<ServiceException>
{
	private static final Logger logger = LoggerFactory.getLogger(ErrorResponseExceptionMapper.class);
	
	@Override
	public ServiceException fromResponse(Response response)
	{
		ErrorMessage msg = new ErrorMessage();
	
		try 
		{
			if (response != null)
			{
				msg.setHttpStatusCode(response.getStatus());
				msg.setCause("Oops...");
				
				switch(response.getStatus())
				{
					case 400:
					{
						msg.setCause("Bad Request");
					}
					case 500:
					{
						msg.setCause("Internal server error");
					}
					case 503:
					{
						msg.setCause("Service Unavailable");
					}
					default:
					{
						try // to deserialize from ErrorMessage
						{
							String str = IOUtils.toString((InputStream) response.getEntity() , StandardCharsets.UTF_8);
							msg.setCause(str); // fallback (e.g. for non Json response)
							
							ObjectMapper mapper = new CustomObjectMapper();
							msg = mapper.readValue(str, ErrorMessage.class);	
						}
						catch (JsonParseException ex)
						{
							String exMsg = "Error parsing response: " + msg.getCause();
							logger.warn(exMsg, ex);
						}
						catch (Exception ex)
						{
							// this response is not what we expected
							ex.printStackTrace();
						}					
					}
				}
			}
		}
		catch (Exception ex)
		{
			// F**ked up error handling :/
			ex.printStackTrace();
		}
		
		ServiceException ex = new ServiceException(msg);
		return ex;
	}
}
