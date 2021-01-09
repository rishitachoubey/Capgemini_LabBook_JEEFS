/**
 *@author RISHITA CHOUBEY
 * Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order
* Method Name 	getSorted 
* Method Description 	Return the resulting array after reversing the numbers and sorting it 
* Argument 	int [] 
* Return Type 	int 
* Logic 	Accept and integer array, reverse the numbers in the array, sort it and return the resulting array. 
* Hint 
* Convert the numbers to String to reverse it 
*/

package com.cg.Lab2;

import java.util.Arrays;

public class Exercise3 {

	public static int getSorted(int[] numbers) {
		
		//checking for empty array
		 
		if(numbers.length==0)
		{
			return 0;
	
		}
		
		else if(numbers.length>1) {
			Arrays.sort(numbers);
			numbers=reverseArr(numbers);
			for(int i=0;i<numbers.length;i++)
			{
				System.out.println(numbers[i]);
			}
			
		}
		
		
		return numbers[0];
		
	}

	private static int[] reverseArr(int[] numbers) {
		int[] reverse= new int[numbers.length];
		for(int i=0; i<numbers.length/2; i++)
		{ 
			int temp = numbers[i]; 
			numbers[i] = numbers[numbers.length -i -1]; 
			numbers[numbers.length -i -1] = temp; 
			}

		return numbers;
	}
	
	
	

}
