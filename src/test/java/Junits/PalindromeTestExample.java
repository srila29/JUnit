package Junits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
public class PalindromeTestExample {
@Test
@Tag("Sanity")
public void TestPalindrome()
{
	assertTrue(StringFunctionsExample.isPalindrome("deed"));
}

@Test
@Tag("Sanity")
public void TestIsNotPalindrome()
{
	assertFalse(StringFunctionsExample.isPalindrome("day"));
	}
}

