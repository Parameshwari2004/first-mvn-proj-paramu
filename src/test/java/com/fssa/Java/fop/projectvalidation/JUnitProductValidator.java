package com.fssa.Java.fop.projectvalidation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class JUnitProductValidator {
	@Test
	public void testValidId() {
		Assertions.assertTrue(ProductValidator.productIdValidator("12345678"));
	}

	@Test
	public void testInvalidId() {
		try {
			ProductValidator.productIdValidator("998");
			Assertions.fail("Validateid failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Id is invalid", ex.getMessage());
		}
	}
	
	public void testValidName() {
		Assertions.assertTrue(ProductValidator.productNameValidator("Red Rose Bouquet"));
	}

	@Test
	public void testInvalidName() {
		try {
			ProductValidator.productNameValidator("red");
			Assertions.fail("Validatename failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("The name should be in minimum 7 letters max 100 letters", ex.getMessage());
		}
	}
	public void testValidIamge() {
		Assertions.assertTrue(ProductValidator.productImageValidator("https://iili.io/Hijmt2a.jpg"));
	}

	@Test
	public void testInvalidIamge() {
		try {
			ProductValidator.productImageValidator("https://iili.io/Hijmt2a.htpp");
			Assertions.fail("Validateimage failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Product Image URL is Invalid", ex.getMessage());
		}
	}
	public void testValidPrice() {
		Assertions.assertTrue(ProductValidator.productPriceValidator(501));
	}

	@Test
	public void testInvalidPrice() {
		try {
			ProductValidator.productPriceValidator(400);
			Assertions.fail("Validateprice failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Product price is Invalid", ex.getMessage());
		}
	}

}
