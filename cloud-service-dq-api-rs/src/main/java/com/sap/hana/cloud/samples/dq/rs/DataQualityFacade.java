package com.sap.hana.cloud.samples.dq.rs;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

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
import com.sap.hana.cloud.samples.dq.model.AddressCleanseResponse;

/**
 * This service offers cloud-based microservices for address cleansing, geocoding, and reverse geocoding. 
 * You can embed address cleansing and enrichment services within any business process or application so 
 * that you can quickly reap the value of complete and accurate address data.<br />
 * <br />
 * With this product, you can provide users with self-service, right-sized consumption of data quality services, 
 * eliminate operational complexity and infrastructure costs, and quickly deploy on many SAP applications 
 * with pre-built integration. This product is available on the cloud as a service.<br />
 * <br /> 
 * This certified address cleansing solution uses reference data from global postal authorities for 240+ countries 
 * and territories to validate or correct addresses.<br />
 * <br />
 * Enrich data so you can confidently connect with your customers or uncover hidden geographical patterns. 
 * Get accurate global latitude and longitude data so you know exactly where your customers, prospects, employees, 
 * stores, etc. are located.<br />
 * <br />
 * With address cleansing, you can quickly and easily correct, parse, standardize, validate, and enhance address data.
 * <br />
 * Geocoding assigns latitude and longitude coordinates to an address, while reverse geocoding translates latitude and 
 * longitude coordinates into address(es).<br />
 * <br />
 * The extent to which address cleansing, geocoding, and reverse geocoding is available depends on the country in which 
 * the address is located.<br />
 */
@Service("dqFacade")
@Path("/addressCleanse")
@com.webcohesion.enunciate.metadata.rs.ResourceLabel(value="DQaaS (BETA)")
@com.webcohesion.enunciate.metadata.rs.ServiceContextRoot(value="/dq")
public class DataQualityFacade extends BaseFacade
{
	@Autowired
	DataQualityService dqSrv = null;
	
	/**
	 * @return 
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@com.webcohesion.enunciate.metadata.rs.ResourceLabel("test")
	@com.webcohesion.enunciate.metadata.rs.TypeHint(AddressCleanseResponse.class)
	@com.webcohesion.enunciate.metadata.Ignore
	public Response test() throws IOException
	{
		try
		{
			ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			InputStream str = classLoader.getResourceAsStream("example-response.json");
			final String retVal = IOUtils.toString(str, StandardCharsets.UTF_8);
			return Response.ok().entity(retVal).build();
		}
		catch (Exception ex)
		{
			return this.handleExceptions(ex, "cleanseAddress()");
		}
	}
	
	/**
	 * When this product cleanses your address data, it parses, standardizes, corrects, validates, 
	 * and enhances address data.<br />
	 * <br />
	 * Address cleansing involves the following tasks:
	 * <ul>
	 * <li>Verify address per postal authority reference data as correct</li>
	 * <li>Standardize the way the address looks and is structured</li>
	 * <li>Correct components of an address if incorrect</li>
	 * <li>Enhance an address with missing attributes</li>
	 * <li>Assign diagnostic codes, which provide insight into the process that assigns the address to reference data</li>
	 * <li>Parse address into different structure</li>
	 * <ul>
	 * 
	 * @param request The request
	 * @return The response
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@com.webcohesion.enunciate.metadata.rs.ResourceLabel("cleanseAddress")
	@com.webcohesion.enunciate.metadata.rs.TypeHint(AddressCleanseResponse.class)
	public Response cleanseAddress(AddressCleanseRequest request)
	{
		try
		{
			AddressCleanseResponse response = dqSrv.cleanseAddress(request);
			return Response.ok(response).build();
		}
		catch (Exception ex)
		{
			return this.handleExceptions(ex, "cleanseAddress()");
		}
	}
}
