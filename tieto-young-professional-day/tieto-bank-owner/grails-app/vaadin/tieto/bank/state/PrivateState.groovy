package tieto.bank.state

import tieto.bank.AccountDetailForm

class PrivateState extends LoadedState {

	@Override
	public void initBtnSave(AccountDetailForm form) {
		form.btnSave.setEnabled(true)
	}
}
