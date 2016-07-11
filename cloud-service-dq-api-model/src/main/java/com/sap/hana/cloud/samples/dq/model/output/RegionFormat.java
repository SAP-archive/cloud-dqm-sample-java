package com.sap.hana.cloud.samples.dq.model.output;

/**
 * The <code>RegionFormat</code> to be used within the result.
 */
public enum RegionFormat
{
	/**
	 * Default value. Abbreviate or use the full form of the region based on what is most common for each country.<br />
	 * See <a href="http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?383e9af79fd447d183913887f6d48151.html">countryCommonStyle</a>
	 * 
	 * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?383e9af79fd447d183913887f6d48151.html
	 */
	countryCommonStyle,
	/**
	 * Abbreviate the region. Example: <code>CA</code>
	 */
	abbreviate,
	/**
	 * Use the full region name. Example: <code>California</code>
	 */
	expand
}
