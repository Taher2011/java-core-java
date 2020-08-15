package com.java.bypredicates;

import java.util.function.BiPredicate;

public class _01ByPredicate {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> p = (a,b)-> (a+b)/2==0;
		System.out.println(p.test(3, 8));
		
	}

}
