package com.pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test1 {

	public static void main(String[] args) {
	
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(1);
		al.add(23);
		al.add(4);
		al.add(75);
		al.add(59);
		al.add(7);
		al.add(7);
		al.add(0);
		al.add(108);
		
//		System.out.println(al);
//		Collections.sort(al);
//		Collections.sort(al,(I1,I2)->I1>I2?-1:I1<I2?1:0);
//		System.out.println(al);
		
		
		Set<Integer> ts = new TreeSet<Integer>((I1,I2)->I1>I2?-1:I1<I2?1:0);
		ts.add(12);
		ts.add(2);
		ts.add(1);
		ts.add(1);
		ts.add(45);
		ts.add(32);
		ts.add(56);
//		System.out.println(ts);

		Map<Integer, String> m =new TreeMap<Integer, String>((I1,I2)->I1>I2?-1:I1<I2?1:0);
		m.put(1, "A");
		m.put(4, "D");
		m.put(1, "A");
		m.put(3, "C");
		m.put(5, "E");
		m.put(2, "B");
		System.out.println(m);

	}

}
