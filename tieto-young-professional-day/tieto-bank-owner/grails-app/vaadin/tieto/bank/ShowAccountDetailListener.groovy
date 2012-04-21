package tieto.bank

import tieto.bank.admin.Account;

import com.vaadin.data.Property
import com.vaadin.data.Property.ValueChangeListener
import com.vaadin.data.Property.ValueChangeEvent;

class ShowAccountDetailListener implements ValueChangeListener {

	OwnerApp app

	@Override
	public void valueChange(ValueChangeEvent event) {
		Property p = event.getProperty()
		Account a = p.getValue()
		app.accountDetail.setAccount(a)

		//		if(a && a.balance < 0)
		//			app.getMainWindow().showNotification("Si v mínusu")
	}
}
