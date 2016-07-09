package com.sap.hana.cloud.samples.dq.rs;

import java.io.IOException;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sap.hana.cloud.samples.dq.api.ServiceException;
import com.sap.hana.cloud.samples.dq.model.output.ErrorMessage;

/**
 * Abstract base class for all facades.
 *
 */
public abstract class BaseFacade
{
	private static final Logger logger = LoggerFactory.getLogger(BaseFacade.class);

	/**
	 * Handles the incoming {@link Throwable} and returns a corresponding
	 * {@link Response} instead.
	 * 
	 * @param t
	 * @param params
	 * @return
	 */
	public Response handleExceptions(Throwable t, String... params)
	{		
		if (ServiceException.class.isInstance(t))
		{
			/*
			 * any exception that resulted from a JAX-RS client invocation as a mechanism 
			 * to report HTTP status codes <> 200 in a unified way while keeping the 
			 * respective service proxy class as part of domain model.
			 * 
			 */
			
			ServiceException ex = (ServiceException) t;
			
			ErrorMessage msg = ex.getErrorMessage();
			
			int status = 500;
			
			if (msg != null && msg.getHttpStatusCode() != null)
			{
				status = msg.getHttpStatusCode();
			}
			
			if (logger.isInfoEnabled())
			{
				logger.info("handleExcpetion(ServiceException): {0}", msg.toString()); 
			}
			
			return Response.status(status).entity(msg).build();
			
		}
		
		if (WebApplicationException.class.isInstance(t))
		{
			/*
			 * any exception that resulted from a JAX-RS client invocation due to 
			 * technical errors (network, etc.)
			 */
			
			WebApplicationException ex = (WebApplicationException) t;
			
			Response response = ex.getResponse();
			
			if (response != null)
			{
				int status = response.getStatus();
				Object entity = response.getEntity();
				
				ErrorMessage msg = new ErrorMessage(status, "" + entity);
				
				if (logger.isInfoEnabled())
				{
					logger.info("handleExcpetion(WebApplicationException): {0}", msg.toString()); 
				}
				
				return Response.status(status).entity(msg).build();
			}
			
			return ex.getResponse();
		}
		
		if (JsonParseException.class.isInstance(t))
		{
			if (logger.isInfoEnabled())
			{
				logger.info("handleExcpetion(JsonParseException): {0}", t); 
			}
		}
		
		if (JsonMappingException.class.isInstance(t)) 
		{
			if (logger.isInfoEnabled())
			{
				logger.info("handleExcpetion(JsonMappingException): {0}", t); 
			}
		}
		
		if (IOException.class.isInstance(t)) 
		{
			ErrorMessage msg = new ErrorMessage(400, t.getMessage());
			
			if (logger.isInfoEnabled())
			{
				logger.info("handleExcpetion(IOException): {0}", t); 
			}
			
			Response.status(400).entity(msg).build();
		}
	
		
		// completely unexpected ;)
		
		logger.error("handleException():", t);
			
		ErrorMessage msg = new ErrorMessage(Status.INTERNAL_SERVER_ERROR.getStatusCode(), t.getMessage());
		return Response.serverError().entity(msg).build();
	}
	
}
