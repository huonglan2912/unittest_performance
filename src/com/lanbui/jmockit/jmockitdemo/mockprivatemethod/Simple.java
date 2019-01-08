package com.lanbui.jmockit.jmockitdemo.mockprivatemethod;

public class Simple {
	private String iAmPrivate() {
		return "Private Method";
	}
	
	public String publicCallsPrivate() {
		return iAmPrivate();
	}
}
