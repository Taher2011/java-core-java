package _03arrayListClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class _03RemoveMethodDemo {

	public static void main(String[] args) {

		Collection<Integer> c = new ArrayList<Integer>();
		c.add(0);
		c.add(3);
		c.add(4);
		c.add(6);
		c.add(3);
		System.out.println(c);
		
		System.out.println(c.remove(3));// It will called Collection interface "public boolean remove(Object o)" method
		System.out.println(c);
	
		System.out.println();
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(0);
		l.add(3);
		l.add(4);
		l.add(6);
		l.add(3);
		System.out.println(l);
		
		System.out.println(l.remove(3));// It will called List interface "public Object remove(int index)" method
		System.out.println(l);
		
		System.out.println();
		
		System.out.println(l.remove(new Integer(3)));// It will called Collection interface "public boolean remove(Object o)" method
		System.out.println(l);
	}

}
