package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PriorityTestExample {
	
	@BeforeSuite
	public void before() {
		System.out.println("Always Start First");
	}
	
	@AfterSuite
	public void after() {
		System.out.println("Always Start Last");
	}
	
	@Test
	public void awebLogin() {
		System.out.println("Web Login");
	}
	
	@Test
	public void mobileLogin() {
		System.out.println("Mobile Login");
	}

}
