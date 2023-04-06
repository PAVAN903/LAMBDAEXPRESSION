/**
 * 
 */
package com.bridgelab;

import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.Pattern;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

class EmailValidationTest {
	EmailValidation testmail=new EmailValidation();
	@Test
	void testEmail() {
		   String email = "abc@gmail.com.aa.au";
	        String expected = "Invalid email";
	        String actual = validateEmail(email);
	        assertEquals(expected, actual);
	    }
	private String validateEmail(String email) {
		 Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([-+.][a-zA-Z0-9]+)*[@][a-zA-Z0-9]{1,}[.][a-zA-Z]{2,3}([.][a-zA-Z]{2,3})?$");

	        // Match user input against regex pattern
	        java.util.regex.Matcher matcher = pattern.matcher(email);
	        if (matcher.matches()) {
	            return "Valid email";
	        } else {
	            return "Invalid email";
	        }
		
	}
	
	}


