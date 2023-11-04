package com.sunbeam;

public class TesterMain {

	public static void main(String[] args) {
		
		List list=new List();
		list.addFirst(50);
		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		
		list.display();
		
		
		
		list.addLast(60);
		list.addLast(70);
		list.addLast(80);
		
		list.display();
		list.addAtPosition(5,1);
		list.addAtPosition(45,6);
		list.addAtPosition(85,11);
		
		list.display();
		
		list.deleteFirst();
		list.deleteFirst();
		list.display();
		
		list.deleteLast();
		list.deleteLast();
		list.display();
		
		list.deleteAtPosition(3);
		list.display();
		
		list.deleteAtPosition(1);
		list.display();
		
		list.deleteAtPosition(7);
		list.display();
		
		System.out.println("\nLength is:"+list.getLength());
	}

}
