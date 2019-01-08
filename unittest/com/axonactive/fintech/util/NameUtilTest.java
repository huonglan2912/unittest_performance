package com.axonactive.fintech.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({
	NameUtil.class
})
public class NameUtilTest {
	@Test
	public void should_mock_static_method() throws Exception {
		long start = System.currentTimeMillis();
		PowerMockito.mockStatic(NameUtil.class);
		Mockito.when(NameUtil.getName()).thenReturn("Lan Bui");
		
		String name = NameUtil.getName();
		Assert.assertEquals(name, "Lan Bui");
		System.out.println("====Time: " + (System.currentTimeMillis() - start));
	}
}
