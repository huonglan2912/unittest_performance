package com.lanbui.jmockit.jmockitdemo.mockstaticmethod;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import mockit.Mock;
import mockit.MockUp;

public class BankTestMockUps {
	@Test
	public void test_mock_static_method() throws Exception {
		new MockUp<DBManager>() {
			@Mock
			public String getConnectionString() {
				return "DUPLICATE";
			}
		};
		
		assertEquals("FAIL", new Bank().makeConnection());
	}
	
	
	/*@Test
	*//**
	 * Using refection to invoke private method
	 * @throws Exception
	 *//*
	public void test_private_method() throws Exception {
		Object clazz = DBManager.class.newInstance();
		Method method = clazz.getClass().getDeclaredMethod("iAmPrivate");
		method.setAccessible(true);
		assertEquals("Private", method.invoke(clazz));
	}*/
}
