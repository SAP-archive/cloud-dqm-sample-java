package com.sap.hana.cloud.samples.dq.util;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import javax.ws.rs.core.Response;

import org.apache.commons.io.IOUtils;
import org.apache.cxf.jaxrs.client.ResponseExceptionMapper;
import org.codehaus.jackson.map.ObjectMapper;

import com.sap.hana.cloud.samples.dq.api.ServiceException;
import com.sap.hana.cloud.samples.dq.model.output.ErrorMessage;

/**
 * In case we get anything else than HTTP status code 200 (ok)
 */
public class ErrorResponseExceptionMapper implements ResponseExceptionMapper<ServiceException>
{

	@Override
	public ServiceException fromResponse(Response response)
	{
		ErrorMessage msg = new ErrorMessage();
		
		try 
		{
			if (response != null)
			{
				String json = IOUtils.toString((InputStream) response.getEntity() , StandardCharsets.UTF_8);
				
				ObjectMapper mapper = new ObjectMapper();
				msg = mapper.readValue(json, ErrorMessage.class);
			}
		}
		catch (Exception ex)
		{
			// F**ked up error handling :/
		}
		
		ServiceException ex = new ServiceException(msg);
		return ex;
	}

}
