package com.lanbui.jmockit.jmockitdemo.mockpublicmethod;

public class Bank {
	DBManager dbManager = new DBManager();
	
	public String processAccount(int accountId) {
		return dbManager.retrieveAccountHolderName(accountId);
	}
}
