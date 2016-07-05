package com.sap.hana.cloud.samples.dq.rs;


import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sap.hana.cloud.samples.dq.model.AddressCleanseRequest;

@Path("/addressCleanse")
public interface DataQualityService 
{
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String cleanseAddress(AddressCleanseRequest request);
}
