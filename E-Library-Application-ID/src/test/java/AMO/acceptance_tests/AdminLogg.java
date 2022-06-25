package AMO.acceptance_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AdminLogg {
	private boolean flagIsAdmin = false;
	static boolean flagToLogOut = false;
	private int flag = 0;
	Admin admin;

	@Test
	public void test() {
//		fail("Not yet implemented");
	}
	
	public AdminLogg() {
		admin = new Admin();
	}
	
	/////////////////////////  Start  can Login    ////////////////////////////////////////////////////
	
	@Given("that the admin is not logged in")
	public void that_the_admin_is_not_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
		assertFalse(flagIsAdmin);
	}
	@Given("the password is {string}")
	public void the_password_is(String string) {
	    // Write code here that turns the phrase above into concrete actions
		//Admin admin = new Admin();
		if ( !flagIsAdmin ) {			
		    flagIsAdmin = admin.checkAdmin("AMO", string);
//		    if ( flagIsAdmin )
//		    	flag = 4;
//		    flagPassword = flagIsAdmin;
		}
	}
	@Then("the admin login succeeds")
	public void the_admin_login_succeeds() {
		assertTrue(flagIsAdmin);
		if (flagIsAdmin)
			flagToLogOut = true; 
		
	}
	@Then("the admin is logged in")
	public void the_admin_is_logged_in() {
		assertTrue(flagIsAdmin);
	}

	/////////////////////////  End   can Login    ////////////////////////////////////////////////////

	@Then("the admin login fails")
	public void the_admin_login_fails() {
		assertFalse(flagIsAdmin);
		System.out.println(" 7777777777");

	}
	@Then("the admin is not logged in")
	public void the_admin_is_not_logged_in() {
		assertFalse(flagIsAdmin);
		System.out.println(" 6666666666");

	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Given("that the admin is logged in")
	public void that_the_admin_is_logged_in() {
//		assertFalse(flagIsAdmin);
		assertTrue(flagToLogOut);
		System.out.println(" 55555555555");

	}
	@When("the admin logs out")
	public void the_admin_logs_out() {
		assertTrue(flagToLogOut);
		System.out.println(" 4444444444");
//		if ( flag != 0 )
//	    	flagIsAdmin = true;
//		assertFalse(flagIsAdmin);
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	public boolean getFlagIsAdmin() {
		return flagIsAdmin;
	}
	
	

}
