package com.bridgelab;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		UserRegistration user=new UserRegistration();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first name to validate");
		String firstname=sc.next();
		if(user.Validationfirstname(firstname)==true) {
			System.out.println("Valid firstname");
		}else {
			System.out.println("InValid firstname");
		}
		System.out.println("enter last name to validate");
		String lastname=sc.next();
		if(user.ValidationLastname(lastname)==true) {
			System.out.println("Valid lastname");
		}else {
			System.out.println("InValid laststname");
		}
		System.out.println("enter mailId to validate");
		String mail=sc.next();
		if(user.ValidationLastname(lastname)==true) {
			System.out.println("Valid mail Id");
		}else {
			System.out.println("InValid mail Id");
		}

	}

}
