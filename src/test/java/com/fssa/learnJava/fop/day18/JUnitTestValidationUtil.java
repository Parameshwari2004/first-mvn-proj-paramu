package com.fssa.learnJava.fop.day18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnitTestValidationUtil {
	
	@Test // Annotation is marker for JUNIT to run this method automatically
	public void testPostiveValidateAge() {
		Assertions.assertTrue(ValidationUtil1.validateAge(9));
	}
	
	@Test
	public void testNegativeValidateAge() {
		try {
			ValidationUtil1.validateAge(-9);
			Assertions.fail("ValidateAge failed");
		}
		catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Invalid age", ex.getMessage());
		}
	}
	

}
