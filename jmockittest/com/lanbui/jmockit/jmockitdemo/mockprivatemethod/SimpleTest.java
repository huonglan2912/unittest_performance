package com.lanbui.jmockit.jmockitdemo.mockprivatemethod;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import mockit.Mock;
import mockit.MockUp;

public class SimpleTest {
	@Test
	public void test_mock_private_method() throws Exception {
		Simple simple = new Simple();
		new MockUp<Simple>() {
			@Mock
			private String iAmPrivate() {
				return "Mocked";
			}
		};
		
		assertEquals("Mocked", simple.publicCallsPrivate());
	}
}
