package com.sap.hana.cloud.samples.dq.rs;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.text.MessageFormat;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.io.IOUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sap.hana.cloud.samples.dq.api.DataQualityService;
import com.sap.hana.cloud.samples.dq.model.AddressCleanseRequest;
import com.sap.hana.cloud.samples.dq.model.AddressCleanseResponse;
import com.webcohesion.enunciate.metadata.Facet;
import com.webcohesion.enunciate.metadata.rs.ResourceLabel;
import com.webcohesion.enunciate.metadata.rs.ServiceContextRoot;
import com.webcohesion.enunciate.metadata.rs.TypeHint;

/**
 * This service provides pre-defined examples.
 */
@Service("exampleFacade")
@Path("/example")
@Facet(value="Examples", documentation="This service provides pre-defined examples.")
@ResourceLabel(value="Examples ")
@ServiceContextRoot(value="/dq")
public class ExampleFacade extends BaseFacade
{
	@Autowired
	DataQualityService dqSrv = null;
	
	@Autowired
	ObjectMapper mapper = null;
	
	/**
	 * Returns a pre-defined {@link AddressCleanseRequest} object for the specified <code>countryCode</code>, or
	 * the respective {@link AddressCleanseResponse} if <code>execute</code> is to <code>true</code>
	 * 
	 * @param countryCode The country code (e.g. 'en', 'us', etc.)
	 * @param execute whether or not to execute the respective example right away.
	 * @return The requested {@link AddressCleanseRequest} or {@link AddressCleanseResponse} if <code>execute</code> was set to true
	 */
	@GET
	@Path("/{countryCode}")
	@Produces(MediaType.APPLICATION_JSON)
	@ResourceLabel("getExample")
	@TypeHint(AddressCleanseRequest.class)
	public Response getExample(@PathParam("countryCode") String countryCode, @QueryParam("execute") Boolean execute) 
	{
		AddressCleanseResponse retVal = null;
		
		String example = null;
		
		try
		{
			// fallback to de result ?!?
			final String code = countryCode == null ? "de" : countryCode.toLowerCase();
			
			ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			
			String resourceName = MessageFormat.format("examples/example_{0}_request.json", code);
			
			InputStream str = classLoader.getResourceAsStream(resourceName);
			
			if (str == null)
			{
				String msg = MessageFormat.format("No resource found with ID: {0}", code);
				throw new IOException(msg);
			}
			
			example = IOUtils.toString(str, StandardCharsets.UTF_8);
			
			AddressCleanseRequest req = mapper.readValue(example, AddressCleanseRequest.class);
			
			if (execute != null && execute)
			{
				retVal = dqSrv.cleanseAddress(req);
				return Response.ok(retVal).build();
			}

			return Response.ok(req).build();
		}
		catch (Exception ex)
		{
			return this.handleExceptions(ex, "test()");
		}
	}
}
