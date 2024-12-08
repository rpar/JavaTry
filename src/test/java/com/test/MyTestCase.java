package com.test;

//import org.junit.Test;
import org.junit.jupiter.api.Test;

import com.tryout.MyTryout;

public class MyTestCase {

	@Test
	public void testOptional() {
		
		boolean asserted = MyTryout.checkOptionNullable("String");
		
		assert(asserted);		
	}

}
