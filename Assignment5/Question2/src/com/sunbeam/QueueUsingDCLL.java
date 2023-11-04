package com.sunbeam;

public class QueueUsingDCLL {

	List list = new List();

	public void enqueue(int data) {
		list.addLast(data);
	}

	public void dequeue() {
		list.deleteFirst();
	}

	public int peek() {
		return list.getFirstElement();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int size() {
		return list.getLength();
	}
}
