package treebo.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

/**
 * This class consists reusable method to  handle property file
 * @author nadaf
 *
 */
public class FileUtility {
	Properties properties;
	/**
	 * This method is used to fetch the data from property file
	 * @param key
	 * @param  
	 * @param string 
	 * @return
	 * @throws IOException 
	 */
	public String getDataFromPropertyFile(String key) throws IOException {


		String value = properties.getProperty(key).trim();
		return value;
	}

	public void initilizePropertyFile(String propertyFilePath) throws IOException
	{
		FileInputStream fis = new FileInputStream(propertyFilePath); 
		properties = new Properties();
		properties.load(fis);

	}

}
