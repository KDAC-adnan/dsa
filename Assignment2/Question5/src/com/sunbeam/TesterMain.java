package com.sunbeam;

public class TesterMain {

	//Sorting function based on Salary
	public static void insertionSort(Employee arr[],int n)
	{
		for(int i=1;i<n;i++)
		{
			Employee temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j].getSalary()>temp.getSalary())
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}
	
	//Sorting function based on empid
	public static void insertionSortEmpid(Employee arr[],int n)
	{
		for(int i=1;i<n;i++)
		{
			Employee temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j].getEmpId()>temp.getEmpId())
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}
	public static void main(String[] args) {
		
		Employee[] empArr=new Employee[5];
		empArr[0]=new Employee(121,"Jhon",24000);
		empArr[1]=new Employee(124,"Loss",23000);
		empArr[2]=new Employee(123,"Dehadi",22000);
		empArr[3]=new Employee(125,"Jack",21000);
		empArr[4]=new Employee(122,"King",25000);
		
		System.out.println("Before sort on based of salary");
		for (Employee employee : empArr) {
			System.out.println(employee);
		}
		
//		insertionSortEmpid(empArr,empArr.length);
//		System.out.println("Before sort on based of emp id");
//		for (Employee employee : empArr) {
//			System.out.println(employee);
//		}
		
		insertionSort(empArr,empArr.length);
		System.out.println("After sort on based salary");
		for (Employee employee : empArr) {
			System.out.println(employee);
		}
	}

}
