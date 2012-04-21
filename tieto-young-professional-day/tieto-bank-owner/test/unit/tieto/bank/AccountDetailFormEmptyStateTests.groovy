package tieto.bank

import static org.junit.Assert.*

import grails.test.mixin.*
import grails.test.mixin.support.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class AccountDetailFormEmptyStateTests {

	AccountDetailForm form

	void setUp() {
		form = new AccountDetailForm()
	}

	void tearDown() {
		// Tear down logic here
	}

	void testTxtAccountBalanceIsEnabled() {
		boolean enabled = form.txtAccountBalance.isEnabled()
		assertEquals(false, enabled)
	}

	void testTxtAccountBalanceValue() {
		def value = form.txtAccountBalance.getValue()
		assertEquals("", value)
	}
}
