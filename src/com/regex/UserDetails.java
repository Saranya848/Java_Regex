package com.regex;

import java.util.Scanner;

public class UserDetails {

	Scanner scanner = new Scanner(System.in);
	RegistrationRules rules = new RegistrationRules();

	/**
	 * We take the input and pass it to the method to check the first name is valid.
	 */
	public void userFirstName() {
		System.out.println("Enter Your First Name : ");
		String firstName = scanner.next();
		rules.firstName(firstName);
	}

	/**
	 * We take the input and pass it to the method to check if the last name is
	 * valid
	 */
	public void userLastName() {
		System.out.println("Enter Your Last Name : ");
		String lastName = scanner.next();
		rules.lastName(lastName);
	}
	/**
	 * We take the input and pass it to the method to check if the email is
	 * valid
	 */
	public void userEmail() {
		System.out.println("Enter Email : ");
		String email = scanner.next();
		rules.lastName(email);
	}
	/**
	 * We take the input and pass it to the method to check if the mobile number is
	 * valid or not with country code
	 */
	public void userPhoneNo() {
		System.out.println("Enter Mobile Number : ");
		String Phoneno = scanner.next();
		rules.lastName(Phoneno);
	}
	/**
	 * We take the input and pass it to the method to check if the mobile number is
	 * valid or not with country code
	 */
	public void userPassword() {
		System.out.println("Enter Password : ");
		String password = scanner.next();
		rules.lastName(password);
	}
}
