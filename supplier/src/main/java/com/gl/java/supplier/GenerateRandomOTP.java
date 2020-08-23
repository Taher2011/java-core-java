package com.gl.java.supplier;

import java.util.function.Supplier;

public class GenerateRandomOTP {

	public static void main(String[] args) {

		Supplier<String> s = () -> {
			String otp = "";
			for (int i = 1; i <= 6; i++) {
				otp = otp + (int) (Math.random() * 10);
			}
			return otp;
		};
		
		System.out.println("OTP is " + s.get());
	}

}
