package com.fssa.practiceJava.fop.day19;

import java.util.Scanner;


public class UserValidation {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user id with digit that contain 8 digit");

		String userid = sc.next();

		System.out.println("Enter the user name");
		String username = sc.next();

		System.out.println("Enter the user password");
		String userpassword = sc.next();

		System.out.println("Enter the user email");
		String useremail = sc.next();
		sc.close();

		User classuser = new User();
		classuser.setId(userid);
		classuser.setName(username);
		classuser.setPassword(userpassword);
		classuser.setEmail(useremail);

		try {

			boolean valid = UserValidator.validate(classuser);

			if (valid) {
				System.out.println("All details is in correct");
			}

		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}

	}
}