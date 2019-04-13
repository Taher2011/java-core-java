package _07featuresOfJava7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class TryWithoutResourceDemo6 {

	public void tryWithoutResource() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("a.txt"));
			System.out.println(reader.hashCode());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

class TryWithResourceDemo7 {

	public void tryWithResource() {
		try (BufferedReader reader = new BufferedReader(new FileReader("b.txt"));) {
			System.out.println(reader.hashCode());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
	}
}

public class _01TryWithResourcesDemo {

	public static void main(String[] args) {
		TryWithoutResourceDemo6 demo6 = new TryWithoutResourceDemo6();
		demo6.tryWithoutResource();

		TryWithResourceDemo7 demo7 = new TryWithResourceDemo7();
		demo7.tryWithResource();
	}

}
