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
		input = "^[A-Z]{1}[a-z]{2,}$";
		Pattern p = Pattern.compile(input);
		Matcher m = p.matcher(firstName);
		if (m.matches()) {
			System.out.println("Valid Input");
		} else {
			System.out.println("Sorry!! InValid Input");
			System.out.println("Try valid Input");
		}

	}

}