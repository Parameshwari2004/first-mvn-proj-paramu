package com.fssa.practiceJava.fop.day19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnitUserValidationUtil {

	@Test
	public void testValidId() {
		Assertions.assertTrue(UserValidator.idValidator("12345678"));
	}

	@Test
	public void testInvalidId() {
		try {
			UserValidator.idValidator("998");
			Assertions.fail("Validateid failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Id is invalid", ex.getMessage());
		}
	}

	@Test
	public void testValidName() {
		Assertions.assertTrue(UserValidator.nameValidator("Paramu"));
	}

	@Test
	public void testInvalidName() {
		try {
			UserValidator.nameValidator("a");
			Assertions.fail("Validatename failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("The name should be in minimum 2 letters", ex.getMessage());
		}
	}

	@Test
	public void testValidEmail() {
		Assertions.assertTrue(UserValidator.emailValidator("paramu@gmail.com"));
	}

	@Test
	public void testInvalidEmail() {
		try {
			UserValidator.emailValidator("paramugmail");
			Assertions.fail("Validateemail failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("The email is invalid", ex.getMessage());
		}
	}

	@Test
	public void testValidPassword() {
		Assertions.assertTrue(UserValidator.passwordValidator("Paramu@2004"));
	}

	@Test
	public void testInvalidPassword() {
		try {
			UserValidator.passwordValidator("param");
			Assertions.fail("Validatepassword failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("The password is invalid", ex.getMessage());
		}
	}
}
