package com.regex;

import java.util.Scanner;

public class UserRegistration {

	Scanner scanner = new Scanner(System.in);

	/**
	 * We have put a while loop for user choice.
	 */
	public void choice() {
		UserDetails userdetails = new UserDetails();
		while (true) {
			System.out.println("Enter 1 To Verify First Name\n" + "Enter 2 To Verify Last Name\n"
					+ "Enter 3 To Verify User Email\n" + "Enter 4 To Verify User Mobile NUmber with country code\n"
					+ "Enter 5 To Verify password\n" + "Enter 0 To Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 5:
				userdetails.userPassword();
				break;
			case 4:
				userdetails.userPhoneNo();
				break;
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
