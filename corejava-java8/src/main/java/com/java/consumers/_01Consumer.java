package com.java.consumers;

import java.util.function.Consumer;

public class _01Consumer {

	public static void main(String[] args) {
		
		Consumer<String> c = s->System.out.println(s);
		c.accept("Taher");

	}

}
