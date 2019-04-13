package _04tryWithMultipleCatchBlocks;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class _01TryWithMultipleCatchDemo {

	public static void main(String[] args) {

		try {
			int i = 10 / 0;
			Class.forName("");
			Connection con = DriverManager.getConnection("DB_URL", "USER",
					"PASS");
			FileOutputStream fos = new FileOutputStream("animal.ser");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ArithmeticException e) {
			// TODO: handle exception
		} catch (SQLException e) {
			// TODO: handle exception
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (NullPointerException e) {
			// TODO: handle exception
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
