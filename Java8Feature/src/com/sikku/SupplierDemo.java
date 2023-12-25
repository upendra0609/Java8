package com.sikku;

import java.time.LocalDate;
import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
		Supplier<LocalDate> currentDate = ()-> LocalDate.now();
		System.out.println(currentDate.get());
		
		Supplier<String> random = ()-> UUID.randomUUID().toString();
		System.out.println(random);
		
		Supplier<Integer> randomNum = ()-> new Random().nextInt(10);
		System.out.println(randomNum);
	}

}
