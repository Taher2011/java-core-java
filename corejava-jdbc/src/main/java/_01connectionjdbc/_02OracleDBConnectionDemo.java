package _01connectionjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class _02OracleDBConnectionDemo {

	private static Connection connection;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		/*
		 * It loads and register Driver class. forName() is not responsible for
		 * registering the Driver class but static block inside Driver class is
		 * responsible to register as registerDriver() gets called inside static
		 * block.
		 */
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			/* Establishes the connection */
			connection = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl", "SYSTEM", "SYSTEM");
			if (connection != null) {
				System.out.println("Connected");
			} else {
				System.out.println("Not Connected");
			}

		} catch (Exception e) {
			System.out.println("exception due to " + e.getMessage());
		} finally {
			/* Closed the connection */
			connection.close();
		}

	}
}
