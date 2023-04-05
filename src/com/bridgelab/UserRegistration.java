package com.bridgelab;

import java.util.regex.Pattern;

public class UserRegistration {
	public boolean Validation (String firstname) {
		Pattern pat=Pattern.compile("^[A-Z][a-zA-Z]{2,}");
		boolean matches=pat.matcher(firstname).matches();
		return matches;
	}

}
