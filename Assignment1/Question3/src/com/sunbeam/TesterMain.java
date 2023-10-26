package com.sunbeam;


public class TesterMain {
	public static int searchNonRepeating(int arr[],int size)
	{
		int res=-1;
		
		for(int i=0;i<size;i++)
		{
			boolean flag=false;
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
					flag=true;
			}
			if(flag==false)
				{
				return res=arr[i];
				}
		}
		return res;
	}

	public static void main(String[] args)
	{
		int[] arr= {1, 2, 3, -1, 2, 1, 0, 4,-1,7,8};
		System.out.println("Non repeating element:"+searchNonRepeating(arr,arr.length));
	}
}
