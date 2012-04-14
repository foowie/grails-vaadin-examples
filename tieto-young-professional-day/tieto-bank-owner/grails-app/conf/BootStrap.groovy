import grails.util.Environment;
import tieto.bank.admin.Account
import tieto.bank.admin.AccountType
import tieto.bank.admin.User

class BootStrap {

	def init = { servletContext ->
		Environment current = Environment.getCurrent()
		if(Environment.DEVELOPMENT.equals(current))
			new DevData().insert()
	}
	def destroy = {
	}
}
