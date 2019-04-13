package _01connectionjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/* In the case of PreparedStatement while creating object of PreparedStatement
 * we are required to pass Query as parameter, which then sends to DB and query
 * gets compiled.
 * In PreparedStatement, query get compiled once and can be executed multiple times. 
 * Due to this activity Performance is relatively high.
 * PreparedStatement are used for both Static and Dynamic queries.
 * */
public class _06PreparedStatementDemo {

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

		String insertQuery = "INSERT INTO SYSTEM.TEST (USERID, USERNAME, SALARY) VALUES (?, ?, ?)";

		/* Create the PreparedStatement */
		PreparedStatement preparedStatement = connection
				.prepareStatement(insertQuery); // Query got compiled here only
												// once

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("UserId");
			String userId = scanner.next();
			System.out.println("UserName");
			String userName = scanner.next();
			System.out.println("Salary");
			int salary = scanner.nextInt();
			preparedStatement.setString(1, userId);
			preparedStatement.setString(2, userName);
			preparedStatement.setInt(3, salary);
			preparedStatement.executeUpdate(); // Query got executed but not
												// compiled.
												// we can use preparedStatement.execute()
												// and
												// preparedStatement.executeQuery()
			System.out.println("Record inserted successfully.");
			System.out.println("Do you want to insert more records");
			String option = scanner.next();
			if (option.equalsIgnoreCase("no")) {
				break;
			}
		}

		connection.close();
	}

}
