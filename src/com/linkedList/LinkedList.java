package com.linkedList;

public class LinkedList {
	public static void main(String[] args) {
		SingleLinkedList sll = new SingleLinkedList();
		
		sll.insertFirst(56);
		sll.insertLast(70);
		sll.insertInBetween(56,30);
		sll.printNodeElement();
		sll.findNode(30);
	}
}