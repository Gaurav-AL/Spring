package com.example.demo;

public class Student {

	private String name,dept,age;

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void displayInfo() {
		 System.out.println( "Hello I am "+name +" Age :"+age+" Department :"+dept );
	}
}
