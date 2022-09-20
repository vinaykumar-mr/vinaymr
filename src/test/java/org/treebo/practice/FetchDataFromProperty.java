package org.treebo.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchDataFromProperty {
	public static void main(String[] args) throws IOException {
		
	FileInputStream fis=new FileInputStream("./src/test/resources/CommonData.properties");
	Properties property = new Properties();
	property.load(fis);
	String url = property.getProperty("url").trim();
	String browser = property.getProperty("browser").trim();
	String username = property.getProperty("username");
	Object paas = property.setProperty("pass", "manager");
	System.out.println(username);
	System.out.println(url);
	System.out.println(browser);
	System.out.println(paas);
	
}
}