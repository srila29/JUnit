package Junits;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
public class CalculatorTest {
	@Test
	@DisplayName("Addition test")
	@Tag("Sanity")
	public void Test1()
	{
		assertEquals(14,Calculator.add(9, 5));
		
	}
	
	@Test
	@DisplayName("Suntraction test")
	@Tag("Sanity")
	public void Test2()
	{
		assertEquals(2,Calculator.sub(10, 8));
	}

}
