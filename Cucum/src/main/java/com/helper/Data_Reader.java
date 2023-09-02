package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Data_Reader {

	public static Properties p = new Properties();

	public Data_Reader() throws IOException {

		File f = new File(
				"C://Users//91960//eclipse-workspace//Cucum//src//main//java//com//propertyfile//Orange.properties");

		FileInputStream fis = new FileInputStream(f);

		p.load(fis);

	}

	public String getprourl() {

		String url = p.getProperty("Url");
        return url;
	}
    public String getprousername() {
    	
    	
    	String username = p.getProperty("Username");
    	
    	return username;
    }
    
    
    public String getpropassword() {
    	
    	String password = p.getProperty("Password");
    	
    	return password;
    }
}
