package _01connectionjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class _04ExecuteUpdateMethodDemo {

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

		/* executeUpdate() is used for Non-Select Statements and returns count */
		int insertCount = statement
				.executeUpdate("INSERT INTO SYSTEM.TEST (USERID, USERNAME) VALUES ('TahCSC17', 'TaherAli')");
		System.out.println(insertCount + " row inserted");

		int updateCount = statement
				.executeUpdate("UPDATE SYSTEM.TEST SET USERNAME='TaherAly' WHERE USERID='TahCSC17'");
		System.out.println(updateCount + " row updated");

		int deleteCount = statement
				.executeUpdate("DELETE FROM SYSTEM.TEST WHERE USERID='TahCSC17'");
		System.out.println(deleteCount + " row deleted");

		connection.close();
	}

}
