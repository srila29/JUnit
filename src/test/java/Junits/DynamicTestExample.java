package Junits;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTestExample {
	@TestFactory
	public List<DynamicTest> Method1()
	{
		return Arrays.asList(DynamicTest.dynamicTest("Positive Test", ()->assertTrue(StringFunctionsExample.isPalindrome("madam"))),DynamicTest.dynamicTest("Negative Test", ()->assertFalse(StringFunctionsExample.isPalindrome("try"))));
	}

}
