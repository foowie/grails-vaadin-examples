package tieto.bank

import tieto.bank.admin.Account;
import tieto.bank.admin.User

import com.vaadin.data.Property
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener
import com.vaadin.ui.Table

class ShowAccountsListener implements ValueChangeListener {

	OwnerApp app

	Table table

	@Override
	public void valueChange(ValueChangeEvent event) {
		Property p = event.getProperty()
		User u = p?.getValue()
		if(u) {
			def accounts = Account.findAllByOwner(u)

			table.removeAllItems()
			if(accounts) {
				for(Account a : accounts) {
					Object[] values = new Object[3]
					values[0] = a.id
					values[1] = a.balance
					values[2] = a.type
					table.addItem(values, a)
				}
			}
		}
	}
}
