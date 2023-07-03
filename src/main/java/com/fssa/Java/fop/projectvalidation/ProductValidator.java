package com.fssa.Java.fop.projectvalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProductValidator {
	

    public static boolean validate(ProductValidation Product)throws IllegalArgumentException{
    	if (Product == null) {
			throw new IllegalArgumentException("Argument is " + "NULL");
		}
    	
    	productIdValidator(Product.productid);
    	productNameValidator(Product.productname);
    	productImageValidator(Product.productimage);
    	productPriceValidator(Product.productprice);
    	
    	return true;
    }
    
    // id validate
    public static boolean productIdValidator(String id) throws IllegalArgumentException {

    	if (id == null || "".equals(id.trim())) {
				throw new IllegalArgumentException(
						"Productid cannot be empty or null");
			}
    	
		String intregex = "^[1-9]\\d{7}$";
		Pattern pattern = Pattern.compile(intregex);
		Matcher matcher = pattern.matcher(id);
		Boolean isMatch = matcher.matches();

		if (!isMatch) {
			throw new IllegalArgumentException("Id is invalid");

		}

		return true;

	}
    
 // name validate
    
 		public static boolean productNameValidator(String ProductName) throws IllegalArgumentException {

 			if (ProductName == null || "".equals(ProductName.trim()) || ProductName.length() < 2) {
 				throw new IllegalArgumentException(
 						"ProductName cannot be empty or null");
 			}
 			
 			String nameregex = "^[A-Za-z]{7,100}$";
 			Pattern pattern = Pattern.compile(nameregex);
 			Matcher matcher = pattern.matcher(ProductName);
 			Boolean isMatch = matcher.matches();

 			if (!isMatch) {
 				throw new IllegalArgumentException("The name should be in minimum 7 letters max 100 letters");

 			}

 			return true;

    }
 		// product image validate
 		
 		public static boolean productImageValidator(String productimage) throws IllegalArgumentException {

 			String intregex = "(?i)\\b((https?|ftp)://)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?].*)?\\.(jpg|jpeg|gif|png|bmp)\\b";
 			Pattern pattern = Pattern.compile(intregex);
 			Matcher matcher = pattern.matcher(productimage);
 			Boolean isMatch = matcher.matches();

 			if (!isMatch) {
 				throw new IllegalArgumentException("Product Image URL is Invalid");

 			}

 			return true;

 		}
 		
 // Price validate
 		public static boolean productPriceValidator(int productPrice)
 				throws IllegalArgumentException {

 			
 			if (productPrice > 500 && productPrice < 2000) {
 				return true;
 			} else {
 				throw new IllegalArgumentException("Product price is Invalid");
 			}
    }
}
