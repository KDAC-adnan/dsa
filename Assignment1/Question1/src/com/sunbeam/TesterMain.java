package com.sunbeam;

public class TesterMain {

	public static int comparisonLinearSearch(int arr[],int size,int key)
	{
		int cnt=1;
		for(int i=0;i<size-1;i++)
		{
			if(key==arr[i])
			{
				break;
			}
			cnt++;
		}
		return cnt;
	}
	
	public static int comparisonBinarySearch(int arr[],int size,int key)
	{
		int cnt=1;
		int low=0,high=size-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==key)
				break;
			else if(key>arr[mid])
				low=mid+1;
			else
				high=mid-1;
			cnt++;
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		
		int[] arr= {66,11,77,22,33,55,44,99,88};	
		System.out.println("Linear No. of comparison:"+comparisonLinearSearch(arr,9,100));
		
		int[] arr1= {11,22,33,44,55,66,77,88,99};	
		System.out.println("Binary No. of comparison:"+comparisonBinarySearch(arr1,9,110));

	}

}
