package com.lanbui.jmockit.jmockitdemo.mockconstructor;

public class Person {
	private String name;
	
	public Person() {
		name = "Lan Bui";
	}
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
