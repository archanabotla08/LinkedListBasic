package com.blz.linkedlistimplementationbasic;

public class LinkedListBasic {
	public Node head = null;
	public Node tail = null;
	
	public void addNodeToLinkedList(int data) {
		Node newNode = new Node(data,null);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.nextRefernce = newNode;
			tail = newNode;
		}
		
		
	}
	public void display() {
		Node temp = head;
		if(head == null) {
			System.out.println("Linked List is Empty");
		}
		System.out.println("LinkedList : ");
		while(temp !=null) {
			
			System.out.println(temp.getData());
			temp = temp.nextRefernce;
		}
		
	}
	public static void main(String[] args) {
		//System.out.println("Welcome Message");
		LinkedListBasic linkedList= new LinkedListBasic();
		//UC1
		linkedList.addNodeToLinkedList(70);
		linkedList.addNodeToLinkedList(30);
		linkedList.addNodeToLinkedList(56);	
		linkedList.display();
	}

}
