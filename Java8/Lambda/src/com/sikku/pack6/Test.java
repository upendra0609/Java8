package com.sikku.pack6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test {

	static Predicate<Integer> p = i -> i > 60;

	static Function<Student, String> f = s -> {
		if (s.marks > 60 && s.marks <= 100) {
			return "A";
		} else if (s.marks > 50 && s.marks <= 60) {
			return "B";
		} else if (s.marks > 40 && s.marks <= 50) {
			return "C";
		} else {
			return "FAIL";
		}
	};

	static Consumer<Student> c = s -> {
		System.out.println("Student name" + s.name);
		System.out.println("Student marks" + s.marks);
		System.out.println("Student Grade" + f.apply(s));
		System.out.println("----------------------------");
	};

	public static void main(String[] args) {

		Student s1 = new Student("AAA", 35);
		Student s2 = new Student("BBB", 95);
		Student s3 = new Student("CCC", 15);
		Student s4 = new Student("DDD", 25);
		Student s5 = new Student("EEE", 75);
		Student s6 = new Student("FFF", 55);
		Student s7 = new Student("GGG", 65);

		List<Student> l = new ArrayList<Student>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		l.add(s6);
		l.add(s7);

		for (Student s : l) {
			if (p.test(s.marks)) {
				c.accept(s);
			}
		}

	}

}

class Student {
	String name;
	Integer marks;

	public Student(String name, Integer marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}
}
