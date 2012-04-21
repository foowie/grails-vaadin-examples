package tieto.bank

import static org.junit.Assert.*

import grails.test.mixin.*
import grails.test.mixin.support.*
import org.junit.*
import tieto.bank.admin.*

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class AccountDetailFormPrivateStateTests {

	AccountDetailForm form

	void setUp() {
		form = new AccountDetailForm()

		def account = new Account()
		account.balance = 1000
		account.type = AccountType.Private
		form.setAccount(account)
	}

	void tearDown() {
		// Tear down logic here
	}

	void testTxtAccountBalanceIsEnabled() {
		boolean enabled = form.txtAccountBalance.isEnabled()
		assertEquals(true, enabled)
	}

	void testTxtAccountBalanceValue() {
		def value = form.txtAccountBalance.getValue()
		assertEquals(1000, value)
	}
}
