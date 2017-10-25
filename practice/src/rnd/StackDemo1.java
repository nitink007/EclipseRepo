package rnd;

import dataStructures.stack.StackImplLinkedList;

public class StackDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackImplLinkedList stack = new StackImplLinkedList();
		
		stack.push("kik");
		stack.push("act");
		stack.push("lib");
		stack.push("pim");
		stack.push("sip");
		
		stack.printList();
		
		stack.pop();
		
		System.out.println("\n");
		
		stack.printList();
	}

}
