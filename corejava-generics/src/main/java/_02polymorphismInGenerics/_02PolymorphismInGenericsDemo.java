package _02polymorphismInGenerics;

import java.util.ArrayList;
import java.util.List;

public class _02PolymorphismInGenericsDemo {

	public void genericList(List<List> list) {
		System.out.println("List<List> list argument method called");
	}

	public void genericList(ArrayList<ArrayList> arrayList) {
		System.out.println("ArrayList<List> arrayList argument method called");
	}

	public static void main(String[] args) {

		_02PolymorphismInGenericsDemo obj = new _02PolymorphismInGenericsDemo();

		List<ArrayList> list1 = new ArrayList<>();
		// obj.genericList(list1); // method genericList(List<List>) in the type
		// _02PolymorphismInGenericsDemo is not applicable for the arguments
		// (List<ArrayList>)

		List<List> list2 = new ArrayList<>();
		obj.genericList(list2);

		ArrayList<List> list3 = new ArrayList<>();
		obj.genericList(list3);

		ArrayList<ArrayList> list4 = new ArrayList<>();
		obj.genericList(list4);
	}

}
