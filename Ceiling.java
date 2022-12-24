/* The ceiling function of a real number is the least integer number greater than or 
   equal to the given number */ 

import java.util.Scanner;
import java.util.Arrays;
	public class Ceiling {
		public static void main( String[] args ) {
		Scanner in = new Scanner( System.in );
		System.out.println(" Enter the Array: ");
	
	// input the array using for loop
	
		int[] arr = new int[10];
	
		for( int k=0; k<arr.length; k++ ) 
			arr[k] = in.nextInt();
		
	// input the target element 
	// -1 if there is no ceiling element 
		
		System.out.print(" Enter the target element : ");
		int target = in.nextInt();
		
	int ans = Ceiling( arr , target );
	
	// print the result

	   System.out.println( ans );	

		}

	// return the index : smallest number >= target 	
	static int Ceiling( int[] arr , int target ) {

// but what if the target element is greater than the greatest element in the array		
		
		if( target > arr[arr.length-1] ) {
			 return -1;
			}
		
		 int start = 0;
		 int end   = arr.length - 1;
		   	while( start <= end ) {

		// calculate the mid

				int mid = start + ( end - start ) / 2;
				
				if( arr[mid] < target ) {
					start = mid + 1;
					}
				else if( arr[mid] > target ) {
					end = mid - 1;
					}
				else {
					return mid;
				}
			}
		return start;
		}
}
