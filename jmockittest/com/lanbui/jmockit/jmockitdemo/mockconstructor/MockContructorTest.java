package com.lanbui.jmockit.jmockitdemo.mockconstructor;

import static org.junit.Assert.assertNull;

import org.junit.Test;

import mockit.Mock;
import mockit.MockUp;

public class MockContructorTest {
	
	@Test
	public void test_mock_default_construtor() throws Exception {
		new MockUp<Person>() {
			@Mock
			public void $init() {
				
			}
		};
		
		Person person = new Person();
		assertNull(person.getName());
	}
	
	@Test
	public void test_mock_constructor_with_params() throws Exception {
		new MockUp<Person>() {
			@Mock
			public void $init(String name) {
				
			}
		};
		Person person = new Person("Lan Bui");
		assertNull(person.getName());
	}
}
