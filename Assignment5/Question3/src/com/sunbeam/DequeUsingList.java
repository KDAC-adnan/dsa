package com.sunbeam;

public class DequeUsingList {

    List list = new List();

    public void addFront(int data) {
        list.addFirst(data);
    }

    public void addRear(int data) {
        list.addLast(data);
    }

    public void removeFront() {
        list.deleteFirst();
    }

    public void removeRear() {
        list.deleteLast();
    }

    public int getFront() {
        return list.getFirstElement();
    }

    public int getRear() {
        return list.getLastElement();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.getLength();
    }
    
    public void display()
    {
    	list.display();
    }
}

