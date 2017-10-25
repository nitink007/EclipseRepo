package rnd;

import dataStructures.linkedList.LinkedListDemo;
import dataStructures.linkedList.Node;

public class LinkedListImpl {
	
	LinkedListDemo ll = new LinkedListDemo();
	Node head;
	
	public void createSampleLinkedList() {
		ll.add("nitin");
		ll.add("Aman");
		ll.add("PP",10);
		ll.add("Kumar");
		ll.add("Varun");
		ll.add("new", 2);
		ll.add("blink");
		ll.add("disigner");
		ll.printList();
	}
	
	public void reverseLinkedList() {

	}

	public static void main(String[] args) {
		
		LinkedListImpl l = new LinkedListImpl();
		
		
		for (int i = 0; i < 10; i++) {
			l.ll.addAsc(l);
		}
		l.ll.printList();
		
		
	}
	
}
