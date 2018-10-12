package com.qa.tests;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.client.RestClient;


public class GetAPITest extends TestBase {
	public TestBase testbase;
	public String baseURL;
	public String apiURL;
	public String url;
	public RestClient restClient;
	//public Properties prop;
	
	@BeforeMethod
	public void setUP(){
		testbase=new TestBase();
		baseURL=prop.getProperty("URL");
		
		apiURL=prop.getProperty("serviceURL");
		url=baseURL+apiURL;
	
	
	}
	
	@Test
	public void getApiTest() throws ClientProtocolException, IOException {
	 restClient=new RestClient();
	 restClient.get(url);
	}

}
