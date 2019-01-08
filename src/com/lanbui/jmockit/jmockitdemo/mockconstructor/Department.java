package com.lanbui.jmockit.jmockitdemo.mockconstructor;

public class Department {
	private Person person = new Person();
	
	public String getPersonName() {
		return person.getName();
	}
}
