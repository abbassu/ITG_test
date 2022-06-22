package AMO.acceptance_tests;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddBookSuccess {
//	static Books book ;
//	Admin admin ;
	boolean flagIsAdmin = false;
	int beforeAdd = 0;
	
	@Ignore
	@Before
	public void setUp() throws Exception {
//		book  = new Books();
//		admin = new Admin();
		//read = new Scanner(System.in);
//		flagIsAdmin = false;
//		beforeAdd = 0;
	}
	@Ignore
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
//		admin = new Admin();
	}
	
////////////////////////////////////    Start Admin Login    /////////////////////////////////
	@Given("that the administrator is logged in")
	public void that_the_administrator_is_logged_in() {
		Admin admin = new Admin();
		
	    flagIsAdmin = admin.checkAdmin("AMO", "adminadmin");
	}
	@Given("there is a book with title {string}, author {string}, and signature {string}")
	public void there_is_a_book_with_title_author_and_signature(String string, String string2, String string3) {
		Books book = new Books() ;
	    // Write code here that turns the phrase above into concrete actions
		int flagBeforeAdd = book.size();
		book.addToArray(string, string2, string3);
		assertTrue( ( flagBeforeAdd + 1 ) == book.size() );
	}
	@When("the book is added to the library")
	public void the_book_is_added_to_the_library() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hello");
	}
	@Then("the book with title {string}, author {string}, and signature {string} is contained in the library")
	public void the_book_with_title_author_and_signature_is_contained_in_the_library(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(flagIsAdmin);
//		if ( flagIsAdmin )
//			System.out.println("the book  contained in the library");
//		else
//			System.out.println("Administrator login required");
	}


	///////////////////////////////// End Admin Login  ////////////////////////////////////
	
	
	//////////////////////////////// Senario 2 ////////////////////////////////
	
	
	@Given("that the administrator is not logged in")
	public void that_the_administrator_is_not_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
		flagIsAdmin = flagIsAdmin;
	}
	@Then("the error message {string} is given")
	public void the_error_message_is_given(String string) {
	    // Write code here that turns the phrase above into concrete actions
		assertFalse(flagIsAdmin);
	}
	
////////////////////////////////Senario 2 ////////////////////////////////


	
}
