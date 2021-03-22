package javaBasics;

import static org.testng.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Arrays;

public class test {
	public static void main(String[] args) throws MalformedURLException, IOException {
        HttpURLConnection huc =  (HttpURLConnection) new URL("https://www.guru99.com/find-broken-links-selenium-webdriver.html").openConnection();
        huc.setRequestMethod("GET");
        huc.connect();
        
        int response=huc.getResponseCode();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(huc.getInputStream()));
            StringBuffer responseBuffer = new StringBuffer();
            String readLine="";
            while ((readLine = in .readLine()) != null) {
            	responseBuffer.append(readLine);
            } in .close();
            // print result
            System.out.println("JSON String Result " + responseBuffer.toString());
        
        System.out.println(response);		
	}
	
	}



