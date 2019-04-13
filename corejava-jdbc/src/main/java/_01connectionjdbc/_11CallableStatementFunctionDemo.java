package _01connectionjdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class _11CallableStatementFunctionDemo {

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
				.prepareCall("{? = call averageSalary(?,?)}");
		callableStatement.setString(2, "Taher1985");
		callableStatement.setString(3, "TahJIT03");
		callableStatement.registerOutParameter(1, Types.FLOAT);
		callableStatement.execute();
		System.out.println(callableStatement.getFloat(1));
		connection.close();
	}

}
