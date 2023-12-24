package com.sikku;

import java.util.function.Function;

public class FunctionalsDemo {
	public static void main(String[] args) {
		
		Function<Integer, Double> trippleMe = i -> 3.0 * i;
		
		System.out.println(trippleMe.apply(2));

		Function<Integer, Integer> doubleMe = i -> 2 * i;

		Function<Integer, Integer> cubeMe = i -> i * i * i;

		System.out.println(doubleMe.andThen(cubeMe).apply(2));
		System.out.println(doubleMe.compose(cubeMe).apply(2));

		System.out.println(doubleMe.apply(2));

	}

}
