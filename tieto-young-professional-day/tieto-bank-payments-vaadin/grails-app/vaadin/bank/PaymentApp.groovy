package bank

import com.vaadin.ui.*
import tieto.bank.admin.*

class PaymentApp extends com.vaadin.Application {
    /**
     * Entry point for application
     */
    void init() {
        // CSS Styling
//        setTheme("main")
        
        // Attach top-level window
//        this.mainWindow = new Window("Grails")
//        this.mainWindow.content.setMargin(false)
		
		def window = new Window("HI")
		setMainWindow(window)
		
		def label = new Label()
		label.caption = "Ahoj"
		window.addComponent(label)
		
		
		def table = new Table()
		table.addContainerProperty("Id", Long.class, null);
		table.addContainerProperty("Date", Date.class, null)
		table.addContainerProperty("Amount", Integer.class, null)
		table.addContainerProperty("From", String.class, null)
		table.addContainerProperty("To", String.class, null)

		def values = Payment.list().each() { _ -> 
			Object[] vals = new Object[5]
			vals[0] = _.id
			vals[1] = _.date
			vals[2] = _.amount.owner.name
			vals[3] = _.from.owner.name
			vals[4] = _.to
			
			table.addItem(vals, _)
		};
		 
		window.addComponent(table)
				
    }
}
