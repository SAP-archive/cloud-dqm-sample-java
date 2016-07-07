package com.sap.hana.cloud.samples.dq.model.output;

import java.io.Serializable;

/**
 * 
 * 
 * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?481344dd148c407ca810fc6b8bd12ec3.html
 */
public class ErrorMessage implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Integer httpStatusCode = null;
	
	String cause = null;
	
	public ErrorMessage() {}
	
	public ErrorMessage(Integer code, String cause)
	{
		this.httpStatusCode = code;
		this.cause = cause;
	}
	
	public Integer getHttpStatusCode()
	{
		return httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode)
	{
		this.httpStatusCode = httpStatusCode;
	}

	public String getCause()
	{
		return cause;
	}

	public void setCause(String cause)
	{
		this.cause = cause;
	}
	
}
