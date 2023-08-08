package com.sikku.pack3;

public class Test {

	public static void main(String[] args) {
		
		Runnable r = ()->{ 
			for(int i=0;i<10;i++) {
				System.out.println("lambda");
			}
	  };
	  
	  Thread t = new Thread(r);
	  t.start();
  
	  for(int i=0;i<10;i++) {
			System.out.println("main");
		}
	}
}