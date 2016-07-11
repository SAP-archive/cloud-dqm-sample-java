package com.sap.hana.cloud.samples.dq.model.output;

/**
 * The <code>StreetFormat</code> to be used within the result.
 */
public enum StreetFormat
{
	/**
	 * Default value. Abbreviate or use the full form of street address components 
	 * based on what is most common for each country.<br />
	 * See <a href="http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?383e9af79fd447d183913887f6d48151.html">countryCommonStyle</a>
	 * 
	 * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?383e9af79fd447d183913887f6d48151.html
	 */
	countryCommonStyle, 
	/**
	 * Abbreviate street type, street prefix/suffix, and secondary designator. 
	 * No punctuation is inserted. Example: <code>100 N Main St Ste 300</code>
	 */
	abbreviateNoPunctuation, 
	/**
	 * Abbreviate street type, street prefix/suffix, and secondary designator. 
	 * Punctuation is inserted for each abbreviated word. Example: <code>100 N. Main St. Ste. 300</code>
	 */
	abbreviateWithPunctuation, 
	/**
	 * Use the full form of street type, street prefix/suffix, and secondary designator. 
	 * Example: <code>100 North Main Street Suite 300</code>
	 */
	expand, 
	/**
	 *  Use the full form of street type and street prefix/suffix; abbreviate secondary designator. 
	 *  No punctuation is inserted. Example: <code>100 North Main Street Ste 300</code>
	 */
	expandPrimaryAbbreviateSecondaryNoPunctuation, 
	/**
	 * Use the full form of street type and street prefix/suffix; abbreviate secondary designator. 
	 * Punctuation is inserted for each abbreviated word. 
	 * Example: <code>100 North Main Street Ste. 300</code>
	 */
	expandPrimaryAbbreviateSecondaryWithPunctuation
	
}
