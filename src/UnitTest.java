import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTest {

	@Test
	public void calculatingChangeTest() {
		int tender = 100;
		int amount = 50;
		double actual = CashPayment.getChange(tender,amount);
		double expected = 50;
		assertEquals(expected, actual);
	
	}
	@Test
	public void CheckPaymentTest() {
		String checkNumber = "1234";
		
		assertEquals(true,CheckPayment.validateCheckNumber(checkNumber));
		
	}
	@Test
	public void validateCreditCardPaymentTest() {
		String creditCardNumber = "2222420000001113";
		assertEquals(true,CreditCardPayment.validateCreditCardNumber(creditCardNumber));
	}
	@Test
	public void validateExpirationDateTest() {
		String expirationDate = "05/26";
		assertEquals(true,CreditCardPayment.validateExpirationDate(expirationDate));
	}
	@Test
	public void validateCVVTest() {
		String cVV = "222";
		assertEquals(true,CreditCardPayment.validateCVV(cVV));
		
	}
	
}	
