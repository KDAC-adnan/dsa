package com.sunbeam;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
	CircularQueue cq=new CircularQueue(5);
	int choice;
	Scanner scanner=new Scanner(System.in);
	do
	{
		System.out.println("0.Exit \n1.Push \n2.Pop \n3.Peek");
		choice=scanner.nextInt();
		switch (choice) {
		case 1:
			if(cq.isFull())
				System.out.println("Queue is full");
			else
			{
				System.out.println("Enter element:");
				int element=scanner.nextInt();
				cq.push(element);
			}
			break;
		case 2:
			if(cq.isEmpty())
				System.out.println("Queue is empty");
			else
				cq.pop();
			break;
		case 3:
			if(cq.isEmpty())
				System.out.println("Queue is empty");
			else
				System.out.println(cq.peek());
			break;
		default:
			break;
		}
	}
	while(choice!=0);
	scanner.close();

	}

}
