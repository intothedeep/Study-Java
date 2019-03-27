package ch15_collection_framework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path, "utf-8");
		System.out.println(path);
		
		properties.load(new FileReader(path));
		String driver = properties.getProperty("driver");
		
		System.out.println("driver: " + driver);
		
	}
}
