package com.sap.hana.cloud.samples.dq.model.output;

/**
 * The <code>Casing</code> strategy to apply to the result.
 */
public enum Casing
{
	/**
	 * Default value. Use mixed case. Example: <code>100 Main St</code>
	 */
	mixed,
	/**
	 * Use all upper case. Example: <code>100 MAIN ST</code>
	 */
	upper
}
