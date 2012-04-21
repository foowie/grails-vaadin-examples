package tieto.bank.state

import tieto.bank.admin.Account
import tieto.bank.admin.AccountType

interface StateFactory {
	State getState(Account account)
}

class DummyStateFactory implements StateFactory {

	@Override
	public State getState(Account account) {

		if(account == null)
			return new EmptyState();

		if(AccountType.Private.equals(account.type))
			return new PrivateState();

		if(AccountType.Corporate.equals(account.type))
			return new CorporateState();
	}
}

class MappedStateFactory implements StateFactory {

	Map<AccountType, State> map;

	public MappedStateFactory() {
		super();
		map = new HashMap<AccountType, State>()
		map.put(null, new EmptyState())
		map.put(AccountType.Private, new PrivateState())
		map.put(AccountType.Corporate, new CorporateState())
	}

	@Override
	public State getState(Account account) {
		return map.get(account?.type)
	}
}
