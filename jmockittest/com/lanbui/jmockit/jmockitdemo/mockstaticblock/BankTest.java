package com.lanbui.jmockit.jmockitdemo.mockstaticblock;

import static org.junit.Assert.*;

import org.junit.Test;

import mockit.Mock;
import mockit.MockUp;

public class BankTest {
	@Test
	public void test_mock_static_block() throws Exception {
		new MockUp<Bank>() {
			@Mock
			public void $clinit() {
				Bank.updateBalance(500);
			}
		};
		assertTrue(500 == Bank.getBalanceAmount());
	}
}
