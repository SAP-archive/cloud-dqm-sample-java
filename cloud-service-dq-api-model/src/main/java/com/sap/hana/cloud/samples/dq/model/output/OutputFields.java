package com.sap.hana.cloud.samples.dq.model.output;

/**
 * You control which properties are returned in the response JSON object by 
 * listing the desired property names as a list of strings in the outputFields 
 * array in the payload.
 * 
 * When properties do not have values, they are returned in the response JSON 
 * object with a blank string or a null.
 * 
 * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?0de2f71840434392bbb48ea7304c6a19.html
 * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?fecc2111811143708ad92bfec8850b4c.html
 */
public enum OutputFields
{
	/*
	 * Address Output Field: Postbox for SAP Business Suite
     * The following output fields are specifically for applications that consume postbox address data in the SAP Business Suite data model.
     * 
     * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?f4b8ee5c3d354abfa1cd2356c16334e4.html
	 */
	std_addr_po_box_country_2char,
	std_addr_po_box_locality_full,
	std_addr_po_box_delinst_full,
	std_addr_po_box_region,
	std_addr_po_box_region_full,
	std_addr_po_box_region_code,
	std_addr_po_box_region2,
	std_addr_po_box_region2_full,
	std_addr_po_box_region2_code,
	std_addr_po_box_postcode_full,
	sap_formatted_po_box_postcode,
	sap_in_fmt_po_box_postcode,
	std_addr_po_box_number,
	std_addr_po_box_full,
	addr_po_box_info_code,
	addr_po_box_info_code_msg,
	addr_po_box_asmt_info,
	addr_po_box_asmt_type,
	addr_po_box_asmt_level,
	
	/*
	 * Address Output Field: GeoLocation Coordinates
     * The following output fields include properties regarding geo-location coordinates for the address.
     * Note that when sending a request with input fields in the SAP Business Suite data model, the geo-location 
     * coordinates are returned only for the street address, not the postbox address.
     * 
     * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?c5e4334965ff4a5e9233e76cc650a975.html
	 */
	addr_latitude("The latitude for the address."),
	addr_longitude("The longitude for the address"),
	geo_asmt_level("Indicates the level that the geo-location coordinates represent the actual location of the address."),
	geo_info_code("Generated when the process is unable to assign geo-location coordinates or when something potentially suspect occurs during the assignment."),
	geo_info_code_msg("Description for the geo_info_code."),
	
	/*
	 * Address Output Field: Assignment Codes
	 * The following output fields contain codes that provide insight into the process that assigns the address to reference data.
	 * 
	 * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?3fff045179fc442d94845458b37184db.html
	 */
	addr_info_code,
	addr_info_code_msg,
	addr_asmt_info,
	addr_asmt_type,
	addr_asmt_level,
	addr_change_significance,
	addr_language,
	
	/*
	 * Address Output Field: Non-Address
     * The following output fields include non-address data encountered with the address data.
     * 
     * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?9bdfcec363d345c2ad2a16fab50d1fa9.html
	 */
	addr_address_rem,
	addr_address_rem2,
	addr_address_rem3,
	addr_address_rem4,
	addr_remainder_full,
	addr_extra,
	addr_extra2,
	addr_extra3,
	addr_extra4,
	addr_remainder_extra_pmb_full,
	
	/*
	 * Address Output Field: Country-Specific
	 * The following output fields include information related to address data that is unique to an individual country.
	 * 
	 * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?8e60124732a14c808c47ead641dab562.html
	 */
	std_addr_additional_info,
	std_addr_additional_info2,
	std_addr_additional_info3,
	std_addr_additional_info4,
	std_addr_additional_info5,
	std_addr_additional_info6,
	
	/*
	 * Address Output Field: Composite
	 * The following output fields include composite address data.
	 * 
	 * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?f9ed501f6edc45deabcd4d6b770bb71b.html
	 */
	std_addr_single_address,
	std_addr_full_address,
	std_addr_lastline,
	
	/*
	 * Address Output Field: Secondary
     * The following output fields include variations of secondary address data.
     * 
     * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?49ba6af01c1d40bf8fa42cc3b0fea52e.html
	 */
	std_addr_block_number,
	std_addr_block_desc,
	std_addr_block_full,
	std_addr_wing_name,
	std_addr_wing_desc,
	std_addr_wing_full,
	std_addr_stairwell_name,
	std_addr_stairwell_desc,
	std_addr_stairwell_full,
	std_addr_floor_number,
	std_addr_floor_desc,
	std_addr_floor_qual,
	std_addr_floor_full,
	std_addr_unit_number,
	std_addr_unit_desc,
	std_addr_unit_qual,
	std_addr_unit_full,
	std_addr_room_number,
	std_addr_room_full,
	std_addr_pmb_full,
	std_addr_secaddr_no_room,
	std_addr_secaddr_no_floor,
	std_addr_secaddr_no_floor_room,
	
	/*
	 * Address Output Field: House Number
     * The following output fields include variations of house number data.
     * <code>std_addr_prim_number</code> -	The house number for a street address, such as “100” in the address “100 Main St”. For postbox addresses such as “PO Box 500” it contains the box number “500”, and for rural addresses such as “RR 1” it contains the route number “1”.
     * <code>std_addr_prim_number_desc</code> -	The number descriptor. For example, in the Mexico address “Km 12” the descriptor is “Km”, and in the Japanese address “4号” the descriptor is “号”.
     * <code>std_addr_prim_number_extra</code> -	Data that is found attached to or near the house number. For example, in the address “100A Main St” the extra data is “A”, and in the ranged address “31-41 Main St” the extra data is “-41”.
     * <code>std_addr_prim_number_full</code> -	The combination of the house number, the descriptor, and the extra data. Using the previous examples, the full values would be “Km 12”, “4号”, “100A”, and “31-41”.
	 *
	 * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?1334e130a9c04a5e9f420e4a6bd90a8d.html
	 */
	std_addr_prim_number,
	std_addr_prim_number_desc,
	std_addr_prim_number_extra,
	std_addr_prim_number_full,
	
