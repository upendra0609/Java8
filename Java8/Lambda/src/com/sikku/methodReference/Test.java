package com.sikku.methodReference;

public class Test {
	
	public static void m2() {
		System.out.println("method reference");
	}

	public static void main(String[] args) {
		
		intref i =Test::m2;
		i.m1();

	}

}

interface intref{
	public void m1();
}
