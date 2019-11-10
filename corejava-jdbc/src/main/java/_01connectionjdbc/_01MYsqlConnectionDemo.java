package _01connectionjdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

class PropertyConstant {

	private PropertyConstant() {
		super();
	}

	public static final String URL = "DB.URL";
	public static final String USERNAME = "DB.USERNAME";
	public static final String PASSWORD = "DB.PASSWORD";
	public static final String DRIVERNAME = "DB.DRIVERNAME";
}

class PropertyUtils {

	private PropertyUtils() {
		super();
	}

	static Properties properties;

	public static void loadPropertyFile() throws IOException {

		try (InputStream inputStream = PropertyUtils.class.getClassLoader().getResourceAsStream("config.properties")) {
			if (inputStream == null) {
				System.out.println("Sorry, unable to find config.properties");
				return;
			}
			properties = new Properties();
			// load a properties file from class path, inside static method
			properties.load(inputStream);
		}
	}

	public static Object get(String key) {
		Object value = null;
		if (key != null) {
			value = properties.get(key);
		}
		return value;
	}

	public static String getProperty(String key) {
		return (String) PropertyUtils.get(key);
	}
}

public class _01MYsqlConnectionDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		PropertyUtils.loadPropertyFile();
		Class.forName(PropertyUtils.getProperty(PropertyConstant.DRIVERNAME));
		Connection connection = DriverManager.getConnection(PropertyConstant.URL, PropertyConstant.USERNAME,
				PropertyConstant.PASSWORD);
		if (connection != null) {
			System.out.println("Connected");
		} else {
			System.out.println("Not Connected");
		}
	}

}