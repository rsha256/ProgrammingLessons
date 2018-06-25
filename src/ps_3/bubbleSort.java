package ps_3;
public class bubbleSort {
	public static void main(String[] args){
		printArr(sort(new int[]{6, 8, 3, 9,4, 7,5,2,1}));
	}

	public static int[] sort(int[] arr){
		int c = -1;
		int x;
		while(c != 0){
			c = 0;
			for(int i = 0; i < arr.length-1; i++){
				if(arr[i] > arr[i+1]){
					x = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = x;
//					C++;
				}
			}
		}
		return arr;
	}
	
	public static void printArr(int[] arr){
		System.out.print("[ " + arr[0]);
		for(int i = 1; i < arr.length; i++){
			System.out.print(" , "+ arr[i]);
		}
		System.out.print("]");
	}
}
