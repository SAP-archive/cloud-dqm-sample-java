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
	std_addr_address_delivery, 
	std_addr_locality_full, 
	std_addr_region_full, 
	std_addr_postcode_full, 
	std_addr_country_2char,
	std_addr_address_dual,
	std_addr_building_name,
	std_addr_prim_address,
	std_addr_sec_address,
	std_addr_prim_name_full,
	std_addr_prim_number_full,
	std_addr_addr_deldual,
	std_addr_addr_deldual_bldg,
	std_addr_single_address,
}
