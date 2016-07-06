package com.sap.hana.cloud.samples.dq.rs;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.text.MessageFormat;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sap.hana.cloud.samples.dq.api.DataQualityService;
import com.sap.hana.cloud.samples.dq.model.AddressCleanseRequest;

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
			String response = dqSrv.cleanseAddress(request);
			return Response.ok(response).build();
		}
		catch (Exception ex)
		{
			
			return Response.serverError().entity(ex.getMessage()).build();
			//String response = test();
			//return Response.ok(response).build();
		}
		
		//return Response.ok(request).build();
	}
}
