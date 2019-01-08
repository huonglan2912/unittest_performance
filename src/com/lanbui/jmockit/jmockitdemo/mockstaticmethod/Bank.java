package com.lanbui.jmockit.jmockitdemo.mockstaticmethod;

public class Bank {
	public String makeConnection() {
		String conString = DBManager.getConnectionString();
		if("ORIGIN".equals(conString)) {
			return "SUCCESS";
		}
		return "FAIL";
	}
}
