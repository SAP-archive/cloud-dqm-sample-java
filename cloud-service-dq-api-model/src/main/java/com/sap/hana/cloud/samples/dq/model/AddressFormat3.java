package com.sap.hana.cloud.samples.dq.model;

import java.io.Serializable;

/**
 * Address Format 3: Only City, Region, or Postcode
 * 
 * Use this combination of fields when your purpose is to cleanse city, region,
 * or postcode data, without sending an actual address.
 * 
 * Include locality, region, postcode, and country data. Do not include any
 * mixed fields.This format is limited in functionality due to such limited
 * information being sent in the request. However, city and region names can be
 * standardized and formatted as requested, and in some cases corrected when
 * sent with a misspelling. When sending a city, the region may be appended when
 * there is only one region that has a city by that name. When sending a city,
 * the postcode may be appended when there is only one postcode for the city,
 * but if there are multiple valid postcodes for the city then no postcode is
 * appended. When sending a postcode, the city and region may be appended when
 * there is only one city for that postcode.
 * 
 * When generating suggestion lists, sending data in this format may be more
 * useful. The suggestion list may include the list of valid postcodes for a
 * city, or the list of cities for a postcode, or the list of regions that have
 * cities with the same name.
 * 
 * Only country and one other field (your choice of either locality or postcode)
 * is required. All of these fields have a maximum length of 256.
 * 
 * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?1709677c9e834afe9551295087a72597.html
 */
public class AddressFormat3 implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String locality = null;
	String locality2 = null;
	String locality3 = null;
	String region = null;
	String region2 = null;
	String postcode = null;

	/**
	 * (required)
	 */
	String country = null;

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
