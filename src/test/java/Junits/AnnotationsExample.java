package Junits;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnnotationsExample {
	
	@BeforeAll
	public static void method3()
	{
		System.out.println("Inside Before all");
		
	}
	@BeforeEach
	public void method1()
	{
		
		System.out.println("Inside BeforeEach");
	}
	
	@Test
	public void Test1()
	{
		assertEquals(14,Calculator.add(9, 5));
		
		
		System.out.println("Inside Test1");
		
	}
	@Test
	public void Test2()
	{
		assertEquals(2,Calculator.sub(10, 8));
		System.out.println("Inside Iest2");
	}
	
	@AfterEach
	public void method2()
	{
		System.out.println("Inside AfterEach");
	}
	
	@AfterAll
	public static void method4()
	{
		System.out.println("Inside after all");
	}
}
