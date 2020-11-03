package com.blz.linkedlistimplementationbasic;

public class LinkedListBasic {
	public Node head = null;
	public Node tail = null;
	
	public void addNodeToLinkedList(int data) {
		Node newNode = new Node(data,null);
		head = newNode;
		tail = newNode;
		
	}
	public void display() {
		Node temp = head;
		System.out.println("Node Added : " +temp.getData());
	}
	public static void main(String[] args) {
		//System.out.println("Welcome Message");
		LinkedListBasic linkedList= new LinkedListBasic();
		linkedList.addNodeToLinkedList(70);
		linkedList.display();
	}

}
