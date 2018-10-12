package com.qa.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.ParseException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {
//Get()

	public void get(String url) throws ParseException, IOException {
		CloseableHttpClient httpClient=HttpClients.createDefault();
		HttpGet httpget=new HttpGet(url);
        CloseableHttpResponse httpresponse =httpClient.execute(httpget);	
        //a.statuscode
        int statuscode = httpresponse.getStatusLine().getStatusCode();
        System.out.println("Status Code----->"+statuscode);
        //b.jsonstring
        String responseString=EntityUtils.toString(httpresponse.getEntity(),"UTF-8");
        JSONObject responsejson=new JSONObject(responseString);
        System.out.println("Response Json from API---->"+responsejson);
        
        //c.allheaders
       Header[] headerarray =httpresponse.getAllHeaders();
       HashMap<String,String> allheaders=new HashMap<String,String>();
       for(Header header:headerarray) {
    	   allheaders.put(header.getName(),header.getValue());
    	   
       }
       System.out.println("all header are "+allheaders);
       
        
	}
	}

			
	


