package com.sap.hana.cloud.samples.dq.model.output;

/**
 * The <code>ScriptConversion</code> strategy to apply to the result.
 */
public enum ScriptConversion
{
	/**
	 * Default value. Preserve the script. Do not convert. 
	 */
	none,
	/**
	 * Convert the script to Latin. <em>Note:</em> only supported for Chinese, Korean, and Cyrillic!
	 */
	convertToLatin
}
