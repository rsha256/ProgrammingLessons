package ps_3;
public class tables {
	public static void main(String[] args) {
		//array with random numbers
		int[] arr = {5,6,2,3,1,4,5,2,9,3,4,2}; 
		
		/* Why nested for loops are needed
		 * ===============================
		 * The outside for loop is to increment through the array.
		 * This allows us to get the element to do the table for.
		 * The inside for loop is to increment from 1 to 10.
		 * It allows us to get the number to which the number from the array is multiplied with.
		 */

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < 10; j ++){
				// num increments from 1 to 10
				int num = j +1; 
				// product is equal to the element in the array multiplied by num
				int product = arr[i] * num; 
				//print out to console
				System.out.println( arr[i] + " x " + num + " = " + product);
			}
			//extra space
			System.out.println("\n"); 
		}
	}
}