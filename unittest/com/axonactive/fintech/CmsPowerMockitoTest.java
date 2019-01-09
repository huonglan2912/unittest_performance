package com.axonactive.fintech;

import mockit.Mock;
import mockit.MockUp;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import ch.ivyteam.ivy.cm.IContentManagementSystem;
import ch.ivyteam.ivy.environment.Ivy;

@RunWith(PowerMockRunner.class)
@PrepareForTest({
	Ivy.class
})
public class CmsPowerMockitoTest {
	@Test
	public void should_mock_cms() throws Exception {
		long start = System.currentTimeMillis();
		PowerMockito.mockStatic(Ivy.class);
		IContentManagementSystem cms = Mockito.mock(IContentManagementSystem.class);
		Mockito.when(Ivy.cms()).thenReturn(cms);
		Mockito.when(Ivy.cms().co("test")).thenReturn("Lan Bui");
		
		String result = Ivy.cms().co("test");
		Assert.assertEquals("Lan Bui", result);
		System.out.println("====Time: " + (System.currentTimeMillis() - start));
		
	}
}
