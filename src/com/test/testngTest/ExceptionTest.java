package com.test.testngTest;

import org.testng.annotations.Test;

public class ExceptionTest {
	
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void test1() {
		String x = "100A";
		Integer.parseInt(x);
	}

}
