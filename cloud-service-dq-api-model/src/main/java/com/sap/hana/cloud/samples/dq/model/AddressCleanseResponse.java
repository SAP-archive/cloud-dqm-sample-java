package com.sap.hana.cloud.samples.dq.model;

import java.io.Serializable;

/**
 

 */
public class AddressCleanseResponse implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * Address Output Field: Postbox for SAP Business Suite
     * The following output fields are specifically for applications that consume postbox address data in the SAP Business Suite data model.
     * 
     * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?f4b8ee5c3d354abfa1cd2356c16334e4.html
	 */
	String std_addr_po_box_country_2char = null;
	String std_addr_po_box_locality_full = null;
	String std_addr_po_box_delinst_full = null;
	String std_addr_po_box_region = null;
	String std_addr_po_box_region_full = null;
	String std_addr_po_box_region_code = null;
	String std_addr_po_box_region2 = null;
	String std_addr_po_box_region2_full = null;
	String std_addr_po_box_region2_code = null;
	String std_addr_po_box_postcode_full = null;
	String sap_formatted_po_box_postcode = null;
	String sap_in_fmt_po_box_postcode = null;
	String std_addr_po_box_number = null;
	String std_addr_po_box_full = null;
	String addr_po_box_info_code = null;
	String addr_po_box_info_code_msg = null;
	String addr_po_box_asmt_info = null;
	String addr_po_box_asmt_type = null;
	String addr_po_box_asmt_level = null;
	
	/*
	 * Address Output Field: GeoLocation Coordinates
     * The following output fields include properties regarding geo-location coordinates for the address.
     * Note that when sending a request with input fields in the SAP Business Suite data model,the geo-location 
     * coordinates are returned only for the street address,not the postbox address.
     * 
     * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?c5e4334965ff4a5e9233e76cc650a975.html
	 */
	String addr_latitude = null;
	String addr_longitude = null;
	String geo_asmt_level = null;
	String geo_info_code = null;
	String geo_info_code_msg = null;
	
	/*
	 * Address Output Field: Assignment Codes
	 * The following output fields contain codes that provide insight into the process that assigns the address to reference data.
	 * 
	 * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?3fff045179fc442d94845458b37184db.html
	 */
	String addr_info_code = null;
	String addr_info_code_msg = null;
	String addr_asmt_info = null;
	String addr_asmt_type = null;
	String addr_asmt_level = null;
	String addr_change_sig = null;
	String addr_language = null;
	
	/*
	 * Address Output Field: Non-Address
     * The following output fields include non-address data encountered with the address data.
     * 
     * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?9bdfcec363d345c2ad2a16fab50d1fa9.html
	 */
	String addr_address_rem = null;
	String addr_address_rem2 = null;
	String addr_address_rem3 = null;
	String addr_address_rem4 = null;
	String addr_remainder_full = null;
	String addr_extra = null;
	String addr_extra2 = null;
	String addr_extra3 = null;
	String addr_extra4 = null;
	String addr_remainder_extra_pmb_full = null;
	
	/*
	 * Address Output Field: Country-Specific
	 * The following output fields include information related to address data that is unique to an individual country.
	 * 
	 * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?8e60124732a14c808c47ead641dab562.html
	 */
	String std_addr_additional_info = null;
	String std_addr_additional_info2 = null;
	String std_addr_additional_info3 = null;
	String std_addr_additional_info4 = null;
	String std_addr_additional_info5 = null;
	String std_addr_additional_info6 = null;
	
	/*
	 * Address Output Field: Composite
	 * The following output fields include composite address data.
	 * 
	 * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?f9ed501f6edc45deabcd4d6b770bb71b.html
	 */
	String std_addr_single_address = null;
	String std_addr_full_address = null;
	String std_addr_lastline = null;
	
	/*
	 * Address Output Field: Secondary
     * The following output fields include variations of secondary address data.
     * 
     * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?49ba6af01c1d40bf8fa42cc3b0fea52e.html
	 */
	String std_addr_block_number = null;
	String std_addr_block_desc = null;
	String std_addr_block_full = null;
	String std_addr_wing_name = null;
	String std_addr_wing_desc = null;
	String std_addr_wing_full = null;
	String std_addr_stairwell_name = null;
	String std_addr_stairwell_desc = null;
	String std_addr_stairwell_full = null;
	String std_addr_floor_number = null;
	String std_addr_floor_desc = null;
	String std_addr_floor_qual = null;
	String std_addr_floor_full = null;
	String std_addr_unit_number = null;
	String std_addr_unit_desc = null;
	String std_addr_unit_qual = null;
	String std_addr_unit_full = null;
	String std_addr_room_number = null;
	String std_addr_room_full = null;
	String std_addr_pmb_full = null;
	String std_addr_secaddr_no_room = null;
	String std_addr_secaddr_no_floor = null;
	String std_addr_secaddr_no_floor_room = null;
	
	/*
	 * Address Output Field: House Number
     * The following output fields include variations of house number data.
     * <code>String std_addr_prim_number</code> -	The house number for a street address,such as “100” in the address “100 Main St”. For postbox addresses such as “PO Box 500” it contains the box number “500”,and for rural addresses such as “RR 1” it contains the route number “1”.
     * <code>String std_addr_prim_number_desc</code> -	The number descriptor. For example,in the Mexico address “Km 12” the descriptor is “Km”,and in the Japanese address “4号” the descriptor is “号”.
     * <code>String std_addr_prim_number_extra</code> -	Data that is found attached to or near the house number. For example,in the address “100A Main St” the extra data is “A”,and in the ranged address “31-41 Main St” the extra data is “-41”.
     * <code>String std_addr_prim_number_full</code> -	The combination of the house number,the descriptor,and the extra data. Using the previous examples,the full values would be “Km 12”,“4号”,“100A”,and “31-41”.
	 *
	 * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?1334e130a9c04a5e9f420e4a6bd90a8d.html
	 */
	String std_addr_prim_number = null;
	String std_addr_prim_number_desc = null;
	String std_addr_prim_number_extra = null;
	String std_addr_prim_number_full = null;
	
	/*
	 * Address Output Field: Street
     * The following output fields include variations of street data.
	 * Addresses in countries that have street addresses with only one level 
	 * of street information,such as United States and Germany,will return the 
	 * street name in the String std_addr_prim_name property,the street type such as street,
	 * avenue,and road in the String std_addr_prim_type property,and the directional word 
	 * such as north and southwest in the String std_addr_prim_prefix or String std_addr_prim_postfix 
	 * property.
	 * 
	 * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?e8ad3bce96c84f21a6e9f35e4a97adb2.html
	 */
	String std_addr_prim_name = null;
	String std_addr_prim_name_full = null;
	String std_addr_prim_name2 = null;
	String std_addr_prim_name2_full = null;
	String std_addr_prim_name3 = null;
	String std_addr_prim_name3_full = null;
	String std_addr_prim_name4 = null;
	String std_addr_prim_name4_full = null;
	String std_addr_prim_name1_2 = null;
	String std_addr_prim_name3_4 = null;
	String std_addr_prim_name1_4 = null;
	String std_addr_prim_type = null;
	String std_addr_prim_type2 = null;
	String std_addr_prim_type3 = null;
	String std_addr_prim_type4 = null;
	String std_addr_prim_prefix = null;
	String std_addr_prim_postfix = null;
	
	/*
	 * Address Output Field: Extended Address
     * The following output fields include extended address data.
     * The String std_addr_point_of_ref and String std_addr_area_name properties are often seen in 
     * addresses in India but not in other countries. Examples of point of references are 
     * “Behind Grand Hotel” and “Near Industrial Complex”,and examples of area names 
     * are “HREC Industrial Area” and “Pramuri Industrial Estate”.
     * The String std_addr_firm property contains the organization name retrieved from the address 
     * reference data. Be aware that the reference data may contain some unusual or shortened 
     * spellings that may or may not be found suitable. It is not recommended that these 
     * organization names are used except for very specific situations.
     *  
     *  @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?35dfab3b3dd74022986b4b9cf558bb55.html
	 */
	String std_addr_point_of_ref = null;
	String std_addr_point_of_ref2 = null;
	String std_addr_point_of_ref1_2 = null;
	String std_addr_area_name = null;
	String std_addr_firm = null;
	
	/*
	 * Address Output Fields: Address
	 * The following output fields include various forms of address data.
	 * 
	 * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?4b7c1d6d6a1f4143a9b38be21544ab51.html
	 */
	String std_addr_address_delivery = null;
	String std_addr_address_dual = null;
	String std_addr_addr_deldual = null;
	String std_addr_addr_deldual_bldg = null;
	String std_addr_primaddr_deldual = null;
	String std_addr_primaddr_deldual_bldg = null;
	String std_addr_building_name = null;
	String std_addr_building_name2 = null;
	String std_addr_building_name1_2 = null;
	String std_addr_prim_address = null;
	String std_addr_sec_address = null;
	String std_addr_pname_secaddr = null;
	
	/*
	 * Address Output Field: Postcode
	 * The following output fields include variations of postcode data.
	 * 
	 * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?b0447f116bb24b73afd9a2a87c021538.html
     */
	String std_addr_postcode_full = null;
	String std_addr_postcode1 = null;
	String std_addr_postcode2 = null;
	String sap_formatted_postcode = null;
	String sap_in_fmt_postcode = null;	 
	
	/*
	 * Address Output Field: Region
	 * The following output fields include variations of region (state,province,
	 * territory,prefecture,etc.) and subregion (county,district,etc.) data.
	 * 
	 * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?1ff518052ed044e79c6e9b802cb3cb22.html
	 */
	String std_addr_region = null;
	String std_addr_region_full = null;
	String std_addr_region_code = null;
	String std_addr_region2 = null;
	String std_addr_region2_code = null;
	String std_addr_region1_2 = null;
	String std_addr_region1_2_full = null;
	
	/*
	 * Address Output Field: City
     * The following output fields include variations of city and subcity data.
	 * 
	 * http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?884c807e6e8348a4baf972dd96572b94.html
	 */
	String std_addr_locality = null;
	String std_addr_locality_desc = null;
	String std_addr_locality_full = null;
	String std_addr_locality2 = null;
	String std_addr_locality2_desc = null;
	String std_addr_locality2_full = null;
	String std_addr_locality3 = null;
	String std_addr_locality3_desc = null;
	String std_addr_locality3_full = null;
	String std_addr_locality4 = null;
	String std_addr_locality4_desc = null;
	String std_addr_locality4_full = null;
	String std_addr_locality1_4 = null;
	String std_addr_locality1_4_full = null;
	String std_addr_locality1_2 = null;
	String std_addr_locality1_2_full = null;
	String std_addr_locality3_4 = null;
	String std_addr_locality3_4_full = null;
	String std_addr_locality2_4 = null;
	String std_addr_locality2_4_full = null;
	String std_addr_delinst_full = null;
	
	/*
	 * Address Output Field: Country
	 * 
	 * http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?7b7dc88389df401c8985b5ebdc6c8242.html
	 */
	String std_addr_country_name = null;
	String std_addr_country_2char = null;
	String std_addr_country_3char = null;
	String std_addr_country_3digit = null;
	
	String cause = null;
	
	
	public String getStd_addr_po_box_country_2char()
	{
		return std_addr_po_box_country_2char;
	}
	public void setStd_addr_po_box_country_2char(String std_addr_po_box_country_2char)
	{
		this.std_addr_po_box_country_2char = std_addr_po_box_country_2char;
	}
	public String getStd_addr_po_box_locality_full()
	{
		return std_addr_po_box_locality_full;
	}
	public void setStd_addr_po_box_locality_full(String std_addr_po_box_locality_full)
	{
		this.std_addr_po_box_locality_full = std_addr_po_box_locality_full;
	}
	public String getStd_addr_po_box_delinst_full()
	{
		return std_addr_po_box_delinst_full;
	}
	public void setStd_addr_po_box_delinst_full(String std_addr_po_box_delinst_full)
	{
		this.std_addr_po_box_delinst_full = std_addr_po_box_delinst_full;
	}
	public String getStd_addr_po_box_region()
	{
		return std_addr_po_box_region;
	}
	public void setStd_addr_po_box_region(String std_addr_po_box_region)
	{
		this.std_addr_po_box_region = std_addr_po_box_region;
	}
	public String getStd_addr_po_box_region_full()
	{
		return std_addr_po_box_region_full;
	}
	public void setStd_addr_po_box_region_full(String std_addr_po_box_region_full)
	{
		this.std_addr_po_box_region_full = std_addr_po_box_region_full;
	}
	public String getStd_addr_po_box_region_code()
	{
		return std_addr_po_box_region_code;
	}
	public void setStd_addr_po_box_region_code(String std_addr_po_box_region_code)
	{
		this.std_addr_po_box_region_code = std_addr_po_box_region_code;
	}
	public String getStd_addr_po_box_region2()
	{
		return std_addr_po_box_region2;
	}
	public void setStd_addr_po_box_region2(String std_addr_po_box_region2)
	{
		this.std_addr_po_box_region2 = std_addr_po_box_region2;
	}
	public String getStd_addr_po_box_region2_full()
	{
		return std_addr_po_box_region2_full;
	}
	public void setStd_addr_po_box_region2_full(String std_addr_po_box_region2_full)
	{
		this.std_addr_po_box_region2_full = std_addr_po_box_region2_full;
	}
	public String getStd_addr_po_box_region2_code()
	{
		return std_addr_po_box_region2_code;
	}
	public void setStd_addr_po_box_region2_code(String std_addr_po_box_region2_code)
	{
		this.std_addr_po_box_region2_code = std_addr_po_box_region2_code;
	}
	public String getStd_addr_po_box_postcode_full()
	{
		return std_addr_po_box_postcode_full;
	}
	public void setStd_addr_po_box_postcode_full(String std_addr_po_box_postcode_full)
	{
		this.std_addr_po_box_postcode_full = std_addr_po_box_postcode_full;
	}
	public String getSap_formatted_po_box_postcode()
	{
		return sap_formatted_po_box_postcode;
	}
	public void setSap_formatted_po_box_postcode(String sap_formatted_po_box_postcode)
	{
		this.sap_formatted_po_box_postcode = sap_formatted_po_box_postcode;
	}
	public String getSap_in_fmt_po_box_postcode()
	{
		return sap_in_fmt_po_box_postcode;
	}
	public void setSap_in_fmt_po_box_postcode(String sap_in_fmt_po_box_postcode)
	{
		this.sap_in_fmt_po_box_postcode = sap_in_fmt_po_box_postcode;
	}
	public String getStd_addr_po_box_number()
	{
		return std_addr_po_box_number;
	}
	public void setStd_addr_po_box_number(String std_addr_po_box_number)
	{
		this.std_addr_po_box_number = std_addr_po_box_number;
	}
	public String getStd_addr_po_box_full()
	{
		return std_addr_po_box_full;
	}
	public void setStd_addr_po_box_full(String std_addr_po_box_full)
	{
		this.std_addr_po_box_full = std_addr_po_box_full;
	}
	public String getAddr_po_box_info_code()
	{
		return addr_po_box_info_code;
	}
	public void setAddr_po_box_info_code(String addr_po_box_info_code)
	{
		this.addr_po_box_info_code = addr_po_box_info_code;
	}
	public String getAddr_po_box_info_code_msg()
	{
		return addr_po_box_info_code_msg;
	}
	public void setAddr_po_box_info_code_msg(String addr_po_box_info_code_msg)
	{
		this.addr_po_box_info_code_msg = addr_po_box_info_code_msg;
	}
	public String getAddr_po_box_asmt_info()
	{
		return addr_po_box_asmt_info;
	}
	public void setAddr_po_box_asmt_info(String addr_po_box_asmt_info)
	{
		this.addr_po_box_asmt_info = addr_po_box_asmt_info;
	}
	public String getAddr_po_box_asmt_type()
	{
		return addr_po_box_asmt_type;
	}
	public void setAddr_po_box_asmt_type(String addr_po_box_asmt_type)
	{
		this.addr_po_box_asmt_type = addr_po_box_asmt_type;
	}
	public String getAddr_po_box_asmt_level()
	{
		return addr_po_box_asmt_level;
	}
	public void setAddr_po_box_asmt_level(String addr_po_box_asmt_level)
	{
		this.addr_po_box_asmt_level = addr_po_box_asmt_level;
	}
	public String getAddr_latitude()
	{
		return addr_latitude;
	}
	public void setAddr_latitude(String addr_latitude)
	{
		this.addr_latitude = addr_latitude;
	}
	public String getAddr_longitude()
	{
		return addr_longitude;
	}
	public void setAddr_longitude(String addr_longitude)
	{
		this.addr_longitude = addr_longitude;
	}
	public String getGeo_asmt_level()
	{
		return geo_asmt_level;
	}
	public void setGeo_asmt_level(String geo_asmt_level)
	{
		this.geo_asmt_level = geo_asmt_level;
	}
	public String getGeo_info_code()
	{
		return geo_info_code;
	}
	public void setGeo_info_code(String geo_info_code)
	{
		this.geo_info_code = geo_info_code;
	}
	public String getGeo_info_code_msg()
	{
		return geo_info_code_msg;
	}
	public void setGeo_info_code_msg(String geo_info_code_msg)
	{
		this.geo_info_code_msg = geo_info_code_msg;
	}
	public String getAddr_info_code()
	{
		return addr_info_code;
	}
	public void setAddr_info_code(String addr_info_code)
	{
		this.addr_info_code = addr_info_code;
	}
	public String getAddr_info_code_msg()
	{
		return addr_info_code_msg;
	}
	public void setAddr_info_code_msg(String addr_info_code_msg)
	{
		this.addr_info_code_msg = addr_info_code_msg;
	}
	public String getAddr_asmt_info()
	{
		return addr_asmt_info;
	}
	public void setAddr_asmt_info(String addr_asmt_info)
	{
		this.addr_asmt_info = addr_asmt_info;
	}
	public String getAddr_asmt_type()
	{
		return addr_asmt_type;
	}
	public void setAddr_asmt_type(String addr_asmt_type)
	{
		this.addr_asmt_type = addr_asmt_type;
	}
	public String getAddr_asmt_level()
	{
		return addr_asmt_level;
	}
	public void setAddr_asmt_level(String addr_asmt_level)
	{
		this.addr_asmt_level = addr_asmt_level;
	}
	public String getAddr_change_sig()
	{
		return addr_change_sig;
	}
	
	public void setAddr_change_sig(String addr_change_sig)
	{
		this.addr_change_sig = addr_change_sig;
	}
	public String getAddr_language()
	{
		return addr_language;
	}
	public void setAddr_language(String addr_language)
	{
		this.addr_language = addr_language;
	}
	public String getAddr_address_rem()
	{
		return addr_address_rem;
	}
	public void setAddr_address_rem(String addr_address_rem)
	{
		this.addr_address_rem = addr_address_rem;
	}
	public String getAddr_address_rem2()
	{
		return addr_address_rem2;
	}
	public void setAddr_address_rem2(String addr_address_rem2)
	{
		this.addr_address_rem2 = addr_address_rem2;
	}
	public String getAddr_address_rem3()
	{
		return addr_address_rem3;
	}
	public void setAddr_address_rem3(String addr_address_rem3)
	{
		this.addr_address_rem3 = addr_address_rem3;
	}
	public String getAddr_address_rem4()
	{
		return addr_address_rem4;
	}
	public void setAddr_address_rem4(String addr_address_rem4)
	{
		this.addr_address_rem4 = addr_address_rem4;
	}
	public String getAddr_remainder_full()
	{
		return addr_remainder_full;
	}
	public void setAddr_remainder_full(String addr_remainder_full)
	{
		this.addr_remainder_full = addr_remainder_full;
	}
	public String getAddr_extra()
	{
		return addr_extra;
	}
	public void setAddr_extra(String addr_extra)
	{
		this.addr_extra = addr_extra;
	}
	public String getAddr_extra2()
	{
		return addr_extra2;
	}
	public void setAddr_extra2(String addr_extra2)
	{
		this.addr_extra2 = addr_extra2;
	}
	public String getAddr_extra3()
	{
		return addr_extra3;
	}
	public void setAddr_extra3(String addr_extra3)
	{
		this.addr_extra3 = addr_extra3;
	}
	public String getAddr_extra4()
	{
		return addr_extra4;
	}
	public void setAddr_extra4(String addr_extra4)
	{
		this.addr_extra4 = addr_extra4;
	}
	public String getAddr_remainder_extra_pmb_full()
	{
		return addr_remainder_extra_pmb_full;
	}
	public void setAddr_remainder_extra_pmb_full(String addr_remainder_extra_pmb_full)
	{
		this.addr_remainder_extra_pmb_full = addr_remainder_extra_pmb_full;
	}
	public String getStd_addr_additional_info()
	{
		return std_addr_additional_info;
	}
	public void setStd_addr_additional_info(String std_addr_additional_info)
	{
		this.std_addr_additional_info = std_addr_additional_info;
	}
	public String getStd_addr_additional_info2()
	{
		return std_addr_additional_info2;
	}
	public void setStd_addr_additional_info2(String std_addr_additional_info2)
	{
		this.std_addr_additional_info2 = std_addr_additional_info2;
	}
	public String getStd_addr_additional_info3()
	{
		return std_addr_additional_info3;
	}
	public void setStd_addr_additional_info3(String std_addr_additional_info3)
	{
		this.std_addr_additional_info3 = std_addr_additional_info3;
	}
	public String getStd_addr_additional_info4()
	{
		return std_addr_additional_info4;
	}
	public void setStd_addr_additional_info4(String std_addr_additional_info4)
	{
		this.std_addr_additional_info4 = std_addr_additional_info4;
	}
	public String getStd_addr_additional_info5()
	{
		return std_addr_additional_info5;
	}
	public void setStd_addr_additional_info5(String std_addr_additional_info5)
	{
		this.std_addr_additional_info5 = std_addr_additional_info5;
	}
	public String getStd_addr_additional_info6()
	{
		return std_addr_additional_info6;
	}
	public void setStd_addr_additional_info6(String std_addr_additional_info6)
	{
		this.std_addr_additional_info6 = std_addr_additional_info6;
	}
	public String getStd_addr_single_address()
	{
		return std_addr_single_address;
	}
	public void setStd_addr_single_address(String std_addr_single_address)
	{
		this.std_addr_single_address = std_addr_single_address;
	}
	public String getStd_addr_full_address()
	{
		return std_addr_full_address;
	}
	public void setStd_addr_full_address(String std_addr_full_address)
	{
		this.std_addr_full_address = std_addr_full_address;
	}
	public String getStd_addr_lastline()
	{
		return std_addr_lastline;
	}
	public void setStd_addr_lastline(String std_addr_lastline)
	{
		this.std_addr_lastline = std_addr_lastline;
	}
	public String getStd_addr_block_number()
	{
		return std_addr_block_number;
	}
	public void setStd_addr_block_number(String std_addr_block_number)
	{
		this.std_addr_block_number = std_addr_block_number;
	}
	public String getStd_addr_block_desc()
	{
		return std_addr_block_desc;
	}
	public void setStd_addr_block_desc(String std_addr_block_desc)
	{
		this.std_addr_block_desc = std_addr_block_desc;
	}
	public String getStd_addr_block_full()
	{
		return std_addr_block_full;
	}
	public void setStd_addr_block_full(String std_addr_block_full)
	{
		this.std_addr_block_full = std_addr_block_full;
	}
	public String getStd_addr_wing_name()
	{
		return std_addr_wing_name;
	}
	public void setStd_addr_wing_name(String std_addr_wing_name)
	{
		this.std_addr_wing_name = std_addr_wing_name;
	}
	public String getStd_addr_wing_desc()
	{
		return std_addr_wing_desc;
	}
	public void setStd_addr_wing_desc(String std_addr_wing_desc)
	{
		this.std_addr_wing_desc = std_addr_wing_desc;
	}
	public String getStd_addr_wing_full()
	{
		return std_addr_wing_full;
	}
	public void setStd_addr_wing_full(String std_addr_wing_full)
	{
		this.std_addr_wing_full = std_addr_wing_full;
	}
	public String getStd_addr_stairwell_name()
	{
		return std_addr_stairwell_name;
	}
	public void setStd_addr_stairwell_name(String std_addr_stairwell_name)
	{
		this.std_addr_stairwell_name = std_addr_stairwell_name;
	}
	public String getStd_addr_stairwell_desc()
	{
		return std_addr_stairwell_desc;
	}
	public void setStd_addr_stairwell_desc(String std_addr_stairwell_desc)
	{
		this.std_addr_stairwell_desc = std_addr_stairwell_desc;
	}
	public String getStd_addr_stairwell_full()
	{
		return std_addr_stairwell_full;
	}
	public void setStd_addr_stairwell_full(String std_addr_stairwell_full)
	{
		this.std_addr_stairwell_full = std_addr_stairwell_full;
	}
	public String getStd_addr_floor_number()
	{
		return std_addr_floor_number;
	}
	public void setStd_addr_floor_number(String std_addr_floor_number)
	{
		this.std_addr_floor_number = std_addr_floor_number;
	}
	public String getStd_addr_floor_desc()
	{
		return std_addr_floor_desc;
	}
	public void setStd_addr_floor_desc(String std_addr_floor_desc)
	{
		this.std_addr_floor_desc = std_addr_floor_desc;
	}
	public String getStd_addr_floor_qual()
	{
		return std_addr_floor_qual;
	}
	public void setStd_addr_floor_qual(String std_addr_floor_qual)
	{
		this.std_addr_floor_qual = std_addr_floor_qual;
	}
	public String getStd_addr_floor_full()
	{
		return std_addr_floor_full;
	}
	public void setStd_addr_floor_full(String std_addr_floor_full)
	{
		this.std_addr_floor_full = std_addr_floor_full;
	}
	public String getStd_addr_unit_number()
	{
		return std_addr_unit_number;
	}
	public void setStd_addr_unit_number(String std_addr_unit_number)
	{
		this.std_addr_unit_number = std_addr_unit_number;
	}
	public String getStd_addr_unit_desc()
	{
		return std_addr_unit_desc;
	}
	public void setStd_addr_unit_desc(String std_addr_unit_desc)
	{
		this.std_addr_unit_desc = std_addr_unit_desc;
	}
	public String getStd_addr_unit_qual()
	{
		return std_addr_unit_qual;
	}
	public void setStd_addr_unit_qual(String std_addr_unit_qual)
	{
		this.std_addr_unit_qual = std_addr_unit_qual;
	}
	public String getStd_addr_unit_full()
	{
		return std_addr_unit_full;
	}
	public void setStd_addr_unit_full(String std_addr_unit_full)
	{
		this.std_addr_unit_full = std_addr_unit_full;
	}
	public String getStd_addr_room_number()
	{
		return std_addr_room_number;
	}
	public void setStd_addr_room_number(String std_addr_room_number)
	{
		this.std_addr_room_number = std_addr_room_number;
	}
	public String getStd_addr_room_full()
	{
		return std_addr_room_full;
	}
	public void setStd_addr_room_full(String std_addr_room_full)
	{
		this.std_addr_room_full = std_addr_room_full;
	}
	public String getStd_addr_pmb_full()
	{
		return std_addr_pmb_full;
	}
	public void setStd_addr_pmb_full(String std_addr_pmb_full)
	{
		this.std_addr_pmb_full = std_addr_pmb_full;
	}
	public String getStd_addr_secaddr_no_room()
	{
		return std_addr_secaddr_no_room;
	}
	public void setStd_addr_secaddr_no_room(String std_addr_secaddr_no_room)
	{
		this.std_addr_secaddr_no_room = std_addr_secaddr_no_room;
	}
	public String getStd_addr_secaddr_no_floor()
	{
		return std_addr_secaddr_no_floor;
	}
	public void setStd_addr_secaddr_no_floor(String std_addr_secaddr_no_floor)
	{
		this.std_addr_secaddr_no_floor = std_addr_secaddr_no_floor;
	}
	public String getStd_addr_secaddr_no_floor_room()
	{
		return std_addr_secaddr_no_floor_room;
	}
	public void setStd_addr_secaddr_no_floor_room(String std_addr_secaddr_no_floor_room)
	{
		this.std_addr_secaddr_no_floor_room = std_addr_secaddr_no_floor_room;
	}
	public String getStd_addr_prim_number()
	{
		return std_addr_prim_number;
	}
	public void setStd_addr_prim_number(String std_addr_prim_number)
	{
		this.std_addr_prim_number = std_addr_prim_number;
	}
	public String getStd_addr_prim_number_desc()
	{
		return std_addr_prim_number_desc;
	}
	public void setStd_addr_prim_number_desc(String std_addr_prim_number_desc)
	{
		this.std_addr_prim_number_desc = std_addr_prim_number_desc;
	}
	public String getStd_addr_prim_number_extra()
	{
		return std_addr_prim_number_extra;
	}
	public void setStd_addr_prim_number_extra(String std_addr_prim_number_extra)
	{
		this.std_addr_prim_number_extra = std_addr_prim_number_extra;
	}
	public String getStd_addr_prim_number_full()
	{
		return std_addr_prim_number_full;
	}
	public void setStd_addr_prim_number_full(String std_addr_prim_number_full)
	{
		this.std_addr_prim_number_full = std_addr_prim_number_full;
	}
	public String getStd_addr_prim_name()
	{
		return std_addr_prim_name;
	}
	public void setStd_addr_prim_name(String std_addr_prim_name)
	{
		this.std_addr_prim_name = std_addr_prim_name;
	}
	public String getStd_addr_prim_name_full()
	{
		return std_addr_prim_name_full;
	}
	public void setStd_addr_prim_name_full(String std_addr_prim_name_full)
	{
		this.std_addr_prim_name_full = std_addr_prim_name_full;
	}
	public String getStd_addr_prim_name2()
	{
		return std_addr_prim_name2;
	}
	public void setStd_addr_prim_name2(String std_addr_prim_name2)
	{
		this.std_addr_prim_name2 = std_addr_prim_name2;
	}
	public String getStd_addr_prim_name2_full()
	{
		return std_addr_prim_name2_full;
	}
	public void setStd_addr_prim_name2_full(String std_addr_prim_name2_full)
	{
		this.std_addr_prim_name2_full = std_addr_prim_name2_full;
	}
	public String getStd_addr_prim_name3()
	{
		return std_addr_prim_name3;
	}
	public void setStd_addr_prim_name3(String std_addr_prim_name3)
	{
		this.std_addr_prim_name3 = std_addr_prim_name3;
	}
	public String getStd_addr_prim_name3_full()
	{
		return std_addr_prim_name3_full;
	}
	public void setStd_addr_prim_name3_full(String std_addr_prim_name3_full)
	{
		this.std_addr_prim_name3_full = std_addr_prim_name3_full;
	}
	public String getStd_addr_prim_name4()
	{
		return std_addr_prim_name4;
	}
	public void setStd_addr_prim_name4(String std_addr_prim_name4)
	{
		this.std_addr_prim_name4 = std_addr_prim_name4;
	}
	public String getStd_addr_prim_name4_full()
	{
		return std_addr_prim_name4_full;
	}
	public void setStd_addr_prim_name4_full(String std_addr_prim_name4_full)
	{
		this.std_addr_prim_name4_full = std_addr_prim_name4_full;
	}
	public String getStd_addr_prim_name1_2()
	{
		return std_addr_prim_name1_2;
	}
	public void setStd_addr_prim_name1_2(String std_addr_prim_name1_2)
	{
		this.std_addr_prim_name1_2 = std_addr_prim_name1_2;
	}
	public String getStd_addr_prim_name3_4()
	{
		return std_addr_prim_name3_4;
	}
	public void setStd_addr_prim_name3_4(String std_addr_prim_name3_4)
	{
		this.std_addr_prim_name3_4 = std_addr_prim_name3_4;
	}
	public String getStd_addr_prim_name1_4()
	{
		return std_addr_prim_name1_4;
	}
	public void setStd_addr_prim_name1_4(String std_addr_prim_name1_4)
	{
		this.std_addr_prim_name1_4 = std_addr_prim_name1_4;
	}
	public String getStd_addr_prim_type()
	{
		return std_addr_prim_type;
	}
	public void setStd_addr_prim_type(String std_addr_prim_type)
	{
		this.std_addr_prim_type = std_addr_prim_type;
	}
	public String getStd_addr_prim_type2()
	{
		return std_addr_prim_type2;
	}
	public void setStd_addr_prim_type2(String std_addr_prim_type2)
	{
		this.std_addr_prim_type2 = std_addr_prim_type2;
	}
	public String getStd_addr_prim_type3()
	{
		return std_addr_prim_type3;
	}
	public void setStd_addr_prim_type3(String std_addr_prim_type3)
	{
		this.std_addr_prim_type3 = std_addr_prim_type3;
	}
	public String getStd_addr_prim_type4()
	{
		return std_addr_prim_type4;
	}
	public void setStd_addr_prim_type4(String std_addr_prim_type4)
	{
		this.std_addr_prim_type4 = std_addr_prim_type4;
	}
	public String getStd_addr_prim_prefix()
	{
		return std_addr_prim_prefix;
	}
	public void setStd_addr_prim_prefix(String std_addr_prim_prefix)
	{
		this.std_addr_prim_prefix = std_addr_prim_prefix;
	}
	public String getStd_addr_prim_postfix()
	{
		return std_addr_prim_postfix;
	}
	public void setStd_addr_prim_postfix(String std_addr_prim_postfix)
	{
		this.std_addr_prim_postfix = std_addr_prim_postfix;
	}
	public String getStd_addr_point_of_ref()
	{
		return std_addr_point_of_ref;
	}
	public void setStd_addr_point_of_ref(String std_addr_point_of_ref)
	{
		this.std_addr_point_of_ref = std_addr_point_of_ref;
	}
	public String getStd_addr_point_of_ref2()
	{
		return std_addr_point_of_ref2;
	}
	public void setStd_addr_point_of_ref2(String std_addr_point_of_ref2)
	{
		this.std_addr_point_of_ref2 = std_addr_point_of_ref2;
	}
	public String getStd_addr_point_of_ref1_2()
	{
		return std_addr_point_of_ref1_2;
	}
	public void setStd_addr_point_of_ref1_2(String std_addr_point_of_ref1_2)
	{
		this.std_addr_point_of_ref1_2 = std_addr_point_of_ref1_2;
	}
	public String getStd_addr_area_name()
	{
		return std_addr_area_name;
	}
	public void setStd_addr_area_name(String std_addr_area_name)
	{
		this.std_addr_area_name = std_addr_area_name;
	}
	public String getStd_addr_firm()
	{
		return std_addr_firm;
	}
	public void setStd_addr_firm(String std_addr_firm)
	{
		this.std_addr_firm = std_addr_firm;
	}
	public String getStd_addr_address_delivery()
	{
		return std_addr_address_delivery;
	}
	public void setStd_addr_address_delivery(String std_addr_address_delivery)
	{
		this.std_addr_address_delivery = std_addr_address_delivery;
	}
	public String getStd_addr_address_dual()
	{
		return std_addr_address_dual;
	}
	public void setStd_addr_address_dual(String std_addr_address_dual)
	{
		this.std_addr_address_dual = std_addr_address_dual;
	}
	public String getStd_addr_addr_deldual()
	{
		return std_addr_addr_deldual;
	}
	public void setStd_addr_addr_deldual(String std_addr_addr_deldual)
	{
		this.std_addr_addr_deldual = std_addr_addr_deldual;
	}
	public String getStd_addr_addr_deldual_bldg()
	{
		return std_addr_addr_deldual_bldg;
	}
	public void setStd_addr_addr_deldual_bldg(String std_addr_addr_deldual_bldg)
	{
		this.std_addr_addr_deldual_bldg = std_addr_addr_deldual_bldg;
	}
	public String getStd_addr_primaddr_deldual()
	{
		return std_addr_primaddr_deldual;
	}
	public void setStd_addr_primaddr_deldual(String std_addr_primaddr_deldual)
	{
		this.std_addr_primaddr_deldual = std_addr_primaddr_deldual;
	}
	public String getStd_addr_primaddr_deldual_bldg()
	{
		return std_addr_primaddr_deldual_bldg;
	}
	public void setStd_addr_primaddr_deldual_bldg(String std_addr_primaddr_deldual_bldg)
	{
		this.std_addr_primaddr_deldual_bldg = std_addr_primaddr_deldual_bldg;
	}
	public String getStd_addr_building_name()
	{
		return std_addr_building_name;
	}
	public void setStd_addr_building_name(String std_addr_building_name)
	{
		this.std_addr_building_name = std_addr_building_name;
	}
	public String getStd_addr_building_name2()
	{
		return std_addr_building_name2;
	}
	public void setStd_addr_building_name2(String std_addr_building_name2)
	{
		this.std_addr_building_name2 = std_addr_building_name2;
	}
	public String getStd_addr_building_name1_2()
	{
		return std_addr_building_name1_2;
	}
	public void setStd_addr_building_name1_2(String std_addr_building_name1_2)
	{
		this.std_addr_building_name1_2 = std_addr_building_name1_2;
	}
	public String getStd_addr_prim_address()
	{
		return std_addr_prim_address;
	}
	public void setStd_addr_prim_address(String std_addr_prim_address)
	{
		this.std_addr_prim_address = std_addr_prim_address;
	}
	public String getStd_addr_sec_address()
	{
		return std_addr_sec_address;
	}
	public void setStd_addr_sec_address(String std_addr_sec_address)
	{
		this.std_addr_sec_address = std_addr_sec_address;
	}
	public String getStd_addr_pname_secaddr()
	{
		return std_addr_pname_secaddr;
	}
	public void setStd_addr_pname_secaddr(String std_addr_pname_secaddr)
	{
		this.std_addr_pname_secaddr = std_addr_pname_secaddr;
	}
	public String getStd_addr_postcode_full()
	{
		return std_addr_postcode_full;
	}
	public void setStd_addr_postcode_full(String std_addr_postcode_full)
	{
		this.std_addr_postcode_full = std_addr_postcode_full;
	}
	public String getStd_addr_postcode1()
	{
		return std_addr_postcode1;
	}
	public void setStd_addr_postcode1(String std_addr_postcode1)
	{
		this.std_addr_postcode1 = std_addr_postcode1;
	}
	public String getStd_addr_postcode2()
	{
		return std_addr_postcode2;
	}
	public void setStd_addr_postcode2(String std_addr_postcode2)
	{
		this.std_addr_postcode2 = std_addr_postcode2;
	}
	public String getSap_formatted_postcode()
	{
		return sap_formatted_postcode;
	}
	public void setSap_formatted_postcode(String sap_formatted_postcode)
	{
		this.sap_formatted_postcode = sap_formatted_postcode;
	}
	public String getSap_in_fmt_postcode()
	{
		return sap_in_fmt_postcode;
	}
	public void setSap_in_fmt_postcode(String sap_in_fmt_postcode)
	{
		this.sap_in_fmt_postcode = sap_in_fmt_postcode;
	}
	public String getStd_addr_region()
	{
		return std_addr_region;
	}
	public void setStd_addr_region(String std_addr_region)
	{
		this.std_addr_region = std_addr_region;
	}
	public String getStd_addr_region_full()
	{
		return std_addr_region_full;
	}
	public void setStd_addr_region_full(String std_addr_region_full)
	{
		this.std_addr_region_full = std_addr_region_full;
	}
	public String getStd_addr_region_code()
	{
		return std_addr_region_code;
	}
	public void setStd_addr_region_code(String std_addr_region_code)
	{
		this.std_addr_region_code = std_addr_region_code;
	}
	public String getStd_addr_region2()
	{
		return std_addr_region2;
	}
	public void setStd_addr_region2(String std_addr_region2)
	{
		this.std_addr_region2 = std_addr_region2;
	}
	public String getStd_addr_region2_code()
	{
		return std_addr_region2_code;
	}
	public void setStd_addr_region2_code(String std_addr_region2_code)
	{
		this.std_addr_region2_code = std_addr_region2_code;
	}
	public String getStd_addr_region1_2()
	{
		return std_addr_region1_2;
	}
	public void setStd_addr_region1_2(String std_addr_region1_2)
	{
		this.std_addr_region1_2 = std_addr_region1_2;
	}
	public String getStd_addr_region1_2_full()
	{
		return std_addr_region1_2_full;
	}
	public void setStd_addr_region1_2_full(String std_addr_region1_2_full)
	{
		this.std_addr_region1_2_full = std_addr_region1_2_full;
	}
	public String getStd_addr_locality()
	{
		return std_addr_locality;
	}
	public void setStd_addr_locality(String std_addr_locality)
	{
		this.std_addr_locality = std_addr_locality;
	}
	public String getStd_addr_locality_desc()
	{
		return std_addr_locality_desc;
	}
	public void setStd_addr_locality_desc(String std_addr_locality_desc)
	{
		this.std_addr_locality_desc = std_addr_locality_desc;
	}
	public String getStd_addr_locality_full()
	{
		return std_addr_locality_full;
	}
	public void setStd_addr_locality_full(String std_addr_locality_full)
	{
		this.std_addr_locality_full = std_addr_locality_full;
	}
	public String getStd_addr_locality2()
	{
		return std_addr_locality2;
	}
	public void setStd_addr_locality2(String std_addr_locality2)
	{
		this.std_addr_locality2 = std_addr_locality2;
	}
	public String getStd_addr_locality2_desc()
	{
		return std_addr_locality2_desc;
	}
	public void setStd_addr_locality2_desc(String std_addr_locality2_desc)
	{
		this.std_addr_locality2_desc = std_addr_locality2_desc;
	}
	public String getStd_addr_locality2_full()
	{
		return std_addr_locality2_full;
	}
	public void setStd_addr_locality2_full(String std_addr_locality2_full)
	{
		this.std_addr_locality2_full = std_addr_locality2_full;
	}
	public String getStd_addr_locality3()
	{
		return std_addr_locality3;
	}
	public void setStd_addr_locality3(String std_addr_locality3)
	{
		this.std_addr_locality3 = std_addr_locality3;
	}
	public String getStd_addr_locality3_desc()
	{
		return std_addr_locality3_desc;
	}
	public void setStd_addr_locality3_desc(String std_addr_locality3_desc)
	{
		this.std_addr_locality3_desc = std_addr_locality3_desc;
	}
	public String getStd_addr_locality3_full()
	{
		return std_addr_locality3_full;
	}
	public void setStd_addr_locality3_full(String std_addr_locality3_full)
	{
		this.std_addr_locality3_full = std_addr_locality3_full;
	}
	public String getStd_addr_locality4()
	{
		return std_addr_locality4;
	}
	public void setStd_addr_locality4(String std_addr_locality4)
	{
		this.std_addr_locality4 = std_addr_locality4;
	}
	public String getStd_addr_locality4_desc()
	{
		return std_addr_locality4_desc;
	}
	public void setStd_addr_locality4_desc(String std_addr_locality4_desc)
	{
		this.std_addr_locality4_desc = std_addr_locality4_desc;
	}
	public String getStd_addr_locality4_full()
	{
		return std_addr_locality4_full;
	}
	public void setStd_addr_locality4_full(String std_addr_locality4_full)
	{
		this.std_addr_locality4_full = std_addr_locality4_full;
	}
	public String getStd_addr_locality1_4()
	{
		return std_addr_locality1_4;
	}
	public void setStd_addr_locality1_4(String std_addr_locality1_4)
	{
		this.std_addr_locality1_4 = std_addr_locality1_4;
	}
	public String getStd_addr_locality1_4_full()
	{
		return std_addr_locality1_4_full;
	}
	public void setStd_addr_locality1_4_full(String std_addr_locality1_4_full)
	{
		this.std_addr_locality1_4_full = std_addr_locality1_4_full;
	}
	public String getStd_addr_locality1_2()
	{
		return std_addr_locality1_2;
	}
	public void setStd_addr_locality1_2(String std_addr_locality1_2)
	{
		this.std_addr_locality1_2 = std_addr_locality1_2;
	}
	public String getStd_addr_locality1_2_full()
	{
		return std_addr_locality1_2_full;
	}
	public void setStd_addr_locality1_2_full(String std_addr_locality1_2_full)
	{
		this.std_addr_locality1_2_full = std_addr_locality1_2_full;
	}
	public String getStd_addr_locality3_4()
	{
		return std_addr_locality3_4;
	}
	public void setStd_addr_locality3_4(String std_addr_locality3_4)
	{
		this.std_addr_locality3_4 = std_addr_locality3_4;
	}
	public String getStd_addr_locality3_4_full()
	{
		return std_addr_locality3_4_full;
	}
	public void setStd_addr_locality3_4_full(String std_addr_locality3_4_full)
	{
		this.std_addr_locality3_4_full = std_addr_locality3_4_full;
	}
	public String getStd_addr_locality2_4()
	{
		return std_addr_locality2_4;
	}
	public void setStd_addr_locality2_4(String std_addr_locality2_4)
	{
		this.std_addr_locality2_4 = std_addr_locality2_4;
	}
	public String getStd_addr_locality2_4_full()
	{
		return std_addr_locality2_4_full;
	}
	public void setStd_addr_locality2_4_full(String std_addr_locality2_4_full)
	{
		this.std_addr_locality2_4_full = std_addr_locality2_4_full;
	}
	public String getStd_addr_delinst_full()
	{
		return std_addr_delinst_full;
	}
	public void setStd_addr_delinst_full(String std_addr_delinst_full)
	{
		this.std_addr_delinst_full = std_addr_delinst_full;
	}
	public String getStd_addr_country_name()
	{
		return std_addr_country_name;
	}
	public void setStd_addr_country_name(String std_addr_country_name)
	{
		this.std_addr_country_name = std_addr_country_name;
	}
	public String getStd_addr_country_2char()
	{
		return std_addr_country_2char;
	}
	public void setStd_addr_country_2char(String std_addr_country_2char)
	{
		this.std_addr_country_2char = std_addr_country_2char;
	}
	public String getStd_addr_country_3char()
	{
		return std_addr_country_3char;
	}
	public void setStd_addr_country_3char(String std_addr_country_3char)
	{
		this.std_addr_country_3char = std_addr_country_3char;
	}
	public String getStd_addr_country_3digit()
	{
		return std_addr_country_3digit;
	}
	public void setStd_addr_country_3digit(String std_addr_country_3digit)
	{
		this.std_addr_country_3digit = std_addr_country_3digit;
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
