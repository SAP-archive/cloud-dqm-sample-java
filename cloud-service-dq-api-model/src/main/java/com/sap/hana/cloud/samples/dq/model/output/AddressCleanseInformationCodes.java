package com.sap.hana.cloud.samples.dq.model.output;

public enum AddressCleanseInformationCodes
{
	CODE_1020 ("Address validated in multiple countries"),
	CODE_1030 ("No country identified"),
	CODE_1040 ("Address contains at least one character that is not part of the supported character set"),
	CODE_1060 ("The country identified is not supported"),
	CODE_1080 ("The script identified for the address is not supported"),
	CODE_2000 ("Unable to identify city, region, and/or postcode information"),
	CODE_2010 ("Unable to identify city, and invalid postcode"),
	CODE_2020 ("Unable to identify postcode, and invalid city is preventing address cleansing"),
	CODE_2030 ("Invalid city and postcode are preventing address cleansing"),
	CODE_2040 ("Invalid postcode is preventing a city selection"),
	CODE_2050 ("City, region, and postcode matches are too close to choose one"),
	CODE_2070 ("City is valid, but multiple possible postcodes prevent choosing one"),
	CODE_3000 ("City, region, and postcode are valid, but unable to identify the street address"),
	CODE_3010 ("City, region, and postcode are valid, but unable to match street name to directory"),
	CODE_3020 ("Possible street name matches are too close to choose one"),
	CODE_3030 ("House number is missing on input or not in the directory"),
	CODE_3050 ("An invalid or missing street type is preventing address cleansing"),
	CODE_3060 ("A missing street type and prefix/suffix is preventing address cleansing"),
	CODE_3070 ("An invalid or missing prefix/suffix is preventing address cleansing"),
	CODE_3080 ("An invalid or missing postcode is preventing address cleansing"),
	CODE_3090 ("An invalid or missing city is preventing address cleansing"),
	CODE_3100 ("Possible address matches are too close to choose one"),
	CODE_3110 ("Address conflicts with postcode, and the same street name has a different postcode"),
	CODE_3200 ("The building is missing on input or not in the directory"),
	CODE_3210 ("The building's address is not in the directory"),
	CODE_3220 ("Possible building matches are too close to choose one"),
	CODE_3250 ("The house number or building is missing on input or both are not in the directory"),
	CODE_3300 ("The postcode-only lookup returned multiple street names"),
	CODE_4000 ("The secondary address information is missing on input or not in the directory"),
	CODE_4010 ("Possible secondary address matches are too close to choose one"),
	CODE_4500 ("The organization has not been entered or is not in the directory"),
	CODE_4510 ("The organization's address is not in the directory"),
	CODE_4520 ("Possible organization matches are too close to choose one"),
	CODE_5000 ("The address is valid, but the postal authority classifies this address as undeliverable"),
	CODE_5010 ("The address does not reside in the specified country"),
	CODE_5020 ("The input address is blank"),
	CODE_5030 ("A violation of the country's postal authority assignment rules is preventing address cleansing"),
	CODE_5040 ("A violation of city, region, and postcode assignment rules is preventing address cleansing"),
	CODE_5050 ("The address is an obsolete address and can be matched to multiple addresses"),
	CODE_6000 ("Unclassified address error");
	
	
	String description = null;
	
	private AddressCleanseInformationCodes() {}
	
	private AddressCleanseInformationCodes(String description) 
	{
		this.description = description;
	}
}
