package com.sap.hana.cloud.samples.dq.util;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import com.sap.hana.cloud.samples.dq.api.ServiceException;
import com.sap.hana.cloud.samples.dq.model.output.ErrorMessage;

/**
 * 
 * @see http://cxf.apache.org/docs/jax-rs-basics.html#JAX-RSBasics-Exceptionhandling
 * @see http://fusesource.com/docs/esb/4.2/rest/RESTExceptionMapper.html
 * 
 */
@Deprecated
public class ServiceExceptionMapper implements ExceptionMapper<ServiceException>
{
	/**
	 * TODO
	 * 
	 * @param exception The caught {@link ServiceException}
	 * @return The corresponding {@link Response} containing a {@link StatusMessage}
	 */
	@Override
	public Response toResponse(ServiceException exception)
	{	
		ErrorMessage message = exception.getErrorMessage();
		return Response.serverError().entity(message).type(MediaType.APPLICATION_JSON).build();
	}
}
