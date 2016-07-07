package com.sap.hana.cloud.samples.dq.model.output;

/**
 * The geo_info_code_msg, addr_info_code_msg, and addr_po_box_info_code_msg attributes contain a description for the code.
 * 
 * To control the language of the description, in the REST application add a form field to the request header. 
 * Do this by adding <code>Accept-Language:</code> followed by the 2-character language code of one of the supported languages.
 *
 * For example, to return the info code message in German, add <code>Accept-Language: de</code>. 
 * If the Accept-Language is not found or if it is found with a code for an unsupported language, 
 * then the default language of the description is English.
 *	
 *	List of supported languages for the description returned in the message attributes:
 *
 *	Table 1: Supported Languages
 *
 *	Code	Language
 *
 *	da	Danish
 *	de	German
 *	en	English
 *	es	Spanish
 *	fr	French
 *	ja	Japanese
 *	ko	Korean
 *	nl	Dutch
 *	pt	Portuguese
 *	ru	Russian
 *	tr	Turkish
 *	zh	Chinese
 *
 * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?0e3dee04573a4ee48521d0a18fd7860e.html
 */
public enum SupportedLanguages
{
	da, de, en, es, fr, ja, ko, nl, pt, ru, tr, zh
}
