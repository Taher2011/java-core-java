package navigableSet;

import java.util.TreeSet;

public class _1NavigableSetMethodDemo {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(1000);
		set.add(2000);
		set.add(3000);
		set.add(4000);
		set.add(5000);
		System.out.println(set);
		System.out.println("ceiling() returns greater than or equal to specified value : " + set.ceiling(2000));
		System.out.println("higher() returns greater than to specified value : " + set.higher(2000));
		System.out.println("floor() returns lesser than or equal to specified value : " + set.floor(5000));
		System.out.println("lower() returns lesser than to specified value : " + set.lower(4000));
		System.out.println("pollFirst() returns and removes the first element  : " + set.pollFirst() + " " + set);
		System.out.println("pollLast() returns and removes the last element  : " + set.pollLast() + " " + set);
		System.out.println("descendingSet() returns reverse value : " + set.descendingSet());
		System.out.println(set);

	}

}
