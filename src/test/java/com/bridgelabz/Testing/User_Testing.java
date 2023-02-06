package com.bridgelabz.Testing;

import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.junit.Test;

public class User_Testing {
	
	Scanner sc = new Scanner (System.in);
	
	// pattern for first name
	
	@Test
	public void fName() {

		System.out.println(" Enter the First Name: ");
		String fname = sc.next();

		Pattern p = Pattern.compile("^[A-Z][a-z]{2,}");	
		
		Matcher m = p.matcher(fname);
		
		if (m.find()) {
			System.out.println(" name is valid ");
		}else {
			System.out.println(" name is invalid ");
		}
		
		String actual = fname;
		String excepted = "Namrata";
		
		Assert.assertEquals(excepted, actual);
		
	}
	
	// pattern for last name
	
	@Test
	public void lName() {
		
		System.out.println("\n Enter the Last Name: ");
		String lname = sc.next();

		Pattern p = Pattern.compile("^[A-Z][a-z]{2,}");	
		
		Matcher m = p.matcher(lname);
		
		if (m.find()) {
			System.out.println(" last name is valid ");
		}else {
			System.out.println(" last name is invalid ");
		}
		
		String actual = lname;
		String excepted = "Patil";
		
		Assert.assertEquals(excepted, actual);
		
	}
	
	// pattern for email
	
	@Test
	public void email() {
		
		System.out.println("\n Enter Email: ");
		String email = sc.next();

		Pattern p = Pattern.compile("^[abc][.a-z]*[@][bl][.][co][.a-z]*");	
		
		Matcher m = p.matcher(email);
		
		if (m.find()) {
			System.out.println(" email is valid ");
		}else {
			System.out.println(" email is invalid ");
		}
		
		String actual = email;
		String excepted = "abc.xyz@bl.co.in";
		
		Assert.assertEquals(excepted, actual);
		
	}
	
	// pattern for mobile
	
	@Test
	public void mobile() {
		
		System.out.println("\n Enter Mobile number: ");
		String mobile = sc.next();
		
		Pattern p = Pattern.compile("^(91-)[6-9][0-9]{9}");	
		
		Matcher m = p.matcher(mobile);
		
		if (m.matches()) {
			System.out.println(" mobile number is valid ");
		}else {
			System.out.println(" mobile number is invalid ");
		}
		
		String actual = mobile;
		String excepted = "91 8347234423";
		
		Assert.assertEquals(excepted, actual);
		
	}
	
	// patter for password rule 1 8 characters
	
	@Test
	public void password() {
		
		System.out.println("\n Enter Password: ");
		String password = sc.next();
		
		Pattern p = Pattern.compile("[[a-zA-z0-9]]{8,}");	
		
		Matcher m = p.matcher(password);
		
		if (m.find()) {
			System.out.println(" Password is valid ");
		}else {
			System.out.println(" Password is invalid ");
		}
		
		String actual = password;
		String excepted = "fhgjfgjh";
		
		Assert.assertEquals(excepted, actual);
		
	}
	
	// pattern for password rule 2 upper case
	
	@Test
	public void upper_Case() {
		
		System.out.println("\n Enter the Password ");
		String upper = sc.next();
		
		Pattern p = Pattern.compile("[[a-z][0-9A-Z]+]{8,}");
		
		Matcher m = p.matcher(upper);
			
		if (m.find()) {
			System.out.println(" Uppercase Password is valid ");
		}else {
			System.out.println(" Uppercase Password is Invalid ");
		}
		
		String actual = upper;
		String excepted = "sydfGjhsd";
		
		Assert.assertEquals(excepted, actual);
			
	}
		
	// pattern for password rule 3 numeric number
		
	@Test
	public void number() {
		
		System.out.println("\n Enter the Password ");
		String numeric = sc.next();
		
		Pattern p = Pattern.compile("[[a-z]([0-9]+)([A-Z]+)]{8,}");
		
		Matcher m = p.matcher(numeric);
			
		if (m.find()) {
			System.out.println(" Numeric Password is valid ");
		}else {
			System.out.println(" Numeric Password is Invalid ");
		}
		
		String actual = numeric;
		String excepted = "irioESERnjfds6453";
		
		Assert.assertEquals(excepted, actual);
			
	}
		
	// pattern for password rule 4 special character
	
	@Test
	public void special_Character() {
		
		System.out.println("\n Enter the Password ");
		String special = sc.next();
		
		Pattern p = Pattern.compile("[[a-z]([0-9]+)([A-Z]+)([!#*@$&]+)]{8,}");
		
		Matcher m = p.matcher(special);
					
		if (m.matches()) {
			System.out.println(" Special character Password is valid ");
		}else {
			System.out.println(" Special character Password is Invalid ");
		}
		
		String actual = special;
		String excepted = "iri547@hfkdj";
		
		Assert.assertEquals(excepted, actual);
			
	}

}
