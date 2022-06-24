package AMO.acceptance_tests;

import java.util.ArrayList;

public class Books {
	static ArrayList<bookArray> addBooks = new ArrayList<bookArray>();
	static int index = 0;
	public Books() {

		addBooks.add(index,new bookArray("E102", "Mustafa Ramahi", "Mustafa119"));
		++index;
		addBooks.add(index,new bookArray("AI", "Omar Salous", "Omar119"));
		++index;
		addBooks.add(index,new bookArray("SE", "Abbas Surkji", "Abbas119"));
		++index;
		
	}
	
	public int size() {
		
		return addBooks.size();
		
	}
	
	public void addToArray(String string, String string2, String string3) {
		
		addBooks.add(index,new bookArray(string, string2, string3));
		++index;
		
	}
	
	
	
	
	
	
}

class bookArray{

    private String title;
    private String author;
    private String signature;
    
    public bookArray (String title, String author, String signature){
        this.title 	= title;
        this.author = author;
        this.signature  = signature;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }
	
    public String getSignature(){
        return signature;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setSignature(String signature){
        this.signature = signature;
    }

}
