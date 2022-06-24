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
	Books book;
	AdminLogg objToCheck;
	 boolean flagIsAdmin = false;
	int beforeAdd = 0;
	static boolean abb=false;
	
	int flagBeforeAdd;
	
	
	@Test
	public void test() {

	}
	
	public AddBookSuccess() {
		objToCheck = new AdminLogg();
		book = new Books() ;
	}
	
	//--------------------------Start Senario 1 --------------------------------//
	
	@Given("that the administrator is logged in")
	public void that_the_administrator_is_logged_in() {
		System.out.println(" ffffeeeeeeff " + objToCheck.flagToLogOut +" gggg");
	}
	
	
	@Given("there is a book with title {string}, author {string}, and signature {string}")
	public void there_is_a_book_with_title_author_and_signature(String string, String string2, String string3) {
		
		if ( objToCheck.flagToLogOut ) {
			
			System.out.println(" kkkk " + objToCheck.flagToLogOut +" bbb"+"\n");
			flagBeforeAdd = book.size();
			
			System.out.println( " flagBeforeAdd : "+ flagBeforeAdd +"\n ");
			book.addToArray(string, string2, string3);

			System.out.print(book.size());
			System.out.println(" \n "+" ffffff " +" \n ");
			
			System.out.println( " :: " +book.size()  +" :: "+ flagBeforeAdd +"\n ");
			
//			assertTrue( ( flagBeforeAdd + 1 ) == book.size() );
		}
	}
	
	@When("the book is added to the library")
	public void the_book_is_added_to_the_library() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("we addedd dddgdfdfgasf  fda");
	}
	@Then("the book with title {string}, author {string}, and signature {string} is contained in the library")
	public void the_book_with_title_author_and_signature_is_contained_in_the_library(String string, String string2, String string3) {
		assertTrue( ( flagBeforeAdd + 1 ) == book.size() );
	}

	//////////////////////////////// Senario 2 ////////////////////////////////
	
	
	@Given("that the administrator is not logged in")
	public void that_the_administrator_is_not_logged_in() {
		System.out.println(" logout " + objToCheck.flagToLogOut +" kkkkk ");
		
		
	}
	@Then("the error message {string} is given")
	public void the_error_message_is_given(String string) {
		
	assertFalse("Administrator login required" , objToCheck.flagToLogOut );

	}

}
