package com.sap.hana.cloud.samples.dq.api;

import static org.codehaus.jackson.jaxrs.JacksonJaxbJsonProvider.DEFAULT_ANNOTATIONS;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.codehaus.jackson.jaxrs.JacksonJaxbJsonProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sap.hana.cloud.samples.dq.util.CustomObjectMapper;
import com.sap.hana.cloud.samples.dq.util.ErrorResponseExceptionMapper;

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

		if (host != null && account != null)
		{
			retVal = MessageFormat.format(DESTINATION_URL_TEMPLATE, account, host);
		}
		
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
		List<Object> providers = new ArrayList<Object>();
		JacksonJaxbJsonProvider jsonProvider = new JacksonJaxbJsonProvider(new CustomObjectMapper(), DEFAULT_ANNOTATIONS);
		ErrorResponseExceptionMapper srvExMapper = new ErrorResponseExceptionMapper();
		
		providers.add(jsonProvider);
		providers.add(srvExMapper);
		
		if (endPoint != null)
		{
			
			// initialize proxy
			retVal  = JAXRSClientFactory.create(endPoint, DataQualityService.class, providers);
		}
		else
		{
			// local or non-NEO runtime
			// TODO - remove hard-coded URL
			String remoteProxy = "https://dqs{0}.hanatrial.ondemand.com/dqs/api/v1";
			retVal  = JAXRSClientFactory.create(remoteProxy, DataQualityService.class, providers);

		}
		
		return retVal;
	}
}
