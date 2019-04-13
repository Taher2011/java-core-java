package _10hashSetClass;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class _03NonSycnhronizedToSycnhronizedSetDemo {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set = Collections.synchronizedSet(set);
	}

}
