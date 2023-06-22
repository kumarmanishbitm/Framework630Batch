package com.saucelab.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties properties;
	
	String path = "D:\\Manish\\Framework630batch\\ConfigurationFile\\Config.properties";
	
	// Constructor
	public ReadConfig(){
		
		try{
			
			properties = new Properties();
			FileInputStream fis = new FileInputStream(path);
			properties.load(fis);
			
		}catch(Exception e){
			System.out.println("File not found");
			e.printStackTrace();
		}
	}
	
	// method to read key value from the property file.
	
	public String getBaseURL(){
		String value = properties.getProperty("baseURL");
		if(value!=null)
			return value;
		
		else 
			throw new RuntimeException("URL is not present in property file");
	}
	public String getBrowser(){
		String value = properties.getProperty("browser");
		if(value!=null)
			return value;
		
		else 
			throw new RuntimeException("Browser is not present in property file");
	}
	

}
