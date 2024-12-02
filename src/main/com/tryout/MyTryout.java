package com.tryout;

import java.util.Optional;

public class MyTryout {

	public static void main(String[] args) {
		checkOptionNullable("Test");

		checkOptionNullable(null);
}
	
	public static boolean checkOptionNullable(String str) {
		//System.out.println("Testing");
		//String str = "String";
		//str = null;
		
		boolean avail = Optional.ofNullable(str).isPresent();
		System.out.println("Optional.ofNullable "+ str  + " is " + avail);
		return avail;
	}
}
