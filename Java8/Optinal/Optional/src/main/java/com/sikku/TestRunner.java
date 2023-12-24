package com.sikku;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sikku.repository.DataRepository;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private DataRepository repository;

	@Override
	public void run(String... args) throws Exception {
		Optional<com.sikku.OptionalData> findById = repository.findById(11);
		/*
		 * if(findById.isPresent()) { System.out.println(findById.get()); }else {
		 * System.out.println("no data"); }
		 */

		/*if (!findById.isEmpty()) {
			Optional<String> value = Optional.ofNullable(findById.get().getValue()); //
//		  value.ifPresent(System.out::println); // this will work only if value is not null 
			value.ifPresentOrElse(name -> System.out.println(name.toUpperCase()),
					() -> System.out.println("Not present"));
		} else {
			System.out.println("no data");
		}
		*/

		findById.ifPresentOrElse((emp) -> {
			Optional<String> value = Optional.ofNullable(findById.get().getValue());
			value.ifPresentOrElse(name -> System.out.println(name.toUpperCase()),
					() -> System.out.println("Not present"));
		}, () -> {
			System.out.println("Null data");
		});

	}

}
