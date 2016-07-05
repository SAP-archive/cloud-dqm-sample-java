package com.sap.hana.cloud.samples.dq.model;

import java.io.Serializable;

/**
 * Address Format 2: Completely Free-Form
 * 
 * Use this combination of fields when the location of the city, region, and
 * postcode is variable from one request to another.
 * 
 * The maximum length for each of these fields is 256.
 * 
 * When either Format 1 or Format 2 is possible, use Format 1, which provides
 * the best results in some scenarios.
 * 
 * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?b05d0d60cdd048e9b203381b6bad1f5f.html
 */
public class AddressFormat2 implements Serializable
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
	 * 
	 */
	String mixed10 = null;

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

	public String getMixed10()
	{
		return mixed10;
	}

	public void setMixed10(String mixed10)
	{
		this.mixed10 = mixed10;
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
