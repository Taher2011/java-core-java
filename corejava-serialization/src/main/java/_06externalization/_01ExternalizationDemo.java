package _06externalization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/* Advantage of Externalizable over Serializable 
 * is that we can save either total object or part 
 * of object i.e. particular variables*/
class Student implements Externalizable {

	String name;
	int id;
	int age = 31;

	public Student() { // public no-arg constructor is must for Externalizable implemented classed because its being called while deserailization
		super();
		System.out.println("No-Arg Constructor");
	}

	public Student(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public void writeExternal(ObjectOutput oo) throws IOException { // It is callback method automatically called by jvm while serialization i.e. at line 55
		oo.writeObject(name);
		oo.writeInt(id);
	}

	public void readExternal(ObjectInput oi) throws IOException,
			ClassNotFoundException { // It is callback method automatically called by jvm while deserialization i.e. at line 59
		name = (String) oi.readObject();
		id = oi.readInt();
	}

}

public class _01ExternalizationDemo {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		Student s1 = new Student("Taher", 123, 30);
		System.out.println("Before Serialization : Name:" + s1.name + " Id:"
				+ s1.id + " Age:" + s1.age);
		FileOutputStream fos = new FileOutputStream("student.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);

		System.out.println();
		
		FileInputStream fis = new FileInputStream("student.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s2 = (Student) ois.readObject();

		System.out.println("After Deserialization : Name:" + s2.name + " Id:"
				+ s2.id + " Age:" + s2.age);
	}
}
