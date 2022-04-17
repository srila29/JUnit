package Junits;

import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametersExample {
	
	@ParameterizedTest
	@ValueSource(strings={"radar","madam","car"})
	public void Test1(String name)
	{
		assertTrue(StringFunctionsExample.isPalindrome(name));
	}
	@ParameterizedTest

	@ValueSource(ints={4,5,6,7})
	public void Test2(int num)
	{
		assertTrue(num%2==0);
	}
}
