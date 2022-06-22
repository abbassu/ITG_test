package AMO.acceptance_tests;

public class Admin {
	public String userName = "AMO";
	public String password = "adminadmin";
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}
	public boolean checkAdmin(String user, String pass) {
		return ( userName.equals(user) && password.equals(pass) );
	}

}
