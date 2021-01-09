
/**@author RISHITA CHOUBEY
*  Exercise1
*  Method Name 	getSecondSmallest 
*  Method Description 	Get the second smallest element in the array 
*  Argument 	int[] 
*  Return Type int 
*  Logic 	Sort the array and return the second smallest element in the array 
 */



package com.cg.Lab2;

public class Exercise1 {

public static void main(String[]args)
{
		int[] arr= new int[] {6,1,5,8,9};
		int res= getSecondSmallest(arr);
		System.out.println("The second smallest element is:"+res);

	}

	static int getSecondSmallest(int[] array) {
		int temp, size;
	      if(array.length==0)
	      {
	    	  return 0;
	      }
	      size = array.length;

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){
	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      
	    //return the second largest element  
		return array[1];
	}

}
