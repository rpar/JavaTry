package com.tryout;

import java.util.Optional;

class TestWrap{
	TestWrap2 name;

	public TestWrap2 getName() {
		return name;
	}

	public void setName(TestWrap2 name) {
		this.name = name;
	}
}

class TestWrap2{
	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class OptionalTest {

	
	public static void main(String[] args) {
		mapOptional();		
	}

	public static void mapOptional() {
		
		TestWrap testWrap = new TestWrap();
		TestWrap2 testWrap2 = new TestWrap2();
		testWrap.setName(testWrap2);
		testWrap2.setName("I am Wrap");
		
		String DEFAULT_VALUE = "I am default";
		String name = Optional.of(testWrap).map(TestWrap::getName).map(TestWrap2::getName).orElse(DEFAULT_VALUE);

		System.out.println("Name==>" + name);
	}


}
