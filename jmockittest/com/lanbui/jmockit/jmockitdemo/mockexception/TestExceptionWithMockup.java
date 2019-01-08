package com.lanbui.jmockit.jmockitdemo.mockexception;

import org.junit.Test;

import mockit.Mock;
import mockit.MockUp;

public class TestExceptionWithMockup {
	@Test(expected = Exception.class)
	public void test_connection() throws Exception {
		Bank bank = new Bank();
		new MockUp<Bank>() {
			@Mock
			public String getConnection() throws Exception {
				throw new Exception();
			}
		};
		bank.getConnection();
	}
}
