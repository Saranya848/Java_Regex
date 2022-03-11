package com.regex;

import java.util.Scanner;

class UserDetails {

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
}

public class UserRegistration {

	Scanner scanner = new Scanner(System.in);

	/**
	 * We have put a while loop then the user closes the scanner.
	 */
	public void choice() {
		UserDetails userdetails = new UserDetails();
		while (true) {
			System.out.println("Enter 1 To Verify First Name\n" + "Enter 2 To Verify Last Name\n" + "Enter 3 To Verify User Email\n" + "Enter 0 To Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 3:
				userdetails.userEmail();
				break;
			case 2:
				userdetails.userLastName();
				break;
			case 1:
				userdetails.userFirstName();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong input \n Please enter Correct input");
				continue;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Please enter user registration details");
		UserRegistration ur = new UserRegistration();
		ur.choice();
		ur.scanner.close();
	}
}
