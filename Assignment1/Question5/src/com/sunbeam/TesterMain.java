package com.sunbeam;

public class TesterMain {

	public static int linearSearch(int arr[],int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
			
		int arr[]= {1,5,3,2,4,7,8};
		int res=linearSearch(arr,3);
		if(res==-1)
			System.out.println("key not found!!");
		else
			System.out.println("Element found at:"+res);
	}

}
