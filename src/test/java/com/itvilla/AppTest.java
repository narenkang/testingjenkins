package com.itvilla;

import org.junit.Assert;
import org.junit.Test;

import com.itvilla.App;

public class AppTest {

	@Test
	public void testLengthOfTheUniqueKey() {
		System.out.println("Testing Project starts");
		App obj = new App();
		Assert.assertEquals(36, obj.generateUniqueKey().length());
		System.out.println("Testing ends");
	}
}
