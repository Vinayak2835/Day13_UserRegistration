package com.Day13;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserValidation  {
	// static regular expressions
	static final String FIRST_NAME = "[A-Z]{1}[a-z]{2,}$";
	static final String LAST_NAME = "[A-Z]{1}[a-z]{2,}$"; 
	static final String EMAIL_PATTERN = "^[A-Za-z0-9+_.]+@[A-Za-z0-9+_.]+$";
	static final String PHONE_NUMBER = "^[0-9]{2}[\\s][0-9]{10}$";
	static final String PASSWORD_PATTERN = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
	static Scanner sc;

public static void validateUser( ) {
	
	User user = (checkPattern, input) -> {
		
		try {
			if(input == null) {
				throw new UserException("Hey Give Valid Input");
			}
			else if( !(Pattern.matches(checkPattern,input))) {
				throw new UserException("Hey Give Valid Input");
			}
			else {
			System.out.println("Pattern Matches");
		}
		}
		catch ( UserException e) {
			String printMessage = e.errorMessage;
			System.out.println(printMessage);
			validateUser();
		}
	};
	
	sc = new Scanner(System.in);
	
	/**
     * @return valid output if pattern matches
     */
	System.out.println("Enter a FirstName:");
	String firstName = sc.nextLine();
	user.userValidate( FIRST_NAME, firstName);
	
	/**
     * @return valid output if pattern matches
     */
	System.out.println("Enter a LastName:");
	String lastName = sc.nextLine();
	user.userValidate( LAST_NAME, lastName);
	
	/**
     * @return valid output if pattern matches
     */
	System.out.println("Enter an Email:");
	String email = sc.nextLine();
	user.userValidate(EMAIL_PATTERN  , email);
	
	/**
     * @return valid output if pattern matches
     */
	System.out.println("Enter a PhoneNumber:");
	String phone_Number = sc.nextLine();
	user.userValidate(PHONE_NUMBER, phone_Number);
	/**
     * @return valid output if pattern matches
     */
	System.out.println("Enter an Password:");
	String password = sc.nextLine();
	user.userValidate(PASSWORD_PATTERN  , password);
	}
}
