package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationRules {
	/**
	 * We have used 2 class Pattern and Matcher for checking & matching the pattern
	 * [1] This method is created to check the first name using the regex pattern
	 * [2] This method is created to check the Last name using the regex pattern [3]
	 * Method to check the regex pattern for the emailId [4] Method to check the
	 * regex pattern for the Phone number format [5] Method to check the regex
	 * pattern for the password
	 */
	public String input;

	/**
	 * [1] 1. We are passing the first name to this method and we define the regex
	 * pattern 2. First name starts with Cap and has minimum 3 characters 3. We have
	 * used the compile method of the pattern class to create the object for the
	 * pattern 4. Then we use the Matcher class to interpret the pattern object & it
	 * checks the string passed if it matches the pattern 5. Then we are using the
	 * matches() method to check if it matches or not.
	 * 
	 * @param firstName - we pass the first name of the user to check
	 */
	public void firstName(String firstName) {
		input = "([A-Z]{1}[a-z]{2,})";
		Pattern p = Pattern.compile(input);
		Matcher m = p.matcher(firstName);
		if (m.matches()) {
			System.out.println("Valid Input");
		} else {
			System.out.println("Sorry!! InValid Input");
			System.out.println("Try valid Input");
		}

	}

	/**
	 * [2] 1. We are passing the first name to this method and we define the regex
	 * pattern 2. First name starts with Cap and has minimum 3 characters 3. We have
	 * used the compile method of the pattern class to create the object for the
	 * pattern 4. Then we use the Matcher class to interpret the pattern object & it
	 * checks the string passed if it matches the pattern 5. Then we are using the
	 * matches() method to check if it matches or not.
	 * 
	 * @param lastName - we pass the last name of the user to check
	 */
	public void lastName(String lastName) {
		input = "([A-Z]{1}[a-z]{2,})";

		// Pattern p = Pattern.complie("((?=.*\\d).{8,20})");
		Pattern p = Pattern.compile(input);
		Matcher m = p.matcher(lastName);
		if (m.matches()) {
			System.out.println("Valid Input");
		} else {
			System.out.println("Sorry!! InValid Input");
			System.out.println("Try valid Input");
		}
	}

	/**
	 * [3] 1. We are passing the first name to this method and we define the regex
	 * pattern 2. Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz &
	 * in) with precise @ and . positions
	 * 
	 * @param email - we pass the email id to check the regex
	 */
	public void email(String email) {
		input = "^[a-z0-9]+([_+-.][0-9a-z]+)*@[a-z]+.[a-z]{2,3}$";

		// Pattern p = Pattern.complie("((?=.*\\d).{8,20})");
		Pattern p = Pattern.compile(input);
		Matcher m = p.matcher(email);
		if (m.matches()) {
			System.out.println("Valid Input");
		} else {
			System.out.println("Sorry!! InValid Input");
			System.out.println("Try valid Input");
		}

	}
    /**
     * 
     * Country code follow by space and 10 digit number
     * @param phoneno - user input of phone number
     */
	public void phoneno(String phoneno) {
		input = "^(0/91)?[7-9][0-9]{9}$";

		// Pattern p = Pattern.complie("((?=.*\\d).{8,20})");
		Pattern p = Pattern.compile(input);
		Matcher m = p.matcher(phoneno);
		if (m.matches()) {
			System.out.println("Valid Input");
		} else {
			System.out.println("Sorry!! InValid Input");
			System.out.println("Try valid Input");
		}

	}
	/**
	 * [5] method for password
	 * Rule 1 : minimum 8 Characters
	 * Rule 2 : Should have at least 1 Upper Case
	 * @param password
	 */
	public void password(String password) {
		input = "^(?=.*[A-Z])(?=.*[a-z]).{8,}$";

		// Pattern p = Pattern.complie("((?=.*\\d).{8,20})");
		Pattern p = Pattern.compile(input);
		Matcher m = p.matcher(password);
		if (m.matches()) {
			System.out.println("Valid Input");
		} else {
			System.out.println("Sorry!! InValid Input");
			System.out.println("Try valid Input");
		}
	}
}