package tieto.bank.payments

class SecurityFilters {

	def filters = {
		all(controller:'*', action:'*') {
			before = {
				if(!session.user && actionName != 'login')
					redirect(action: 'index', controller: 'User')
			}
			after = { Map model ->
			}
			afterView = { Exception e ->
			}
		}
	}
}
