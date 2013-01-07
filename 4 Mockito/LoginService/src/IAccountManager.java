public interface IAccountManager {
	/**
	 * Findet eine Account identifiziert durch id
	 * @param id - name des Accounts
	 * @return Account objekt; null wenn Account nicht existiert.
	 */
	IAccount find(String id);
}
