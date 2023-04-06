package com.bridgelab;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first name to validate");
		String firstname = sc.next();
		if (user.Validationfirstname(firstname) == true) {
			System.out.println("Valid firstname");
		} else {
			System.out.println("InValid firstname");
		}
		System.out.println("enter last name to validate");
		String lastname = sc.next();
		if (user.ValidationLastname(lastname) == true) {
			System.out.println("Valid lastname");
		} else {
			System.out.println("InValid laststname");
		}
		System.out.println("enter mailId to validate");
		String mail = sc.next();
		if (user.Validationmail(mail) == true) {
			System.out.println("Valid mail Id");
		} else {
			System.out.println("InValid mail Id");
		}
		System.out.println("enter mobile number to validate");
		String mobile = sc.next();
		if (user.Validationmobile(mobile) == true) {
			System.out.println("Valid mobile number");
		} else {
			System.out.println("InValid mobile number");
		}
		System.out.println("enter password to validate");
		String passwordRule1 = sc.next();
		if (user.ValidationPaasword1(passwordRule1) == true) {
			System.out.println("Valid password");
		} else {
			System.out.println("InValid password");
		}
		System.out.println("enter password to validate");
		String passwordRule2 = sc.next();
		if (user.ValidationPaasword2(passwordRule2) == true) {
			System.out.println("Valid password");
		} else {
			System.out.println("InValid password");
		}
		System.out.println("enter password to validate");
		String passwordRule3 = sc.next();
		if (user.ValidationPaasword3(passwordRule3) == true) {
			System.out.println("Valid password");
		} else {
			System.out.println("InValid password");
		}

	}

}
