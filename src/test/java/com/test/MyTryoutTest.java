package com.test;

import org.junit.jupiter.api.Test;

import com.tryout.MyTryout;

public class MyTryoutTest {

	@Test
	public void testOptional() {
		
		System.out.println("Starting");
		boolean asserted = MyTryout.checkOptionNullable("String");
		
		assert(asserted);
		
	}
}
