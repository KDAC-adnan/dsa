package com.sunbeam;

public class CircularQueue {

	private int[] arr;
	private final int SIZE;
	private int front;
	private int rear;
	private int count;

	public CircularQueue(int size) {
		this.SIZE = size;
		front = -1;
		rear = -1;
		arr = new int[SIZE];
		count = 0;
	}

	public void push(int data) {// a. reposition rear (inc)
		rear = (rear + 1) % SIZE;
		// b. add data at rear index
		arr[rear] = data;
		count++;
	}

	public void pop() {
		// a. reposition front
		front = (front + 1) % SIZE;
		if (front == rear)
			front = rear = -1;
		count--;
	}

	public int peek() {
		// a. read/return data of front + 1 index
		return arr[(front + 1) % SIZE];
	}

	public boolean isFull() {
		return count==SIZE;

	}

	public boolean isEmpty() {
		return count==0;
	}
}
