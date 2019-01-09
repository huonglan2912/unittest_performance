package com.axonactive.fintech;

import static org.junit.Assert.*;
import mockit.Mock;
import mockit.MockUp;
import mockit.Tested;

import org.junit.Assert;
import org.junit.Test;

import ch.ivyteam.ivy.cm.IContentManagementSystem;
import ch.ivyteam.ivy.environment.Ivy;

public class CmsTest {
	@Test
	public void should_mock_cms() throws Exception {
		long start = System.currentTimeMillis();
		new MockUp<Ivy>() {
			@Mock
			IContentManagementSystem cms() {
				return new LanCms();
			}
		};
		String result = Ivy.cms().co("test");
		Assert.assertEquals("Lan Bui", result);
		System.out.println("====Time: " + (System.currentTimeMillis() - start));
	}
}

class LanCms extends MyCms {
	@Override
	public String co(String uri) {
		
		return "Lan Bui";
	}
}
