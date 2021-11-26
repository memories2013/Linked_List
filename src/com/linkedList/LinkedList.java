package com.linkedList;

public class LinkedList {
	public static void main(String[] args) {
		SingleLinkedList sll = new SingleLinkedList();
		
		sll.insertFirst(70);
		sll.insertFirst(30);
		sll.insertFirst(56);
		
		sll.printNodeElement();
	}
}