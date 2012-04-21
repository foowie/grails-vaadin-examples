package tieto.bank.admin

class PaymentController {

	def index() {
		[payments: Payment.list()]
	}

	def remove() {
		Payment.get(params.id)?.delete()
		redirect(view: 'index')
	}
}
