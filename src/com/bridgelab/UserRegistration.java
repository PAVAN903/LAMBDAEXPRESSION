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
				"^[a-zA-Z0-9]+([!@#$%^&*()_+.,][a-zA-Z0-9]+)*[@][a-zA-Z]{2,}[.][a-zA-Z]{2,3}([.][a-zA-Z]{2})?$\");");
		boolean matches = pat.matcher(mail).matches();
		return matches;
	}

}
