package com.sikku.pack3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(12);
		l1.add(2);
		l1.add(72);
		l1.add(52);
		l1.add(32);
		l1.add(25);
		l1.add(24);
		System.out.println(l1);
		
		 Integer[] array =  l1.stream().toArray(Integer[]::new);
		 for(Integer i: array) {
			 System.out.println(i);
		 }
	}

}
