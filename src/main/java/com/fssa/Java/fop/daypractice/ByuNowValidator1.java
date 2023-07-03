package com.fssa.Java.fop.daypractice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class UserBuyNowValidation {
	String name;
	String phonenumber;
	String city;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}

class BuyNowValidator {
	public static boolean validate(UserBuyNowValidation User)
			throws IllegalArgumentException {

		// check for nullity of the parameter
		if (User == null) {
			throw new IllegalArgumentException("Argument is " + "NULL");
		}
		validateName(User.name);
		validatePhoneNumber(User.phonenumber);
		validateCity(User.city);
//		validateRoll(User.roll);
		return true;
	
	}
	
	public static boolean validateName(String name)
			throws IllegalArgumentException {
		if (name == null || "".equals(name.trim()) || name.length() < 2) {
			throw new IllegalArgumentException(
					"Name cannot be empty or null");
		}
		
		
		
		return true;
	}
	
	public static boolean validatePhoneNumber(String phonenumber)
			throws IllegalArgumentException {
		
		String regex = "^(\\+91|0)?[6-9]\\d{9}$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(phonenumber);
		Boolean isMatch = matcher.matches();
//	    Boolean isMatch = Pattern.matches(regex,pattern );

		if (isMatch) {
			return true;
		} else {
			throw new IllegalArgumentException("The Phone number is: Invalid");
		}

	}
	
	public static boolean validateCity(String city )
			throws IllegalArgumentException {
		
		String regex = "^[A-Za-z\\s]+$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(city);
		Boolean isMatch = matcher.matches();

		if (isMatch) {
			return true;
		} else {
			throw new IllegalArgumentException("The city name is: Invalid");
		}
	}

}

public class ByuNowValidator1{
	 public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
		  
			System.out.println("Enter user name");

			String username = s.next();

			System.out.println("Enter the phone number");
			String pnonenumber = s.next();

			System.out.println("Enter the city name");
			String city = s.next();

			s.close();

			UserBuyNowValidation classuser = new UserBuyNowValidation();
			classuser.setName(username);
			classuser.setPhonenumber(pnonenumber);
			classuser.setCity(city);

			try {

				boolean valid = BuyNowValidator.validate(classuser);

				if (valid) {
					System.out.println("All details is in correct format");
				}

			} catch (IllegalArgumentException ex) {
				System.out.println(ex.getMessage());
				ex.printStackTrace();
			}
	 }
}
