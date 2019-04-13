package hashtable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class _2PropertiesDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("prop.properties");
		Properties properties = new Properties();
		properties.load(fis);
		
		System.out.println("User Name is " + properties.get("userName"));
		
		FileOutputStream fos = new FileOutputStream("prop.properties");
		properties.setProperty("userName", "taher123");
		properties.store(fos, "Updated UserName");
		
		System.out.println("User Name is " + properties.get("userName"));
		
		properties.put("domain", "taher123");
		properties.store(fos, "Added domain");

	}

}
