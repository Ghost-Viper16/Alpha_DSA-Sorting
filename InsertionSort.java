package sorting;

public class InsertionSort {


	private static void insertionSort(int[] arr) {
		
		for(int i = 1 ;  i < arr.length  ; i++)
		{
			int curr = i;
			int prev = i-1;
			
			//find out the correct position to insert
			while(prev >= 0 && arr[prev] > arr[curr])
			{
				arr[prev+1] = arr[prev];
				prev--;
			}
			
			// Insertion
			arr[prev] = arr[curr];
		}
		
	}

	//To print 
	public static void printArr(int arr[]) {
		for(int i = 0 ; i < arr.length ; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	
	
	public static void main (String args[])
	{
		int arr[] = { 5,4,1,3,2};
		insertionSort(arr);
		printArr(arr);
	}
}
