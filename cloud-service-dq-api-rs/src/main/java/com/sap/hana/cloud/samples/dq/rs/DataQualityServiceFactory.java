package com.sap.hana.cloud.samples.dq.rs;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.codehaus.jackson.jaxrs.JacksonJaxbJsonProvider;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataQualityServiceFactory
{
	private static final Logger logger = LoggerFactory.getLogger(DataQualityServiceFactory.class);

	/**
	 * 
	 */
	final static String DESTINATION_URL_TEMPLATE = "https://dqaasu23133c2f-{0}.{1}/dq";

	/**
	 * The HTTP URL of the Data Quality service to be used.
	 */
	final static String endPoint = getEndPoint();

	/**
	 * Returns the URI of the Data Quality  service to be used.
	 * 
	 * @return URI of the Data Quality  service to be used
	 */
	static String getEndPoint()
	{
		String retVal = null;
		
		final String host = System.getenv("HC_HOST");
		final String account = System.getenv("HC_ACCOUNT");

		retVal = MessageFormat.format(DESTINATION_URL_TEMPLATE, account, host);
		
		if (retVal == null)
		{
			logger.error("No API destination with name '{}‘ found!", retVal);			
		}
		else
		{
			if (logger.isInfoEnabled())
			{
				logger.info("API destination: " + retVal);			
			}
		}

		return retVal;
	}


	/**
	 * Returns a reference to the Data Quality service (proxy) to be used. 
	 * 
	 * @return A reference to the Data Quality service (proxy) to be used
	 */
	public DataQualityService getService()
	{
		DataQualityService retVal = null;

		// set up providers
		List<JacksonJsonProvider> providers = new ArrayList<JacksonJsonProvider>();
		JacksonJaxbJsonProvider jsonProvider = new JacksonJaxbJsonProvider();
		providers.add(jsonProvider);
		
		if (endPoint != null)
		{
			// initialize proxy
			retVal  = JAXRSClientFactory.create(endPoint, DataQualityService.class, providers);
		}
		
		return retVal;
	}
}
