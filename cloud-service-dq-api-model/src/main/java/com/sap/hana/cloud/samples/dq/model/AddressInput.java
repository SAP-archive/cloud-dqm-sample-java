package com.sap.hana.cloud.samples.dq.model;

import java.io.Serializable;

/**
 * The set of fields selected must use one of the following formats.
 * 
 * Format 1 – part free-form, part discrete Format 2 – completely free-form
 * Format 3 – only city, region, or postcode Format 4 – SAP Business Suite
 * 
 * The JSON structure may exclude fields that do not include values as long as
 * they are not required.
 * 
 * Each format has required fields. In the event the request does not have data
 * for a required field then send the required field in the request, but send it
 * without a value. For example, when using Format 1 the locality and postcode
 * are both required fields. To send an address with a locality but not a
 * postcode, include the postcode field in the request without a value.
 * 
 * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?d5dbe108aaee4fecbe2998996ce1954e.html
 */
public class AddressInput implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMixed()
	{
		return mixed;
	}

	public void setMixed(String mixed)
	{
		this.mixed = mixed;
	}

	public String getLocality()
	{
		return locality;
	}

	public void setLocality(String locality)
	{
		this.locality = locality;
	}

	public String getRegion()
	{
		return region;
	}

	public void setRegion(String region)
	{
		this.region = region;
	}

	public String getPostcode()
	{
		return postcode;
	}

	public void setPostcode(String postcode)
	{
		this.postcode = postcode;
	}

	public String getCountry()
	{
		return country;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}

	String mixed = null;

	String locality = null;

	String region = null;

	String postcode = null;

	String country = null;

}
