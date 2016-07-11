package com.sap.hana.cloud.samples.dq.model;

import java.io.Serializable;

/**
 * Address input object<br />
 * 
 * The set of fields selected must use one of the following formats.<br />
 * <ul>
 * <li><code>AddressFormat1</code> – part free-form, part discrete</li>
 * <li><code>AddressFormat2</code> – completely free-form</li>
 * <li><code>AddressFormat3</code> – only city, region, or postcode</li> 
 * <li><code>AddressFormat4</code> – SAP Business Suite</li>
 * </ul>
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

/*
 * TODO convert into nested objects for structural reasons
 *
 */
public class AddressInput implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String mixed = null;
	String mixed2 = null;
	String mixed3 = null;
	String mixed4 = null;
	String mixed5 = null;
	String mixed6 = null;
	String mixed7 = null;
	String mixed8 = null;
	String mixed9 = null;
	String mixed10 = null;
	String locality = null;
	String locality2 = null;
	String locality3 = null;
	String region = null;
	String region2 = null;
	String postcode = null;
	String street = null;
	String houseNum = null;
	String houseNum2 = null;
	String floor = null;
	String roomnumber = null;
	String building = null;
	String streetSuppl = null;
	String streetSuppl2 = null;
	String streetSuppl3 = null;
	String location = null;
	String country = null;
	String poBox = null;
	String poBoxLocality = null;
	String poBoxRegion = null;
	String poBoxPostcode = null;
	String poBoxCountry = null;

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
