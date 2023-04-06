package com.bridgelab;

import java.util.regex.Pattern;

public class UserRegistration {
	public boolean Validationfirstname(String firstname) {
		Pattern pat = Pattern.compile("^[A-Z][a-zA-Z]{2,}");
		boolean matches = pat.matcher(firstname).matches();
		return matches;
	}

	public boolean ValidationLastname(String lastname) {
		Pattern pat = Pattern.compile("^[A-Z][a-zA-Z]{2,}");
		boolean matches = pat.matcher(lastname).matches();
		return matches;
	}

	public boolean Validationmail(String mail) {
		// E.g. abc.xyz@bl.co.in
		// Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in)
		Pattern pat = Pattern.compile(
				"^[a-zA-Z0-9]+([!@#$%^&*()_+.,][a-zA-Z0-9]+)*[@][a-zA-Z]{2,}[.][a-zA-Z]{2,3}([.][a-zA-Z]{2})?$");
		boolean matches = pat.matcher(mail).matches();
		return matches;
	}
	public boolean Validationmobile(String mobileNumber) {
		Pattern pat = Pattern.compile("^[0-9]{2}[0-9]{10}");
		boolean matches = pat.matcher(mobileNumber).matches();
		return matches;
	}
	public boolean ValidationPaasword1(String passwordRule1) {
		Pattern pat = Pattern.compile("^[a-z]{8,}");
		boolean matches = pat.matcher(passwordRule1).matches();
		return matches;
	}
	public boolean ValidationPaasword2(String passwordRule2) {
		Pattern pat = Pattern.compile("^[a-zA-Z]{8,}");
		boolean matches = pat.matcher(passwordRule2).matches();
		return matches;
	
	}
	public boolean ValidationPaasword3(String passwordRule3) {
		Pattern pat = Pattern.compile("^[a-zA-Z]{8,}[0-9]{1,}");
		boolean matches = pat.matcher(passwordRule3).matches();
		return matches;
	
	}
}
