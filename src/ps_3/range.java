public class range {
	public static void main(String args[]){
		// random array of integers
		int[] arr = {5,6,2,3,1,4,5,2,9,3,4,2}; 
		
		// set this to the first element
		int max = arr[0], min = arr[0]; 
		
		//started from i = 1 as min and max are already set to arr[0]
		for(int i = 1; i < arr.length; i++){ 
			if(arr[i] > max){
				// update the max and min as you go through the code
				max = arr[i];
				
			}
			if(arr[i] < min){
				// update the max and min as you go through the code
				min = arr[i]; 
			}
		}
		
		//the range is equal to the maximum value minus the minimum value
		int range = max - min;
		
		// should be 8 with the given array
		System.out.println("The range is " + range); 
	}
}