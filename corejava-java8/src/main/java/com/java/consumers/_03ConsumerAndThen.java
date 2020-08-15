package com.java.consumers;

import java.util.function.Consumer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Movie {

	private String name;

	public Movie(String name) {
		this.name = name;
	}

}

public class _03ConsumerAndThen {

	public static void main(String[] args) {

		Consumer<Movie> c1 = m -> System.out.println(m.getName() + " ready to release");
		Consumer<Movie> c2 = m -> System.out.println(m.getName() + " is now relaeased");
		Consumer<Movie> c3 = m -> System.out.println(m.getName() + " is bigger flop now");
		Consumer<Movie> c4 = c1.andThen(c2).andThen(c3);
		Movie m = new Movie("Saaho");
		c4.accept(m);

	}

}