	/*
	 * Address Output Field: Street
     * The following output fields include variations of street data.
	 * Addresses in countries that have street addresses with only one level 
	 * of street information, such as United States and Germany, will return the 
	 * street name in the std_addr_prim_name property, the street type such as street, 
	 * avenue, and road in the std_addr_prim_type property, and the directional word 
	 * such as north and southwest in the std_addr_prim_prefix or std_addr_prim_postfix 
	 * property.
	 * 
	 * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?e8ad3bce96c84f21a6e9f35e4a97adb2.html
	 */
	std_addr_prim_name,
	std_addr_prim_name_full,
	std_addr_prim_name2,
	std_addr_prim_name2_full,
	std_addr_prim_name3,
	std_addr_prim_name3_full,
	std_addr_prim_name4,
	std_addr_prim_name4_full,
	std_addr_prim_name1_2,
	std_addr_prim_name3_4,
	std_addr_prim_name1_4,
	std_addr_prim_type,
	std_addr_prim_type2,
	std_addr_prim_type3,
	std_addr_prim_type4,
	std_addr_prim_prefix,
	std_addr_prim_postfix,
	
	/*
	 * Address Output Field: Extended Address
     * The following output fields include extended address data.
     * The std_addr_point_of_ref and std_addr_area_name properties are often seen in 
     * addresses in India but not in other countries. Examples of point of references are 
     * “Behind Grand Hotel” and “Near Industrial Complex”, and examples of area names 
     * are “HREC Industrial Area” and “Pramuri Industrial Estate”.
     * The std_addr_firm property contains the organization name retrieved from the address 
     * reference data. Be aware that the reference data may contain some unusual or shortened 
     * spellings that may or may not be found suitable. It is not recommended that these 
     * organization names are used except for very specific situations.
     *  
     *  @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?35dfab3b3dd74022986b4b9cf558bb55.html
	 */
	std_addr_point_of_ref,
	std_addr_point_of_ref2,
	std_addr_point_of_ref1_2,
	std_addr_area_name,
	std_addr_firm,
	
	/*
	 * Address Output Fields: Address
	 * The following output fields include various forms of address data.
	 * 
	 * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?4b7c1d6d6a1f4143a9b38be21544ab51.html
	 */
	std_addr_address_delivery,
	std_addr_address_dual,
	std_addr_addr_deldual,
	std_addr_addr_deldual_bldg,
	std_addr_primaddr_deldual,
	std_addr_primaddr_deldual_bldg,
	std_addr_building_name,
	std_addr_building_name2,
	std_addr_building_name1_2,
	std_addr_prim_address,
	std_addr_sec_address,
	std_addr_pname_secaddr,
	
	/*
	 * Address Output Field: Postcode
	 * The following output fields include variations of postcode data.
	 * 
	 * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?b0447f116bb24b73afd9a2a87c021538.html
     */
	std_addr_postcode_full,
	std_addr_postcode1,
	std_addr_postcode2,
	sap_formatted_postcode,
	sap_in_fmt_postcode,
	 
	
	/*
	 * Address Output Field: Region
	 * The following output fields include variations of region (state, province, 
	 * territory, prefecture, etc.) and subregion (county, district, etc.) data.
	 * 
	 * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?1ff518052ed044e79c6e9b802cb3cb22.html
	 */
	std_addr_region,
	std_addr_region_full,
	std_addr_region_code,
	std_addr_region2,
	std_addr_region2_code,
	std_addr_region1_2,
	std_addr_region1_2_full,
	
	/*
	 * Address Output Field: City
     * The following output fields include variations of city and subcity data.
	 * 
	 * http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?884c807e6e8348a4baf972dd96572b94.html
	 */
	std_addr_locality,
	std_addr_locality_desc,
	std_addr_locality_full,
	std_addr_locality2,
	std_addr_locality2_desc,
	std_addr_locality2_full,
	std_addr_locality3,
	std_addr_locality3_desc,
	std_addr_locality3_full,
	std_addr_locality4,
	std_addr_locality4_desc,
	std_addr_locality4_full,
	std_addr_locality1_4,
	std_addr_locality1_4_full,
	std_addr_locality1_2,
	std_addr_locality1_2_full,
	std_addr_locality3_4,
	std_addr_locality3_4_full,
	std_addr_locality2_4,
	std_addr_locality2_4_full,
	std_addr_delinst_full,
	
	/*
	 * Address Output Field: Country
	 * 
	 * http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?7b7dc88389df401c8985b5ebdc6c8242.html
	 */
	std_addr_country_name("Spelled-out country name in the language for the country"),
	std_addr_country_2char("2-character ISO country code"),
	std_addr_country_3char("3-character ISO country code"),
	std_addr_country_3digit("3-digit ISO country code");	
	
	String description = null;
	
	private OutputFields()
	{
	}
	
	private OutputFields(String description)
	{
		this.description = description;
	}
	
	public static final String[] INFO_STR = new String[] { addr_info_code.toString(), 
													   addr_info_code_msg.toString(), 
													   addr_asmt_info.toString(), 
													   addr_asmt_type.toString(), 
													   addr_asmt_level.toString(), 
													   addr_change_significance.toString(), 
													   addr_language.toString() };
	
	
	
}
