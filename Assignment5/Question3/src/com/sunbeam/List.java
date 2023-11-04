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
    private Node tail;
    private int count;

    public List() {
        head = tail = null;
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
            head = tail = nn;
        } else {
            nn.next = head;
            head.prev = nn;
            head = nn;
        }
        count++;
    }

    public void addLast(int data) {
        Node nn = new Node(data);
        if (isEmpty()) {
            head = tail = nn;
        } else {
            nn.prev = tail;
            tail.next = nn;
            tail = nn;
        }
        count++;
    }

    public void deleteFirst() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        count--;
    }

    public void deleteLast() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        } else if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        count--;
    }

    public int getFirstElement() {
        return head.data;
    }

    public int getLastElement() {
        return tail.data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            Node trav = head;
            while (trav != null) {
                System.out.print("->" + trav.data);
                trav = trav.next;
            }
            System.out.println();
        }
    }
}
