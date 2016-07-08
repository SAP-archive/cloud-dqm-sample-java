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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("ErrorMessage [httpStatusCode=").append(httpStatusCode).append(", cause=").append(cause)
		        .append("]");
		return builder.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cause == null) ? 0 : cause.hashCode());
		result = prime * result + ((httpStatusCode == null) ? 0 : httpStatusCode.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		ErrorMessage other = (ErrorMessage) obj;
		if (cause == null)
		{
			if (other.cause != null) return false;
		}
		else if (!cause.equals(other.cause)) return false;
		if (httpStatusCode == null)
		{
			if (other.httpStatusCode != null) return false;
		}
		else if (!httpStatusCode.equals(other.httpStatusCode)) return false;
		return true;
	}
	
}
