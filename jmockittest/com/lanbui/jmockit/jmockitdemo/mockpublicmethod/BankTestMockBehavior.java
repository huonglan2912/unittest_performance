package com.lanbui.jmockit.jmockitdemo.mockpublicmethod;

import static org.junit.Assert.*;

import org.junit.Test;

import mockit.Expectations;
import mockit.Mocked;

public class BankTestMockBehavior {
	@Mocked
	private DBManager dbManager;
	
	@Test
	public void test_processAccount_with_Expectations() throws Exception {
		Bank bank = new Bank();
		new Expectations() {
			{
//				dbManager.retrieveAccountHolderName(10);
				dbManager.retrieveAccountHolderName(anyInt);
//				result = "Lan Bui";
				returns("Lan Bui", "Susan Tran", "Susan Tran", "Lan Bui");
			}
		};
		assertEquals("Lan Bui", bank.processAccount(10));
		assertEquals("Susan Tran", bank.processAccount(20));
		assertEquals("Susan Tran", bank.processAccount(30));
		assertEquals("Lan Bui", bank.processAccount(30));
	}
}
