package com.axonactive.fintech.util;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import mockit.Expectations;
import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;

public class NameUtilJMockitTest {
	@Test
	public void should_mock_name() throws Exception {
		long start = System.currentTimeMillis();
		new MockUp<NameUtil>() {
			@Mock
			public String getName() {
				return "Lan Bui";
			}
		};
		
		String name = NameUtil.getName();
		Assert.assertEquals(name, "Lan Bui");
		System.out.println("====Time: " + (System.currentTimeMillis() - start));
	}
	
	@Test
	public void should_mock_private_method() throws Exception {
		long start = System.currentTimeMillis();
		new MockUp<NameUtil>() {
			@Mock
			private String getPrivateName() {
				return "Lan Bui";
			}
		};
		
		String name = NameUtil.getName();
		Assert.assertEquals(name, "Lan Bui");
		System.out.println("====Time: " + (System.currentTimeMillis() - start));
	}

	/*@Mocked
	private NameUtil util;
	
	@Test
	public void should_test_normal_test() throws Exception {
		long start = System.currentTimeMillis();
		new Expectations() {
			{
				util.getNormalName();
				result = "Lan Bui";
			}
		};
		String name = NameUtil.getName();
		Assert.assertEquals(name, "Lan Bui");
		System.out.println("====Time: " + (System.currentTimeMillis() - start));
	}*/
}
