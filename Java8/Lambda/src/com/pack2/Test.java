package com.pack2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		al.add(new Employee(1,"a"));
		al.add(new Employee(4,"d"));
		al.add(new Employee(1,"a"));
		al.add(new Employee(3,"c"));
		al.add(new Employee(2,"b"));
		al.add(new Employee(2,"b"));
		
		System.out.println(al);
		Collections.sort(al,(e1,e2)->e1.eno>e2.eno?-1:e1.eno<e2.eno?1:0);
		System.out.println(al);
		
	

	}

}
