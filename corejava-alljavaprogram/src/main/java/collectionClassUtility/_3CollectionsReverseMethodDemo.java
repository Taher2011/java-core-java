package collectionClassUtility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _3CollectionsReverseMethodDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("E");
		list.add("A");
		list.add("D");
		list.add("C");
		list.add("B");
		System.out.println(list);
		Collections.reverse(list);
		System.out.println("reversed " + list);
	}

}
