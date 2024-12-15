package com.test.stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

//import org.junit.Test;
import org.junit.jupiter.api.Test;

import com.tryout.MyTryout;

public class MyStreamTest {

	@Test
	public void testStream_Using_Intermediate() {
	}
	
	@Test
	public void testStream_Using_Terminal() {

		var strings = List.of("one", "two", "three");
		
		var upperCaseList = strings.stream()
				.map(String::toUpperCase)
				.toList();
		
		System.out.println(upperCaseList);
		
		assertEquals(3,  upperCaseList.size());
		
	}

}
