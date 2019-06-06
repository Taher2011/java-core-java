package _06polymorphism;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class _04ParentRefChildObjPolymorphismDemo {

	// At runtime if we dont know exact runtime type of object then we should go
	// for parent reference
	public static List testList(List list) {
		if (list instanceof ArrayList) {
			System.out.println("ArrayList");
		} else if (list instanceof LinkedList) {
			System.out.println("LinkedList");
		} else if (list instanceof Stack) {
			System.out.println("Stack");
		} else if (list instanceof Vector) {
			System.out.println("Vector");
		}
		return list;
	}

	public static void main(String[] args) {
		List listAL = new ArrayList();
		List listLL = new LinkedList();
		List listS = new Stack();
		List listV = new Vector();
		_04ParentRefChildObjPolymorphismDemo demo = new _04ParentRefChildObjPolymorphismDemo();

		demo.testList(listAL);
		demo.testList(listLL);
		demo.testList(listS);
		demo.testList(listV);

	}

}
