package com.sunbeam;

import java.util.Arrays;

public class SelectionSort {

	public static int selectionSort(int arr[],int n)
	{
			int count=0;
			for(int i=0;i<n-1;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					count++;
					if(arr[i]>arr[j])
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		return count;
	}
	public static void main(String[] args) {

		int[] arr= {55,44,22,66,11,33};
		System.out.println("Before sort");
		System.out.println(Arrays.toString(arr));
		System.out.println("After sort");
		System.out.println("No. of comparison:"+selectionSort(arr,arr.length));
		System.out.println(Arrays.toString(arr));
	}

}
