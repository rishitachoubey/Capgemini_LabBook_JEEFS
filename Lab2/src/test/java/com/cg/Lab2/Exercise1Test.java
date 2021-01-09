package com.cg.Lab2;

import static org.junit.Assert.*;

import org.junit.Test;

/**@author RISHITA CHOUBEY
 * Testing Exercise1
 */
public class Exercise1Test
{
    private Exercise1 exercise1;
    private static int SINGLE_NUMBER=100;
    
    public void setup()
    {
    	exercise1= new Exercise1(); 
    }
    
    @Test
    public void test_getSecondSmallest_GivenEmptyIntegerArray_ShouldReturn0AsInteger()
    {
    	int newNumbers[]= {};
    	int result= Exercise1.getSecondSmallest(newNumbers);
        assertEquals( 0, result );
    }
    public void test_getSecondSmallest_GivenTwoInteger_ShouldReturn5AsInteger()
    
    {
    	int newNumbers[]= {5,3};
    	int result= Exercise1.getSecondSmallest(newNumbers);
        assertEquals( 5, result );
    }
    public void test_getSecondSmallest_Given1InIntegerArray_ShouldReturn1AsInteger() {
		int newNumbers[]= {SINGLE_NUMBER};
		int result = Exercise1.getSecondSmallest(newNumbers);
		assertEquals(SINGLE_NUMBER, result);
	}
    
    public void test_getSecondSmallest_GivenIntegerArray_ShouldReturnSecondSmallestAsInteger()
    {
    	int[] newNumbers= new int[] {4,1,7,8};
    	
    	int result= Exercise1.getSecondSmallest(newNumbers);
        assertEquals( 4, result);
    }
}
