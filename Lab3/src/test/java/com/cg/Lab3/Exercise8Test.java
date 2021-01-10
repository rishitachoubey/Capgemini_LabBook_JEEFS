package com.cg.Lab3;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;


public class Exercise8Test {	

		private Exercise8Test pos;
		@Before
		public void setup() 
		{
			pos = new Exercise8Test();
		}
		
		@Test
		public void test_PositiveString_GivenString_ShouldReurnAsString() 
		{
	    
		String str="ANT";
		boolean result=  Exercise8.isPositiveString(str);
		  assertEquals(true, result);
		}
		@Test
		public void test_PositiveString_GivenSameString_ShouldReurnAsString() 
		{
	    
		String str="aaabb";
		boolean result=  Exercise8.isPositiveString(str);
		  assertEquals(true, result);
		}
		
		  
	
}
