package AMO.acceptance_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchTest {

	
	Books b1;
	
	public SearchTest(Books b2){
		b1=b2;
	}
	
 //////////////
	
	@When("the user searches for the text {string}")
	public void the_user_searches_for_the_text(String string) {
		
		
		b1.addToArray(string ,string,string);
		
		

	}

	@Then("the book with code {string} is found")
	public void the_book_with_code_is_found(String string) {

	}

	@Then("no books are found")
	public void no_books_are_found() {

	}

	@Then("the books with code {string} and {string} are found")
	public void the_books_with_code_and_are_found(String string, String string2) {

	}
	
 /////////////
	
	
	
	
	
	
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
