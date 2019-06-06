package _12objectCreationWays;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DateFormat;

public class ObjectCreationDemo implements Cloneable {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, CloneNotSupportedException, IOException {

		// By using new operator
		ObjectCreationDemo t1 = new ObjectCreationDemo();

		// By using newInstance()
		ObjectCreationDemo t2 = (ObjectCreationDemo) Class.forName("_12objectCreationWays.ObjectCreationDemo").newInstance();

		// By using Factory method
		Runtime t3a = Runtime.getRuntime();
		DateFormat t3b = DateFormat.getInstance();

		// By using clone method
		ObjectCreationDemo t4a = new ObjectCreationDemo();
		ObjectCreationDemo t4b = (ObjectCreationDemo) t4a.clone();
		
		// By using Deserialization
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ObjectCreationDemo t5 = (ObjectCreationDemo)ois.readObject();
	}

}
