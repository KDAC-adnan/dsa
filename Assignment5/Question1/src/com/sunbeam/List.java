package com.sunbeam;

public class List {

	public class Node {
		private int data;
		private Node next;
		private Node prev;

		public Node(int data) {
			this.data = data;
			prev = next = null;
		}
	}

	private Node head;
	private int count;

	public List() {
		head = null;
		count = 0;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int getLength() {
		return count;
	}

	public void addFirst(int data) {
		Node nn = new Node(data);
		if (isEmpty()) {
			head = nn;
			nn.next = head;
			nn.prev = head;
		} else {
			nn.next = head;
			nn.prev = head.prev;
			head.prev.next = nn;
			head.prev = nn;
			head = nn;
		}
		count++;
	}

	public void addLast(int data) {
		Node nn = new Node(data);
		if (isEmpty()) {
			head = nn;
			nn.next = nn;
			nn.prev = nn;
		} else {
			nn.next = head;
			nn.prev = head.prev;
			head.prev.next = nn;
			head.prev = nn;
		}
		count++;
	}

	void addAtPosition(int data, int pos) {
		if (head == null || pos == 1) {
			{
				addFirst(data);
				return;
			}
		} else if (pos > count) {
			{
				addLast(data);
				return;
			}
		} else {
			Node trav = head;
			Node nn = new Node(data);
			for (int i = 1; i < pos - 1; i++)
				trav = trav.next;
			nn.prev = trav;
			nn.next = trav.next;
			trav.next = nn;
			trav.next.prev = nn;

			count++;
		}
	}

	public void deleteFirst() {
		if (isEmpty()) {
			{
				System.out.println("List is empty!");
				return;
			}
		} else if (head.next == head)
			head = null;
		else {
			head.prev.next = head.next;
			head.next.prev = head.prev;
			head = head.next;
		}
		count--;
	}

	public void deleteLast() {
		if (isEmpty())
			return;
		else if (head.next == head) {
			head = null;
			return;
		} else {
			// head.prev.prev.next=head;
			// head.prev=head.prev.prev;
			// a. add first node into next of second last node
			head.prev.prev.next = head;
			// b. add second last node into prev of first node
			head.prev = head.prev.prev;

		}
		count--;
	}

	public void deleteAtPosition(int pos) {
		if (isEmpty()) {
			System.out.println("List is empty");
		} else if (pos == 1 || head.next == head) {
			deleteFirst();
		} else if (pos > count) {
			deleteLast();
		} else {
			Node trav=head;
			for(int i=1;i<pos;i++)
				trav=trav.next;
			trav.prev.next=trav.next;
			trav.next.prev=trav.prev;
			count--;
		}
	}

	public void display() {
		if (isEmpty())
			System.out.println("List is empty");
		else {
			Node trav = head;
			do {
				System.out.print("->" + trav.data);
				trav = trav.next;
			} while (trav != head);
		}
		System.out.println();
	}

}
