package _01connectionjdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class _08CallableStatementStoredProcedureDemo {

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
				.prepareCall("{call getEmpInforProcedure(?,?,?)}");
		callableStatement.setString(1, "Taher1985");
		callableStatement.registerOutParameter(2, Types.VARCHAR);
		callableStatement.registerOutParameter(3, Types.NUMERIC);
		callableStatement.execute();
		String userName = callableStatement.getString(2);
		int salary = callableStatement.getInt(3);
		System.out.println("UserName is " + userName + " and Salary is "
				+ salary);

		connection.close();
	}

}
