package test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Intro {
	
	@BeforeTest
	public void before() {
		System.out.println("Run this before each test case.");
	}

	@Test
	public void demo() {
		System.out.println("Hello world!!");
	}
	
	@Test
	public void secondTest() {
		System.out.println("Good morning!!");
	}
	
	@Test(groups = {"Smoke"})
	public void third() {
		System.out.println("Have a good day!!");
	}
	

}
