package Junits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RepeatedTestExample {
	@RepeatedTest(3)
	public void Test1()
	{
		assertEquals(14,Calculator.add(9, 5));
		
	}
	@Test
	public void Test2()
	{
		assertEquals(2,Calculator.sub(10, 8));
	}


}
