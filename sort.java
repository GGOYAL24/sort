/* Apply selection sort on the following set of data for ascending order:- 
   
   300, 100, 400, 150, 200, 120, 355, 325, 225, 175
   
*/

/**
 * @author Gautam Goyal
 * 
 * Email: gautamgoyal24012001@gmail.com
 * 
 * Date: 13-09-2021
 * 
 * Version: 1.1
 * 
 */


public class sort {

	public static void main(String[] args) {
				
		System.out.println("\n\n\t\t\t************************ Selection Sort ************************\n"); // print title
	    
		// Variables
		
		int i,j; 
		
		int[] num = { 300, 100, 400, 150, 200, 120, 355, 325, 225, 175 }; // array
		
		int arraySize = num.length;           // array size
		
		System.out.print("\nGiven Array: ");  // given array
		
		for(i = 0; i < arraySize; i++)  {      // LOOP 10 times
		
			
			if ( arraySize == i+1) {          // for last number and will not show COMA Sign (,)
			
				System.out.print(num[i]);     // index of num at i
			
			}
			
			else {
				
				System.out.print(num[i] + ", ");  // index of num at i
				
			}
		
		} // loop end
		
		// S O R T I N G
		
		// Variables
		
		int k, l, max = 0, min = 0;	
			
		for(k = 0; k < arraySize; k++)  {                      // loop for 10 times
			
		   min = num[k];  // let value at index (k) is min
		   
		   for(l = k+1; l < arraySize; l++)  {                      // loop for 10 times
			
			   max = num[l]; // let value at index (l) is max
			
		        if(min > max) {                                        // compare indexes
		        	
		        	// interchanging the values 
		        	
				    num[k] = max;
				    num[l] = min;
				    min = max;
				    
		        }
		        
		        else { // do nothing
		        	
		        }
		
		} // inner loop end
		   
	} // outter loop end
		
		System.out.println("Sorted Array in ascending order: "); // printf
		
		for(int o: num){
			
		if ( num[arraySize-1] == o) {          // for last number and will not show COMA Sign (,)
				
			System.out.print(0);
		
		}
		
		else {
			
			System.out.print(num[i] + ", ");  // index of num at i
		}
	}
		
	}
}
