/**
 * @author RISHITA CHOUBEY
 * Testing Exercise 3
 */
package com.cg.Lab2;


import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise3Test {
	
	Exercise3 obj=new Exercise3();

	@Test
	public void test_getSorted_GivenEmptyIntegerArray_ShouldReturn0AsInteger() {
		int numbers[]= {};
		int result=obj.getSorted(numbers);
		assertEquals(0,result);
	}
	
	
	@Test
	public void test_getSorted_Given1IntegerArray_ShouldReturn_SortedIntegerArray() {
		int numbers[]= {1};
		int result=obj.getSorted(numbers);
		assertEquals(1,result);
	}
	@Test
	public void test_getSorted_Given2IntegerArray_ShouldReturn_SortedAndReversedIntegerArray() {
		int numbers[]= {4,2,6,25,7};
		int result =obj.getSorted(numbers);
	    
		assertEquals(25,numbers[0]);
		assertEquals(7,numbers[1]);
		assertEquals(6,numbers[2]);
		assertEquals(4,numbers[3]);
		assertEquals(2,numbers[4]);
		assertEquals(5, numbers.length);
	}

}
