package com.sikku.pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Rahul");
		al1.add("Raju");
		al1.add("Rohan");
		al1.add("Sanjeev");
		al1.add("Aakash");
		
		System.out.println(al1);
		
		List<String> al2 = al1.stream().filter(s->s.length()>=6).collect(Collectors.toList());

		System.out.println(al2);
		
		
		List<String> al3 = al1.stream().map(s->s.toUpperCase()).collect(Collectors.toList());

		System.out.println(al3);
		
		long count = al1.stream().filter(s->s.length()>=6).count();
		System.out.println(count);

	}

}
