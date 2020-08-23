package com.gl.java.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
class User {

	private String userName;
	private String password;

}

public class UserAuthentication {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.println("Enter User Name:");
		String userName = sc.next();
		System.out.println("Enter Password:");
		String password = sc.next();

		User user = new User(userName, password);

		vaildateUser(user);

	}

	private static void vaildateUser(User user) {

		Predicate<User> p = u -> u.getUserName().equalsIgnoreCase("tali") && u.getPassword().equals("1234");

		if (p.test(user)) {
			System.out.println("User authentication passed");
		} else {
			System.out.println("User authentication failed");
		}
	}

}
