package com.lanbui.jmockit.jmockitdemo.mockexception;

import org.junit.Test;

import mockit.Expectations;

public class TestExceptionWithExpectation {
	@Test(expected = Exception.class)
	public void test_connection() throws Exception {
		final Bank bank = new Bank();
		new Expectations(bank) {
			{
				bank.getConnection();
				result = new Exception("Cannot connect to db");
			}
		};
		bank.getConnection();
	}
}
