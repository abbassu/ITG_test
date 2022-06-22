package AMO.acceptance_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AdminLogg {
	private boolean flagIsAdmin = false;
	boolean flagLogOut = false;
//	boolean flagPassword = false;
	@Test
	public void test() {
//		fail("Not yet implemented");
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
		Admin admin = new Admin();
		if ( !flagIsAdmin ) {			
		    flagIsAdmin = admin.checkAdmin("AMO", string);
//		    flagPassword = flagIsAdmin;
		}
	}
	@Then("the admin login succeeds")
	public void the_admin_login_succeeds() {
		assertTrue(flagIsAdmin);
	}
	@Then("the admin is logged in")
	public void the_admin_is_logged_in() {
		assertTrue(flagIsAdmin);
	}

	/////////////////////////  End   can Login    ////////////////////////////////////////////////////

	@Then("the admin login fails")
	public void the_admin_login_fails() {
		assertFalse(flagIsAdmin);
	}
	@Then("the admin is not logged in")
	public void the_admin_is_not_logged_in() {
		assertFalse(flagIsAdmin);
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Given("that the admin is logged in")
	public void that_the_admin_is_logged_in() {
		assertTrue(!flagIsAdmin);	    
	}
	@When("the admin logs out")
	public void the_admin_logs_out() {
		if ( flagIsAdmin )
	    	flagIsAdmin = true;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	public boolean getFlagIsAdmin() {
		return flagIsAdmin;
	}
	
	

}
