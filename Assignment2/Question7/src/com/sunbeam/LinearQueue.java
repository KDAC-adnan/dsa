package com.sunbeam;

public class LinearQueue {

	private  final int SIZE;
	private int[] arr;
	private int front;
	private int rear;
	
	public LinearQueue(int size)
	{
		SIZE=size;
		this.arr=new int[SIZE];
		front=0;
		rear=0;
	}
	
	public void push(int data)
	{
		arr[rear]=data;
		rear++;
	}
	
	public void pop()
	{
		front++;
	}
	
	public int peek()
	{
		return arr[front];
	}
	
	public boolean isFull()
	{
		return rear==SIZE;
	}
	
	public boolean isEmpty()
	{
		return front==rear;
	}
}
