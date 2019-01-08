package com.lanbui.jmockit.jmockitdemo.mockstaticblock;

public class Bank {
	static int balanceAccount;
	
	static {
		updateBalance(100);
	}
	
	public static void updateBalance(float balance) {
		balanceAccount += balance;
	}
	
	public static float getBalanceAmount() {
		return balanceAccount;
	}
}
