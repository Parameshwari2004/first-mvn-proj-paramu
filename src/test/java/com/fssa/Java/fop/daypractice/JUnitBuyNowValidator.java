package com.fssa.Java.fop.daypractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnitBuyNowValidator {
	

	@Test
	public void testValidName() {
		Assertions.assertTrue(BuyNowValidator.validateName("Paramu"));
	}

	@Test
	public void testInvalidName() {
		try {
			BuyNowValidator.validateName("p");
			Assertions.fail("Validatename failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Name cannot be empty or null", ex.getMessage());
		}
	}

	@Test
	public void testValidEmail() {
		Assertions.assertTrue(BuyNowValidator.validatePhoneNumber("+917603938585"));
	}

	@Test
	public void testInvalidEmail() {
		try {
			BuyNowValidator.validatePhoneNumber("1234567890");
			Assertions.fail("Validate PhoneNumber failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("The Phone number is: Invalid", ex.getMessage());
		}
	}

	@Test
	public void testValidCity() {
		Assertions.assertTrue(BuyNowValidator.validateCity("Chennai"));
	}

	@Test
	public void testInvalidCity() {
		try {
			BuyNowValidator.validateCity("12New york city");
			Assertions.fail("City Name failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("The city name is: Invalid", ex.getMessage());
		}
	}
}
