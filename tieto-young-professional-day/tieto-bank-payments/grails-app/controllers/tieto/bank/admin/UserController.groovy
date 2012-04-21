package tieto.bank.admin

class UserController {

	def index() {
	}

	def login() {
		User user = User.findByName(params.username)

		//		if(user) {
		//		} else {
		//			redirect
		//		}

		session.user = user
		redirect(controller: 'payment', view: 'index')
	}
}
