package dataStructures.stack;

import dataStructures.linkedList.LinkedListDemo;
import dataStructures.linkedList.Node;

public class StackImplLinkedList extends LinkedListDemo {
	
//	Object data;
//	Node head;
	
	public void push(Object data) {
		add(data);
	}
	
	public void pop() {
		remove();
	}

}
