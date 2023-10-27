package com.sunbeam;

import java.util.Scanner;

public class TesterMain {

	public static void main(String[] args) {
		int choice;
		LinearQueue lq=new LinearQueue(5);
		Scanner scanner=new Scanner(System.in);
		do
		{
			System.out.println("0.Exit \n1.Push \n2.Pop \n3.Peek");
			choice=scanner.nextInt();
			switch (choice) {
			case 1:
				if(lq.isFull())
					System.out.println("Queue is full");
				else
				{
					System.out.println("Enter element:");
					int element=scanner.nextInt();
					lq.push(element);
				}
				break;
			case 2:
				if(lq.isEmpty())
					System.out.println("Queue is empty");
				else
					lq.pop();
				break;
			case 3:
				if(lq.isEmpty())
					System.out.println("Queue is empty");
				else
					System.out.println(lq.peek());
				break;
			default:
				break;
			}
		}
		while(choice!=0);
		scanner.close();
	}

}
