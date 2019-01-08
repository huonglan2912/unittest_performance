package com.lanbui.jmockit.jmockitdemo.mockpublicmethod;

import static org.junit.Assert.*;

import org.junit.Test;

import mockit.Mock;
import mockit.MockUp;

public class BankTestMockState {
	@Test
	public void test_processAccount_with_MockUps() throws Exception {
		Bank bank = new Bank();
		new MockUp<DBManager>() {
			@Mock
			public String retrieveAccountHolderName(int accountId) {
				return "Susan Tran";
			}
		};
		assertEquals("Susan Tran", bank.processAccount(12));
	}
}
