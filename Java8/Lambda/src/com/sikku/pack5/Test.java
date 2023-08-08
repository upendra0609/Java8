package com.sikku.pack5;

import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
//		Predicate<String> p1 = s-> s.startsWith("k");
		Predicate<String> p2 = s-> s!=null && s.length()!=0 && s.startsWith("k");
		
		String [] str = {"kas","kllr","k","rger",null,"rkgjrk"};
		
//		m1(p1.and(p2), str);
		m1(p2, str);
		
	}
	
	public static void m1(Predicate<String> p, String[] str) {
		for(String s: str) {
			if(p.test(s)){
				System.out.println(s);				
			}
		}
	}
}
