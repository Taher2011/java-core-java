package _01connectionjdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class _07CallableStatementStoredProcedureDemo {

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

		CallableStatement callableStatement = connection
				.prepareCall("{call addProcedure(?,?,?)}");
		callableStatement.setInt(1, 100);
		callableStatement.setInt(2, 200);
		callableStatement.registerOutParameter(3, Types.INTEGER);
		callableStatement.execute();
		int result = callableStatement.getInt(3);
		System.out.println("Result is " + result);

		connection.close();
	}

}
