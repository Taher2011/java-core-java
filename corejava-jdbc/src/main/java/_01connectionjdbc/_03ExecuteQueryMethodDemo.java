package _01connectionjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class _03ExecuteQueryMethodDemo {

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {

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

		/* executeQuery() is used for Select Statements and returns ResultSet */
		ResultSet resultSet = statement
				.executeQuery("select * from SYSTEM.TEST");
		while (resultSet.next()) {
			System.out.println("UserId is " + resultSet.getString(1));
			System.out.println("UserName is " + resultSet.getString(2));
		}
		connection.close();
	}
}
