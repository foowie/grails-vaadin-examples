package tieto.bank.state

import tieto.bank.AccountDetailForm

class EmptyState extends AbstractState {

	@Override
	public void initTxtAccountBalance(AccountDetailForm form) {
		super.initTxtAccountBalance(form)
		form.txtAccountBalance.setValue("")
	}
}
