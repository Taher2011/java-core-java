package com.gl.java.consumer;

import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {

		Consumer<String> c = s -> System.out.println(s);
		
		c.accept("Name is Taher");

	}

}
