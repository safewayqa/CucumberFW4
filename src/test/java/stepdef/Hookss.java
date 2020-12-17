package stepdef;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hookss {

	
	@Before("@RegTest")
	public void Beforetest() {
		
		System.out.println("Before executed");
	}
	@After("@RegTest")
	public void AfterTest() {
		
		System.out.println("After executed");
	}
}
