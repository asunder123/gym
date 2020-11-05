package com.test;

import org.junit.Test;

import com.test.App;

import junit.framework.Assert;


public class AppTest {
     
	
	public App app = new App();
	
    @Test
	public void testgetString() {
		
		Assert.assertEquals("Result", app.getresult());
		
	}
	
}
