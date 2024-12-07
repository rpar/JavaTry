package com.test;

import com.tryout.MyTryout;
import org.junit.jupiter.api.Test;

import com.tryout.MyTryout;

public class MyTryoutTest {

	@Test
	public void testOptional() {
		//MyTryout myTryout = new MyTryout();
		
		System.out.println("Starting");
		boolean asserted = MyTryout.checkOptionNullable("String");
		
		assert(asserted);
		
	}
}
