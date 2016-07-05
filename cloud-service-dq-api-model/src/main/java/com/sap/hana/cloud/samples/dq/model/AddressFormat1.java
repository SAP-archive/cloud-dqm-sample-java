package com.sap.hana.cloud.samples.dq.model;

import java.io.Serializable;

/**
 * Address Format 1: Part Free-Form, Part Discrete
 * 
 * Use this combination of fields when the city, region, and postcode are in
 * discrete attributes.
 * 
 * The maximum length for each of these fields is 256.
 * 
 * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?1f6a41ca12834144ac8f546a8489209d.html
 */
public class AddressFormat1 implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * (required)
	 */
	String mixed = null;

	/**
	 * 
	 */
	String mixed2 = null;

	/**
	 * 
	 */
	String mixed3 = null;

	/**
	 * 
	 */
	String mixed4 = null;

	/**
	 * 
	 */
	String mixed5 = null;

	/**
	 * 
	 */
	String mixed6 = null;

	/**
	 * 
	 */
	String mixed7 = null;

	/**
	 * 
	 */
	String mixed8 = null;

	/**
	 * 
	 */
	String mixed9 = null;

	/**
	 * (required)
	 */
	String locality = null;

	/**
	 * 
	 */
	String locality2 = null;

	/**
	 * 
	 */
	String locality3 = null;

	/**
	 * 
	 */
	String region = null;

	/**
	 * 
	 */
	String region2 = null;

	/**
	 * (required)
	 */
	String postcode = null;

	/**
	 * (required)
	 */
	String country = null;

	public String getMixed()
	{
		return mixed;
	}

	public void setMixed(String mixed)
	{
		this.mixed = mixed;
	}

	public String getMixed2()
	{
		return mixed2;
	}

	public void setMixed2(String mixed2)
	{
		this.mixed2 = mixed2;
	}

	public String getMixed3()
	{
		return mixed3;
	}

	public void setMixed3(String mixed3)
	{
		this.mixed3 = mixed3;
	}

	public String getMixed4()
	{
		return mixed4;
	}

	public void setMixed4(String mixed4)
	{
		this.mixed4 = mixed4;
	}

	public String getMixed5()
	{
		return mixed5;
	}

	public void setMixed5(String mixed5)
	{
		this.mixed5 = mixed5;
	}

	public String getMixed6()
	{
		return mixed6;
	}

	public void setMixed6(String mixed6)
	{
		this.mixed6 = mixed6;
	}

	public String getMixed7()
	{
		return mixed7;
	}

	public void setMixed7(String mixed7)
	{
		this.mixed7 = mixed7;
	}

	public String getMixed8()
	{
		return mixed8;
	}

	public void setMixed8(String mixed8)
	{
		this.mixed8 = mixed8;
	}

	public String getMixed9()
	{
		return mixed9;
	}

	public void setMixed9(String mixed9)
	{
		this.mixed9 = mixed9;
	}

	public String getLocality()
	{
		return locality;
	}

	public void setLocality(String locality)
	{
		this.locality = locality;
	}

	public String getLocality2()
	{
		return locality2;
	}

	public void setLocality2(String locality2)
	{
		this.locality2 = locality2;
	}

	public String getLocality3()
	{
		return locality3;
	}

	public void setLocality3(String locality3)
	{
		this.locality3 = locality3;
	}

	public String getRegion()
	{
		return region;
	}

	public void setRegion(String region)
	{
		this.region = region;
	}

	public String getRegion2()
	{
		return region2;
	}

	public void setRegion2(String region2)
	{
		this.region2 = region2;
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

}
