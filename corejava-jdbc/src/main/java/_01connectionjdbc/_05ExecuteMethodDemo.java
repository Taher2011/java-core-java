package _01connectionjdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class _05ExecuteMethodDemo {

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException, IOException {

		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection connection = DriverManager.getConnection(
				"jdbc:oracle:thin:@//localhost:1521/orcl.168.1.6", "system",
				"9893AaBb");
		if (connection != null) {
			System.out.println("Connected");
		} else {
			System.out.println("Not Connected");
		}

		/* Create the statement */
		Statement statement = connection.createStatement();

		/* Create Properties file and load */
		Properties properties = new Properties();
		FileInputStream fis = new FileInputStream("queries.properties");
		properties.load(fis);

		/*
		 * If at run time we don't which query will be passed. So we can use
		 * execute(). execute() is used for both Non-Select and Select
		 * Statements and returns boolean. If it returns true then query is
		 * Select Query and if it returns false then query is Non-Select Query
		 */
		boolean result = statement.execute(properties
				.getProperty("UpdateQuery"));

		if (result == true) {
			ResultSet resultSet = statement.getResultSet();
			while (resultSet.next()) {
				System.out.println("UserId is " + resultSet.getString(1)
						+ " and UserName is " + resultSet.getString(2));
			}
		} else {
			int count = statement.getUpdateCount();
			System.out.println(count + " row affected");
		}

		connection.close();
	}
}
