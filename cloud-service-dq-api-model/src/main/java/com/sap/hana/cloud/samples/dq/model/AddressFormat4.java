package com.sap.hana.cloud.samples.dq.model;

import java.io.Serializable;

/**
 * Address Format 4: SAP Business Suite
 * 
 * Use this combination of fields when the data is stored in the data model used
 * by the SAP Business Suite.
 * 
 * Some organizations use the SAP Business Suite data model for storing address
 * data but customize the way address components are stored in the ADRC columns,
 * or extend the ADRC table with additional columns to store particular address
 * components. If your organization stores address data in a standard way, then
 * you may send requests with the direct use of fields mapped to ADRC columns.
 * However, if your organization has customized the storage of address data,
 * then you must ensure the correct mapping of fields.
 * 
 * All of these fields have a maximum length of 256.
 * 
 * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?4b7e519cf1484fb1ae04d39a1d28c90a.html
 */
public class AddressFormat4 implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * (required) STREET
	 */
	String street = null;

	/**
	 * HOUSE_NUM1
	 */
	String houseNum = null;

	/**
	 * HOUSE_NUM2
	 */
	String houseNum2 = null;

	/**
	 * FLOOR
	 */
	String floor = null;

	/**
	 * ROOMNUMBER
	 */
	String roomnumber = null;

	/**
	 * BUILDING
	 */
	String building = null;

	/**
	 * STR_SUPPL2
	 */
	String streetSuppl = null;

	/**
	 * 
	 */
	String streetSuppl2 = null;

	/**
	 * STR_SUPPL3
	 */
	String streetSuppl3 = null;

	/**
	 * LOCATION
	 */
	String location = null;

	/**
	 * CITY1
	 */
	String locality = null;

	/**
	 * HOME_CITY
	 */
	String locality2 = null;

	/**
	 * CITY2
	 */
	String locality3 = null;

	/**
	 * REGION
	 */
	String region = null;

	/**
	 * (required) POST_CODE1
	 * 
	 */
	String postcode = null;

	/**
	 * (required) COUNTRY
	 */
	String country = null;

	/**
	 * (required) only when there is a postbox address PO_BOX
	 */
	String poBox = null;

	/**
	 * (required) only when there is a postbox address PO_BOX_LOC
	 */
	String poBoxLocality = null;

	/**
	 * PO_BOX_REG
	 */
	String poBoxRegion = null;

	/**
	 * (required) only when there is a postbox address POST_CODE2
	 * 
	 */
	String poBoxPostcode = null;

	/**
	 * 
	 * PO_BOX_CTY
	 */
	String poBoxCountry = null;

	public String getStreet()
	{
		return street;
	}

	public void setStreet(String street)
	{
		this.street = street;
	}

	public String getHouseNum()
	{
		return houseNum;
	}

	public void setHouseNum(String houseNum)
	{
		this.houseNum = houseNum;
	}

	public String getHouseNum2()
	{
		return houseNum2;
	}

	public void setHouseNum2(String houseNum2)
	{
		this.houseNum2 = houseNum2;
	}

	public String getFloor()
	{
		return floor;
	}

	public void setFloor(String floor)
	{
		this.floor = floor;
	}

	public String getRoomnumber()
	{
		return roomnumber;
	}

	public void setRoomnumber(String roomnumber)
	{
		this.roomnumber = roomnumber;
	}

	public String getBuilding()
	{
		return building;
	}

	public void setBuilding(String building)
	{
		this.building = building;
	}

	public String getStreetSuppl()
	{
		return streetSuppl;
	}

	public void setStreetSuppl(String streetSuppl)
	{
		this.streetSuppl = streetSuppl;
	}

	public String getStreetSuppl2()
	{
		return streetSuppl2;
	}

	public void setStreetSuppl2(String streetSuppl2)
	{
		this.streetSuppl2 = streetSuppl2;
	}

	public String getStreetSuppl3()
	{
		return streetSuppl3;
	}

	public void setStreetSuppl3(String streetSuppl3)
	{
		this.streetSuppl3 = streetSuppl3;
	}

	public String getLocation()
	{
		return location;
	}

	public void setLocation(String location)
	{
		this.location = location;
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

	public String getPoBox()
	{
		return poBox;
	}

	public void setPoBox(String poBox)
	{
		this.poBox = poBox;
	}

	public String getPoBoxLocality()
	{
		return poBoxLocality;
	}

	public void setPoBoxLocality(String poBoxLocality)
	{
		this.poBoxLocality = poBoxLocality;
	}

	public String getPoBoxRegion()
	{
		return poBoxRegion;
	}

	public void setPoBoxRegion(String poBoxRegion)
	{
		this.poBoxRegion = poBoxRegion;
	}

	public String getPoBoxPostcode()
	{
		return poBoxPostcode;
	}

	public void setPoBoxPostcode(String poBoxPostcode)
	{
		this.poBoxPostcode = poBoxPostcode;
	}

	public String getPoBoxCountry()
	{
		return poBoxCountry;
	}

	public void setPoBoxCountry(String poBoxCountry)
	{
		this.poBoxCountry = poBoxCountry;
	}

}
