package com.tryout;

import java.util.Optional;

public class MyTryout {

	public static void main(String[] args) {
		checkOptionNullable("String");
	}
	
	public static boolean checkOptionNullable(String str) {
		System.out.println("Testing");
		//String str = "String";
		//str = null;
		
		boolean avail = Optional.ofNullable(str).isPresent();
		System.out.println("Str is " + avail);
		return avail;
	}
}
