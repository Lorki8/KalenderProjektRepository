package users;

public class Account {
	public String screenName;
	private String eMail;
	private String password;
	private static final int uniqueIdentifier = 1;
	public Account(String screenName, String eMail, String password) {
		super();
		this.screenName = screenName;
		this.eMail = eMail;
		this.password = password;
	}
	
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
	    
		this.password = password;
	}
	
	
}
