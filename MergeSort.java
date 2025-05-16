package sorting;

public class MergeSort {
	
	public static void print(int[] arr)
	{
		for(int  i = 0 ; i < arr.length ; i ++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}


	private static void mergeSort(int[] nums, int si , int ei ) {
		// TODO Auto-generated method stub
		if(si >= ei)
			return;
		
		
		int  mid = si + (ei -si)/2;
		mergeSort(nums , si , mid);//left part
		mergeSort(nums , mid+1 , ei);//right part
		merge(nums , si , mid, ei);
	
	}
	
	private static void merge(int[] nums, int si, int mid, int ei) {
		// TODO Auto-generated method stub
		int temp[] = new int[ei-si+1];
		int  i = si;
		int k = 0;
		int j = mid+1;
		while(i <= mid && j <= ei)
		{
			if(nums[i] < nums[j])
			{
				temp[k] = nums[i];
				i++;
			}
			else
			{
				temp[k] = nums[j];
				j++;
			}
			k++;
		}
		
		
		//left part
		while( i <= mid)
		{
			temp[k++] = nums[i++];
		}
		
		//right part
		while(j <= ei)
		{
			temp[k++] = nums[j++];
		}
		
		
		for(k = 0 ,i =si  ;  k < temp.length ; k++ , i++)
		{
			nums[i] = temp[k];
		}
	}

	public static void main(String[] args) {
		int [] nums = {6,3,9,5,2,8};
		
		mergeSort(nums , 0 , nums.length-1);
		print(nums);
	}

}
