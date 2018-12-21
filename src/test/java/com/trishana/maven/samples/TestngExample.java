package com.trishana.maven.samples;



import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;




public class TestngExample {
	@Test()
	public void testmethod1() {
		System.out.println("at test1");
		//SoftAssert s= new SoftAssert();
assertEquals("ABC", "ABC");
		
	}
	
	
	@Test(groups = "login")
	public void testmethod2() {
		System.out.println("at test2");
		//SoftAssert s= new SoftAssert();
assertEquals("ABC", "ABC");
		
	}
	
	@Test(groups = {"logout"})
	public void testmethod3() {
		System.out.println("at test 3");
		
	}
	
	
	

}
