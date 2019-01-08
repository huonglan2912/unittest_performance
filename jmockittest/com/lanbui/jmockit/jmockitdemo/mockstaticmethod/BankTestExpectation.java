package com.lanbui.jmockit.jmockitdemo.mockstaticmethod;

import static org.junit.Assert.*;

import org.junit.Test;

import mockit.Expectations;
import mockit.Mocked;

public class BankTestExpectation {
	@Mocked
	private DBManager dbManager;
	
	@Test
	public void test_mock_static_method() throws Exception {
		new Expectations() {
			{
				DBManager.getConnectionString();
				result = "DUPLICATED";
			}
		};
		assertEquals("FAIL", new Bank().makeConnection());
		
	}
}
