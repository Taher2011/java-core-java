package _03arrayListClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class _04NonSycnhronizedToSycnhronizedListDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list = Collections.synchronizedList(list);
	}

}
