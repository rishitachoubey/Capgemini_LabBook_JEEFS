/**@author RISHITA CHOUBEY
 *  Exercise 4: Create a method which accepts an integer array and removes all the duplicates in the array. Return the resulting array in descending order

Method Name 	modifyArray 
Method Description 	Remove duplicates 
Argument 	int [] 
Return Type 	int [] 
Logic 	Remove the duplicate elements in the array and sort it in descending order 
*/

package com.cg.Lab2;



public class Exercise4 {

	public static void main (String[] args) {
		
		int[] array = new int[]{1,4,4,7,5};    
		int n= array.length;
	
	int length = modifyArray(array);
	for(int i=0; i<length; i++)
	System.out.print(array[i]+" ");

	}




	private static int modifyArray(int[] array) {
		int n = array.length;
		//if array length is 0 or 1
		if(n==0 || n==1){
		return n;
		}
		int j = 0,k=0;//for next element
		for (int i=0; i < n-1; i++){
		if (array[i] != array[i+1]){
		array[j++] = array[i];
		}
		}
		array[j++] = array[n-1];
		
		for (int i = 0; i < array.length; i++) {     
            for ( k = i+1; k < array.length; k++) {     
               if(array[i] < array[k]) {    
                   int temp = array[i];    
                   array[i] = array[k];    
                   array[k] = temp;    
               }     
            }     
        }    
		
		return k;
		}
}
