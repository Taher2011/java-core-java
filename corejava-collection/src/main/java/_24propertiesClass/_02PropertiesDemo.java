package _24propertiesClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/* In normal map like HashMap, HashTable, TreeMap key and value
 * can be any type. But in the case of Properties key and value
 * should be String type.
 * We can use java properties object to hold properties which 
 * are coming from properties file. 
 */

public class _02PropertiesDemo {

	public void dbConnect(Properties properties) throws Exception {

		Class.forName(properties.getProperty("DBClassName"));
		String dbUrl = properties.getProperty("DBUrl");
		String dbUserName = properties.getProperty("DBUserName");
		String dbPassword = properties.getProperty("DBPassword");
		Connection connection = DriverManager.getConnection(dbUrl, dbUserName,
				dbPassword);
		if (connection != null) {
			System.out.println("Connected");
			System.out.println(connection.getClass().getName());
		} else {
			System.out.println("Not Connected");
		}

	}

	public static void main(String[] args) throws Exception {
		Properties properties = new Properties();
		FileInputStream fis = new FileInputStream("dbconnection.txt");
		properties.load(fis);
		System.out.println(properties);
		try {
			new _02PropertiesDemo().dbConnect(properties);
		} catch (Exception e) {
			System.out.println(e);
		}
		properties.setProperty("DBUserName", "system");
		properties.store(new FileOutputStream("dbconnection.txt"),
				"Added by tali");
	}

}
