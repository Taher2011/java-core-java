package _06enumerationInterface;

import java.util.Enumeration;
import java.util.Vector;

/*Enumeration can applicable for legacy classes.
 *Limitations is only we can have only read operations 
 *not remove*/
public class _01EnumerationDemo {

	public static void main(String[] args) {

		Vector<String> vector = new Vector<String>();
		vector.add("A");
		vector.add("D");
		vector.add("E");
		vector.add("B");
		System.out.println("Vector " + vector);

		Enumeration<String> enumeration = vector.elements();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			System.out.println(string);
		}

	}

}
