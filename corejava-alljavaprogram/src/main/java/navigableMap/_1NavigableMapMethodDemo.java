package navigableMap;

import java.util.TreeMap;

public class _1NavigableMapMethodDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(123, "Taher1");
		map.put(456, "Taher2");
		map.put(789, "Taher3");
		map.put(012, "Taher4");
		map.put(345, "Taher5");
		System.out.println(map);
		System.out.println("ceiling() returns greater than or equal to specified value : " + map.ceilingKey(2000));
		System.out.println("higher() returns greater than to specified value : " + map.higherKey(2000));
		System.out.println("floor() returns lesser than or equal to specified value : " + map.floorKey(5000));
		System.out.println("lower() returns lesser than to specified value : " + map.lowerKey(4000));
		System.out.println("pollFirst() returns and removes the first element  : " + map.pollFirstEntry() + " " + map);
		System.out.println("pollLast() returns and removes the last element  : " + map.pollLastEntry() + " " + map);
		System.out.println("descendingmap() returns reverse value : " + map.descendingMap());
		System.out.println(map);
	}

}
