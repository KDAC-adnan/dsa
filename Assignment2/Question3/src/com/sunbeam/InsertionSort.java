package com.sunbeam;

import java.util.Arrays;

public class InsertionSort {

	public static int insertionSort(int arr[],int n)
	{
		int count=0;
		for(int i=1;i<n;i++)
		{
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp)
			{
				count++;
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		return count;
	}
	public static void main(String[] args) {
		
		int[] arr = { 55, 44, 22, 66, 11, 33 };
		System.out.println("Before Bubble sort");
		System.out.println(Arrays.toString(arr));
		System.out.println("After Bubble sort");
		System.out.println("No. of comparison:" + insertionSort(arr, arr.length));
		System.out.println(Arrays.toString(arr));
		System.out.println("No. of  on sorted array:" + insertionSort(arr, arr.length));
		System.out.println(Arrays.toString(arr));
	}

}
