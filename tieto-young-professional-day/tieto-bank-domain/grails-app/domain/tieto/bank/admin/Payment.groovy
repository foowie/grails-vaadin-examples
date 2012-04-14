package tieto.bank.admin

/**
 * Payment maps transactions between two accounts.
 */
class Payment {

	Date date
	Integer amount
	Account from
	Account to


	static constraints = {
		amount min: 1
		from nullable: true
		to nullable: true
	}

	def beforeInsert() {
		if(date == null)
			date = new Date()
	}
}
