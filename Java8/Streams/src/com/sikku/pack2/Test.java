package com.sikku.pack2;

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
		
		List<Integer> l2 = l1.stream().sorted().collect(Collectors.toList());
		System.out.println(l2);
		
		List<Integer> l3 = l1.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(l3);
		
		List<Integer> l4 = l1.stream().sorted((i1,i2)->0).collect(Collectors.toList());
		System.out.println(l4);

		int min = l1.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(min);
		
		int max = l1.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(max);
	}

}
