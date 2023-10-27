package com.sunbeam;

import java.util.Arrays;

public class BubbleSort {

	public static int bubbleSort(int arr[], int n) {
		int count = 0;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				count++;
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
		return count;
	}

	public static int improvedBubbleSort(int arr[], int n) {
		int count = 0;
		int flag = 0;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				count++;
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;
				}

			}
			if(flag==0)
				break;
		}
		return count;
	}

	public static void main(String[] args) {

		int[] arr = { 55, 44, 22, 66, 11, 33 };
		System.out.println("Before Bubble sort");
		System.out.println(Arrays.toString(arr));
		System.out.println("After Bubble sort");
		System.out.println("No. of comparison:" + bubbleSort(arr, arr.length));
		System.out.println(Arrays.toString(arr));
		System.out.println("No. of  on sorted array:" + improvedBubbleSort(arr, arr.length));
		System.out.println(Arrays.toString(arr));
	}

}
