
class User {

	private String userName;
	private String pass;
	
	User() {
		// TODO Auto-generated constructor stub
	}

	public User(String userName, String pass) throws UserException{
		super();
		setUserName(userName);
		this.pass = pass;
	}

	public String getUserName() {
		return userName;
	}

	public final void setUserName(String userName) throws UserException {
		if (userName.length()<4)
			throw new UserException("UserName should be min 4 chars");
		this.userName = userName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", pass=" + pass + "]";
	}

}
