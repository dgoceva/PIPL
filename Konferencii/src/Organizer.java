
public class Organizer extends Human {
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Organizer (String Name, String Address, String Tel, String Pass) {
		super(Name,Address,Tel);
		password = Pass;
	}
	
	public boolean verifyPass(String pass) {
		return password.equals(pass);
	}
	@Override
	public String toString() {
		return "Organizer [password=" + password + "]";
	}
	
}
