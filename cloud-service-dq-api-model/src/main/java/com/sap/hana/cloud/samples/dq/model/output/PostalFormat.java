package com.sap.hana.cloud.samples.dq.model.output;

/**
 * The <code>PostalFormat</code> to be used within the result.
 */
public enum PostalFormat
{
	/**
	 * Default value. Abbreviate or use the full form of the postbox designator 
	 * based on what is most common for each country. <br />
	 * See <a href="http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?383e9af79fd447d183913887f6d48151.html">countryCommonStyle</a>
	 * 
	 * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?383e9af79fd447d183913887f6d48151.html
	 */
	countryCommonStyle,
	/**
	 * Abbreviate the postbox designator. No punctuation is inserted. <code>Example: PO Box 100</code>
	 */
	abbreviateNoPunctuation,
	/**
	 * Abbreviate the postbox designator. Punctuation is inserted for each abbreviated word. 
	 * <code>Example: P.O. Box 100</code>
	 */
	abbreviateWithPunctuation,
	/**
	 * Use the full form of the postbox designator.
	 * <code>Example: Post Office Box 100</code>
	 */
	expand
}
