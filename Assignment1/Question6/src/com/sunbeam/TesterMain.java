package com.sunbeam;

public class TesterMain {

	public static int binarySearchDesc(int arr[],int key)
	{
		int low=0,high=arr.length-1,mid=-1;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(arr[mid]==key)
				return mid;
			else if(key>arr[mid])
				high=mid-1;
			else
				low=mid+1;
		}
		return mid;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {9,8,7,6,5,4,3,2,1};
		System.out.println("Element found at:"+binarySearchDesc(arr,8));
		
	}

}
