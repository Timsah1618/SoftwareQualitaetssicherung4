
public class LoginService {
	
	private IAccountManager repository;
	
	LoginService(IAccountManager repo)
	{
		repository = repo;
	}
	
	public void login(String id, String passwd) throws AccountNotFoundException
	{
		IAccount account = repository.find(id);
		if (account == null) throw new AccountNotFoundException();
		if (account.passwordMatches(passwd)) {
			account.setLoggedIn(true);
		}
	}
}
