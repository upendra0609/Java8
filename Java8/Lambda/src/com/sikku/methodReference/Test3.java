package com.sikku.methodReference;

public class Test3 {
	public int m2() {
		System.out.println("reference");
		return 1;
	}

	public static void main(String[] args) {
		
		Test3 t3 = new Test3();
		
		
		MyIntref i = t3::m2;
		i.m1();

	}

}

interface MyIntref{
	public void m1();
}
