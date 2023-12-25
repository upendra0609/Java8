package com.sikku;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<Double> doubleMe = i-> System.out.println(i*2.0);
		Consumer<Double> trippleMe = i-> System.out.println(i*3.0);
		doubleMe.andThen(trippleMe).accept(2.0);
		
		
		Consumer<String> firstStr = str-> System.out.print(str);
		Consumer<String> seconStr = str-> System.out.print(str);
		
		firstStr.andThen(seconStr).accept("Hello");
		
//		doubleMe.accept(12.0);
	}

}
