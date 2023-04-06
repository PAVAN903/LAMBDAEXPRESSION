package com.bridgelab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter mail to validate");
		String mail=sc.next();
		Pattern pat=Pattern.compile("^[a-zA-Z0-9]+([-+.][a-zA-Z0-9]+)*[@][a-zA-Z0-9]{1,}[.][a-zA-Z]{2,3}([.][a-zA-Z]{2,3})?$");
	    Matcher matcher=pat.matcher(mail);
	    if(matcher.matches()) {
	    	System.out.println("valid mail");
	    }else {
	    	System.out.println("invalid mail");
	    }
	}

}
