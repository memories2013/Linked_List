package com.linkedList;

public class SingleLinkedList {
	Node head;
	
	public void insertFirst(int data) {
		Node node = new Node();
		node.setData(data);
		node.setNext(head);
		head = node;
	}
	
	public void insertLast(int data) {
		Node currentNode = head;
	
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		Node node = new Node();
		node.setData(data);
		currentNode.setNext(node);	
	}
	
	public void printNodeElement() {
		Node currentNode = head;
		System.out.println("------Linked List Element------");
		while(currentNode != null) {
			currentNode.display();
			currentNode = currentNode.next;
		}
	}
}