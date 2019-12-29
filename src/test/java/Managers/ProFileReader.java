package Managers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import Initiate.InitiateTest;

public class ProFileReader {
	
	static FileInputStream fis;
	static Properties prop;
	
	public static String getProp(String fileName, String value) throws IOException {
		fis = new FileInputStream("src\\test\\resources\\propertyFiles\\"+fileName+".properties");
		prop = new Properties();
		prop.load(fis);
		return prop.getProperty(value);
	}
	
	public static String getProp(String value) throws IOException {
		fis = new FileInputStream("src\\test\\resources\\propertyFiles\\config.properties");
		prop = new Properties();
		prop.load(fis);
		return prop.getProperty(value);
	}
	
	//Max static --ClassName.function
}
