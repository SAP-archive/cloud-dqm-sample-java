package com.sap.hana.cloud.samples.dq.rs;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public String hello()
	{
		return "Hello World!";
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String cleanseAddress(AddressCleanseRequest request)
	{
		return dqSrv.cleanseAddress(request);
		//return Response.ok(request).build();
	}
}
