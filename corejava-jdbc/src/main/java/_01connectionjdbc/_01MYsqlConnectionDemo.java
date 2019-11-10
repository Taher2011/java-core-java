package _01connectionjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class _01DB2DBConnectionTest {

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		Class.forName("com.ibm.db2.jcc.DB2Driver");
		Connection connection = DriverManager.getConnection(
				"jdbc:db2://localhost:1521/orcl.168.1.6", "system",
				"9893AaBb");
		if (connection != null) {
			System.out.println("Connected");
		} else {
			System.out.println("Not Connected");
		}
	}

}