package com.sikku.methodReference;

public class Test1 {

	public void m1() {
		for(int i=0;i<10;i++) {
			System.out.print(i+"\t");
		}
	}
	
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		
		Runnable r =t1::m1;
		
		Thread t = new Thread(r);
		t.start();
		
		for (int i=65; i<74; i++) {
			System.out.print((char)i+"\t");
		}
		

	}

}
