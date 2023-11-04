package com.sunbeam;

public class StackUsingDCLL {
	
	List list=new List();
	
	public void push(int data)
	{
		list.addFirst(data);
	}
	
	public void pop()
	{
		list.deleteFirst();
	}
	
	public int peek()
	{
		return list.getFirstElement();
	}
}
