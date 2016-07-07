package com.sap.hana.cloud.samples.dq.api;

import com.sap.hana.cloud.samples.dq.model.output.ErrorMessage;

/**
 * {@link RuntimeException} used by the service layer.
 */
public class ServiceException extends RuntimeException
{

	/**
	 * The <code>serialVersionUID</code> of this class.
	 */
    private static final long serialVersionUID = 1L;

    ErrorMessage msg = null;
 
	public ServiceException()
	{	
		super();
		msg = new ErrorMessage();
	}

	public ServiceException(String arg0)
	{
		super(arg0);
		msg = new ErrorMessage();
		msg.setCause(arg0);
	}

	public ServiceException(Throwable arg0)
	{
		super(arg0);
		msg = new ErrorMessage();
		msg.setCause(arg0.getMessage());
	}

	public ServiceException(String arg0, Throwable arg1)
	{
		super(arg0, arg1);
		msg = new ErrorMessage();
		msg.setCause(arg0);
	}
	
	public ServiceException(ErrorMessage msg)
	{
		super();
		this.msg = msg;
	}
	
	public ErrorMessage getErrorMessage()
	{
		return this.msg;
	}

}
