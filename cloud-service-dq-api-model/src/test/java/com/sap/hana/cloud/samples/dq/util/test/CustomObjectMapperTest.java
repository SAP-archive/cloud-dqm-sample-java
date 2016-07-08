package com.sap.hana.cloud.samples.dq.util.test;


import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sap.hana.cloud.samples.dq.model.AddressCleanseResponse;
import com.sap.hana.cloud.samples.dq.util.CustomObjectMapper;

/**
 * Tests for the {@link CustomObjectMapper} class.  
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ActiveProfiles(profiles = "test")
public class CustomObjectMapperTest
{
	
    @BeforeClass
    public static void oneTimeSetUp() 
	{
		// one-time setup code  
    }
	
	@AfterClass
    public static void oneTimeTearDown() 
	{
        // one-time cleanup code
    }
	
	@Before
	public void setUp() throws Exception 
	{
		// nothing needs to be done here
	}

	@After
	public void tearDown() throws Exception 
	{
		// nothing needs to be done here
	}
	
	/**
	 * Tests JSON de-/serialization
	 */
	@Test
	public void testdeserialization() throws IOException
	{
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream str = classLoader.getResourceAsStream("json/example-response.json");
		final String jsonStr = IOUtils.toString(str, StandardCharsets.UTF_8);
		
		ObjectMapper mapper = new CustomObjectMapper();
		
		AddressCleanseResponse response = mapper.readValue(jsonStr, AddressCleanseResponse.class);
		
		System.out.println(response);
		
	}
}
