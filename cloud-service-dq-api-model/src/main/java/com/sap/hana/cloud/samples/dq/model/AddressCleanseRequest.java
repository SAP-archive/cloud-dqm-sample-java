package com.sap.hana.cloud.samples.dq.model;

import java.io.Serializable;

import com.sap.hana.cloud.samples.dq.model.output.AddressSettings;

/**
 * 
 * @see 
 */
public class AddressCleanseRequest implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	AddressInput addressInput = null;
	
	String[] outputFields = null;
	
	AddressSettings AddressSettings = null;

	public AddressCleanseRequest() {}
	
	public AddressCleanseRequest(AddressInput addressInput, String[] outputFields, AddressSettings addressSettings)
	{
		new AddressCleanseRequest(addressInput, outputFields);
		this.AddressSettings = addressSettings;
	}
	
	public AddressCleanseRequest(AddressInput addressInput, String[] outputFields)
	{
		this.addressInput = addressInput;
		
		this.outputFields = (outputFields == null ? null : new String[outputFields.length] );
		
		if (outputFields != null)
		{
			this.outputFields = new String[outputFields.length];
			System.arraycopy(outputFields, 0, this.outputFields, 0, outputFields.length);
		}
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
