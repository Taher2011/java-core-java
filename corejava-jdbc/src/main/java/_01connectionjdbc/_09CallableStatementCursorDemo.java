package _01connectionjdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.OracleTypes;

public class _09CallableStatementCursorDemo {

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
				.prepareCall("{call getAllEmpInforProcedure(?)}");
		callableStatement.registerOutParameter(1, OracleTypes.CURSOR);
		callableStatement.execute();
		ResultSet resultSet = (ResultSet) callableStatement.getObject(1);
		boolean flag = false;
		while (resultSet.next()) {
			flag = true;
			System.out.println("UserId " + resultSet.getString(1)
					+ " , UserName " + resultSet.getString(2) + " , Salary "
					+ resultSet.getInt(3));
		}
		if (flag == false) {
			System.out.println("No records present");
		}
		connection.close();
	}

}
