package com.sunbeam;

public class TesterMain {

	public static int rankOfElement(int arr[],int size,int ele)
	{
		int count=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]<=ele)
				count++;
		}
		return count;
	}
	public static void main(String[] args) {

		
		int[] arr= { 10, 20, 15, 3, 4, 4, 1 };
		System.out.println("Rank of 4 is:"+rankOfElement(arr,arr.length,4));
	}

}
