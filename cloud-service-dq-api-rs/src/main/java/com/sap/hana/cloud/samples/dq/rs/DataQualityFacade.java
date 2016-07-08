package com.sap.hana.cloud.samples.dq.rs;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sap.hana.cloud.samples.dq.api.DataQualityService;
import com.sap.hana.cloud.samples.dq.api.ServiceException;
import com.sap.hana.cloud.samples.dq.model.AddressCleanseRequest;
import com.sap.hana.cloud.samples.dq.model.AddressCleanseResponse;
import com.sap.hana.cloud.samples.dq.model.output.ErrorMessage;

/**
 *  
 */
@Service("dqFacade")
@Path("/addressCleanse")
public class DataQualityFacade 
{
	@Autowired
	DataQualityService dqSrv = null;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String test() throws IOException
	{
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream str = classLoader.getResourceAsStream("example-response.json");
		final String retVal = IOUtils.toString(str, StandardCharsets.UTF_8);
		return retVal;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response cleanseAddress(AddressCleanseRequest request) throws IOException
	{
		try
		{
			AddressCleanseResponse response = dqSrv.cleanseAddress(request);
			return Response.ok(response).build();
		}
		catch (ServiceException ex)
		{
			ErrorMessage msg = ex.getErrorMessage();
			
			int status = 500;
			
			if (msg != null && msg.getHttpStatusCode() != null)
			{
				status = msg.getHttpStatusCode();
			}
			
			return Response.status(status).entity(msg).build();
		}
		catch (WebApplicationException ex) 
		{
			Response response = ex.getResponse();
			
			if (response != null)
			{
				int status = response.getStatus();
				Object entity = response.getEntity();
				
				ErrorMessage msg = new ErrorMessage(status, "" + entity);
				return Response.status(status).entity(msg).build();
			}
			
			return ex.getResponse();
		}
		catch (Exception ex)
		{
			ErrorMessage msg = new ErrorMessage(Status.INTERNAL_SERVER_ERROR.getStatusCode(), ex.getMessage());
			return Response.serverError().entity(msg).build();

		}
	}
}
