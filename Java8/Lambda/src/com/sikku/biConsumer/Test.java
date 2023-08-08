package com.sikku.biConsumer;

import java.util.function.BiConsumer;

public class Test {
	
	

	public static void main(String[] args) {

		Employee e = new Employee();
		e.setEid(100);
		e.setEname("AAA");
		e.setEsalary(1000);
		
		System.out.println(e);
		
		BiConsumer<Employee, Double> c=(emp, increment)->{
			emp.esalary = emp.getEsalary()+increment;
		};
		
		c.accept(e, 500d);
		
		System.out.println(e);
		
	}

}

class Employee {
	int eid;
	String ename;
	double esalary;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsalary() {
		return esalary;
	}

	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
	

}
