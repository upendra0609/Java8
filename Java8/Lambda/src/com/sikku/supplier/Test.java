package com.sikku.supplier;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {

	static Supplier<String> s = () -> {
		String otp = "";

		for (int i = 0; i < 6; i++) {

			otp += (int) (Math.random() * 10);
			;
		}
		return otp;
	};

	Predicate<Integer> p = i -> i > 10;

	public static void main(String[] args) {

		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());

	}

}
