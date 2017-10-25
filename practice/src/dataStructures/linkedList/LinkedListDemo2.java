package dataStructures.linkedList;

public class LinkedListDemo2 {
	
	Node head;
	
	public LinkedListDemo2() {
		head=null;
	}
	
	public LinkedListDemo2(Node head) {
		this.head = head;
	}
	
	public void add(Object data) {
		Node newNode = new Node(data, null);
		
		if (head==null) {
			head = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
		
	}
	
	public void add(Object data, int position) {
		Node newNode = new Node(data, null);
		int counter=1;
		if (head==null) {
			head = newNode;
		}
		else {
			if (position==0 || position < 0) {
				System.out.println("Invalid position");
				return;
			}
			
			if (position==1) {
				add(data);
				return;
			}
			Node n = head;
			Node m = head;
			while (n!=null && counter!=position-1) {
				m = n;
				n = n.next;
				counter++;
			}
			if (n!=null) {
				newNode.next = n.next;
				n.next = newNode;
			}
			else {
				newNode.next = m.next;
				m.next = newNode;
				System.out.println("List Size is: "+size()+" Adding item to end");
			}
		}
	}
	
	public void printList() {
		Node n = head;
		while (n!=null) {
			System.out.print(n.data);
			System.out.print(" -> ");
			n = n.next;
		}
	}
	
	public int size() {
		Node n = head;
		int Counter=0;
		while (n!=null) {
			n = n.next;
			Counter++;
		}
		return Counter;
	}
	
	public void remove() {
		if (head==null) {
			System.out.println("No Items in List to remove");
			return;
		}
		head = head.next;
	}
	
	public void remove(int position) {
		Node n = head;
		Node m = head;
		int counter=1;
		
		if (head==null) {
			System.out.println("No Items in List to remove");
			return;
		}
		
		while (n.next!=null && counter!=position) {
			m = n;
			n = n.next;
			counter++;
		}
		
		if (n.next==null && counter==1) {
			head = null;
			return;
		}

		if (n.next!=null) {
			m.next = n.next;
		}
		else {
			m.next = null;
		}
	}

	

	
//	public void removeOnValue(int value) {
//		Node n = head;
//		while () {
//			
//		}
//	}
	
}