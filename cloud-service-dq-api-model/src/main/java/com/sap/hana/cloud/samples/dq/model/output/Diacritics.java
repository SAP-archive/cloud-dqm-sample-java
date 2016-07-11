package com.sap.hana.cloud.samples.dq.model.output;

/**
 * The <code>Diacritics</code> strategy to apply to the result.
 */
public enum Diacritics
{
	/**
	 *  Default value. Include diacritical characters. Example: <code>Münchner Str 100</code>
	 */
	include,
	/**
	 * Remove diacritical characters. Example: <code>Muenchner Str 100</code>
	 */
	remove
}
