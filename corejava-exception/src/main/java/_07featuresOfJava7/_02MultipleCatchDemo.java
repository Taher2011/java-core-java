package _07featuresOfJava7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

class TryWithoutMultipleCatchDemo6 {

	public void tryWithoutMultipleCatch() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("a.txt"));
			System.out.println(reader.hashCode());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}

class TryWithMultipleCatchDemo7 {

	public void tryWithMultipleCatch() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("b.txt"));
			System.out.println(reader.hashCode());
		} catch (FileNotFoundException | ArithmeticException
				| IllegalStateException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}

public class _02MultipleCatchDemo {

	public static void main(String[] args) {
		TryWithoutMultipleCatchDemo6 demo6 = new TryWithoutMultipleCatchDemo6();
		demo6.tryWithoutMultipleCatch();

		TryWithMultipleCatchDemo7 demo7 = new TryWithMultipleCatchDemo7();
		demo7.tryWithMultipleCatch();

	}

}
