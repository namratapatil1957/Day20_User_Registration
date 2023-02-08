package com.bridgelabz.Testing;

import java.util.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class Sample_Email {
	
	private String email;
	private boolean expected;

	public Sample_Email(String email, boolean expected) {
		
		super();
		this.email = email;
		this.expected = expected;
		
	}
	
@Parameterized.Parameters 
public static Collection input() {
	
	return  Arrays.asList(new Object[][] {{"abc+100@gmail.com",true},{"abc-100@yahoo.com,",true},
		{"abc.100@abc.com.au",true},{"abc@1.com,",false},{"abc..2002@gmail.com",false},
		{"abc()*@gmail.com",false},{"abc@gmail.com.1a",false},{"abc@.com.my",false}});
	
}

@Test
public void sample_email() {
	
	Pattern p = Pattern.compile("^[0-9a-zA-Z]+([_+-.a-z0-9A-Z]+)*[@][a-zA-Z]+[.][a-z]{2,4}([.][a-z]{2})?");
	
	Matcher m = p.matcher(email);
	
	if (m.matches()) {
		System.out.println(" Sample email is Valid ");
	}else {
		System.out.println(" Sample email is Invalid ");
	}
	
	Assert.assertEquals(this.expected, m.matches());
	
}

}
