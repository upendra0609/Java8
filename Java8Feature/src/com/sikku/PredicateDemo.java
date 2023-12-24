package com.sikku;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		String str = "predicate";
		String s2 = "qwertt";

		Predicate<String> checkLength = s -> s.length() >= 5;
		System.out.println(checkLength.test(str));

		Predicate<String> checkEvenLength = s -> s.length() % 2 == 0;
		
		
//		predicate join
		System.out.println(checkLength.and(checkEvenLength).test(str));
		System.out.println(checkLength.and(checkEvenLength).test(s2));
		checkLength.negate().and(checkEvenLength).test(str);
		/*
		 * for(int i=0;i<10;i++) { p.test(str); }
		 */
	}

}
