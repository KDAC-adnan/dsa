package com.sunbeam;

public class TesterMain {

	public static void main(String[] args) {
		 StackUsingDCLL stack = new StackUsingDCLL();

	        // Pushing elements onto the stack
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);

	        // Peeking at the top element
	        System.out.println("Top element: " + stack.peek()); // Output: 30

	        // Popping an element
	        stack.pop();

	        // Peeking again after popping
	        System.out.println("Top element after pop: " + stack.peek());
	        
	        QueueUsingDCLL queue = new QueueUsingDCLL();

	        // Enqueue elements
	        queue.enqueue(10);
	        queue.enqueue(20);
	        queue.enqueue(30);

	        // Peek at the front element
	        System.out.println("Front element: " + queue.peek()); // Output: 10

	        // Dequeue an element
	        queue.dequeue();

	        // Peek again after dequeue
	        System.out.println("Front element after dequeue: " + queue.peek()); // Output: 20

	        // Check if the queue is empty
	        System.out.println("Is the queue empty? " + queue.isEmpty()); // Output: false

	        // Get the size of the queue
	        System.out.println("Size of the queue: " + queue.size());
	}

}
