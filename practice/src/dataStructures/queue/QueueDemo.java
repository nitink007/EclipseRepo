package dataStructures.queue;

import dataStructures.linkedList.Node;

public class QueueDemo<T> {
	
	Node front;
	Node rear;
	
	public QueueDemo() {
		front=null;
		rear=null;
	}
	
	public void enQueue(T data) {
		Node newNode = new Node(data,null);
		if (rear==null) {
			front=newNode;
			rear=newNode;
		}
		Node tmp;
		rear.setNext(newNode);
		newNode.setNext(null);
	}
	
	public T deQueue() {
		if (rear==null || front==null) {
			System.out.println("Queue is empty");
			return null;
		}
		T value = (T) front.getData();
		front = front.getNext();
		return value;
		

	}

	public boolean isEmpty() {
		return(rear==null || front==null);
	}
	
}
