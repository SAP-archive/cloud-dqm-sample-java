package com.sap.hana.cloud.samples.dq.model;

import java.io.Serializable;

import com.sap.hana.cloud.samples.dq.model.output.AddressSettings;
import com.sap.hana.cloud.samples.dq.model.output.OutputFields;
import com.webcohesion.enunciate.metadata.Label;
import com.webcohesion.enunciate.metadata.json.JsonSeeAlso;

/**
 * The <code>AddressCleanseRequest</code> is used as input parameter for the <code>Cleanse Address</code> microservice.
 * 
 * @label AddressCleanseRequest
 */
@Label("AddressCleanseRequest")
@JsonSeeAlso( { AddressInput.class, AddressSettings.class })
public class AddressCleanseRequest implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The <code>AddressInput</code> object
	 */
	AddressInput addressInput = null;
	
	/**
	 * Array of <code>outputFields</code>
	 * <br />
	 * See <a href="http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?fecc2111811143708ad92bfec8850b4c.html">selecting Address Output Properties</a>
	 */
	String[] outputFields = OutputFields.INFO_STR; // ensure that we have at least information data included 
	
	/**
	 * Configurable address settings 
	 * <br />
	 * See <a href="http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm?dbcab13577474284824c7e278259209f.html">Configurable Address Settings</a>
	 */
	AddressSettings AddressSettings = new AddressSettings(); // apply defaults

	public AddressCleanseRequest() 
	{}
	
	public AddressCleanseRequest(AddressInput addressInput, String[] outputFields)
	{
		this.addressInput = addressInput;
		
		this.outputFields = (outputFields == null ? null : new String[outputFields.length] );
		
		if (outputFields != null && outputFields.length > 0)
		{
			this.outputFields = new String[outputFields.length];
			System.arraycopy(outputFields, 0, this.outputFields, 0, outputFields.length);
		}
	}
	
	public AddressCleanseRequest(AddressInput addressInput, String[] outputFields, AddressSettings addressSettings)
	{
		new AddressCleanseRequest(addressInput, outputFields);
		this.AddressSettings = addressSettings;
	}
	
	public AddressInput getAddressInput()
	{
		return addressInput;
	}

	public void setAddressInput(AddressInput addressInput)
	{
		this.addressInput = addressInput;
	}

	public String[] getOutputFields()
	{
		return outputFields;
	}

	public void setOutputFields(String[] outputFields)
	{
		this.outputFields = outputFields;
	}

	public AddressSettings getAddressSettings()
	{
		return AddressSettings;
	}

	public void setAddressSettings(AddressSettings addressSettings)
	{
		AddressSettings = addressSettings;
	}

}
