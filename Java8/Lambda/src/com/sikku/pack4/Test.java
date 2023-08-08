package com.sikku.pack4;

import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		Predicate<Integer> p1 = i -> i > 10;
		Predicate<Integer> p2 = i -> i % 2==0;
		
		int[] x = {0,5,10,15,20,25,30};
		m1(p1,x);
		System.out.println();
		m1(p2,x);
		System.out.println();
		m1(p1.and(p2),x);
		System.out.println();
		m1(p1.or(p2),x);
		System.out.println();
		m1(p1.negate(),x);
		System.out.println();
		
		
		

	}
	
	public static void m1(Predicate<Integer> p, int[] x) {
		for(int a: x) {
			if(p.test(a)) {
				System.out.println(a);
			}
			
		}
	}
} 