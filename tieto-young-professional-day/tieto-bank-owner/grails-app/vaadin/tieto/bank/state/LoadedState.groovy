package tieto.bank.state

import tieto.bank.AccountDetailForm

class LoadedState extends AbstractState {

	@Override
	public void initTxtAccountBalance(AccountDetailForm form) {
		form.txtAccountBalance.setEnabled(true)
		form.txtAccountBalance.setValue(form.account.balance)
	}

	@Override
	public void initBtnRemove(AccountDetailForm form) {
	}

	@Override
	public void initBtnSave(AccountDetailForm form) {
	}
}
