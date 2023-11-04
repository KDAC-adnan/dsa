package com.sunbeam;

public class TesterMain {

	public static void main(String[] args) {
		DequeUsingList deque = new DequeUsingList();
		deque.addFront(10);
		deque.addRear(20);
		deque.addFront(5);

		System.out.println("Original deque:");
		deque.display(); // Output: ->5->10->20

		System.out.println("Front element: " + deque.getFront()); // Output: Front element: 5
		System.out.println("Rear element: " + deque.getRear()); // Output: Rear element: 20

		deque.removeFront();
		deque.removeRear();
		System.out.println("After removing front and rear elements:");
		deque.display(); // Output: ->10

		System.out.println("Is the deque empty? " + deque.isEmpty()); // Output: false

		System.out.println("Size of the deque: " + deque.size()); // Output: 1
	}
}
