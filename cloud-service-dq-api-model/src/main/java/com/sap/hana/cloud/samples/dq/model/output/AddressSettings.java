package com.sap.hana.cloud.samples.dq.model.output;

/**
 * You may control the format of the cleansed address by including the
 * <code>AddressSettings</code> object in the payload. When the addressSettings
 * object is omitted, the cleansed address is standardized according to the
 * default format values, shown here.
 * 
 * When including the addressSettings object, you only need to include the
 * settings that you want to standardize differently than the default format.
 * For example, to accept the default formats for all settings except the street
 * format, send the request with only the streetFormat setting with your
 * preferred format value.
 * 
 * @see http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?dbcab13577474284824c7e278259209f.html
 */
public class AddressSettings
{
	Casing casing = Casing.mixed;
	Diacritics diacritics = Diacritics.include;
	ScriptConversion scriptConversion = ScriptConversion.none;
	StreetFormat streetFormat = StreetFormat.countryCommonStyle;
	PostalFormat postalFormat = PostalFormat.countryCommonStyle;
	RegionFormat regionFormat = RegionFormat.countryCommonStyle;

	public Casing getCasing()
	{
		return casing;
	}

	public void setCasing(Casing casing)
	{
		this.casing = casing;
	}

	public Diacritics getDiacritics()
	{
		return diacritics;
	}

	public void setDiacritics(Diacritics diacritics)
	{
		this.diacritics = diacritics;
	}

	public ScriptConversion getScriptConversion()
	{
		return scriptConversion;
	}

	public void setScriptConversion(ScriptConversion scriptConversion)
	{
		this.scriptConversion = scriptConversion;
	}

	public StreetFormat getStreetFormat()
	{
		return streetFormat;
	}

	public void setStreetFormat(StreetFormat streetFormat)
	{
		this.streetFormat = streetFormat;
	}

	public PostalFormat getPostalFormat()
	{
		return postalFormat;
	}

	public void setPostalFormat(PostalFormat postalFormat)
	{
		this.postalFormat = postalFormat;
	}

	public RegionFormat getRegionFormat()
	{
		return regionFormat;
	}

	public void setRegionFormat(RegionFormat regionFormat)
	{
		this.regionFormat = regionFormat;
	}
}
