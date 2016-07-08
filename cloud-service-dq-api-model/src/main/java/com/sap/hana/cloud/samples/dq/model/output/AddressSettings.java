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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("AddressSettings [casing=").append(casing).append(", diacritics=").append(diacritics)
		        .append(", scriptConversion=").append(scriptConversion).append(", streetFormat=").append(streetFormat)
		        .append(", postalFormat=").append(postalFormat).append(", regionFormat=").append(regionFormat)
		        .append("]");
		return builder.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((casing == null) ? 0 : casing.hashCode());
		result = prime * result + ((diacritics == null) ? 0 : diacritics.hashCode());
		result = prime * result + ((postalFormat == null) ? 0 : postalFormat.hashCode());
		result = prime * result + ((regionFormat == null) ? 0 : regionFormat.hashCode());
		result = prime * result + ((scriptConversion == null) ? 0 : scriptConversion.hashCode());
		result = prime * result + ((streetFormat == null) ? 0 : streetFormat.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		AddressSettings other = (AddressSettings) obj;
		if (casing != other.casing) return false;
		if (diacritics != other.diacritics) return false;
		if (postalFormat != other.postalFormat) return false;
		if (regionFormat != other.regionFormat) return false;
		if (scriptConversion != other.scriptConversion) return false;
		if (streetFormat != other.streetFormat) return false;
		return true;
	}
}
