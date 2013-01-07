
public interface IAccount {
	void setLoggedIn(boolean value);
	boolean isLoggedIn();
	boolean passwordMatches(String passwd);
	String getId();
}
