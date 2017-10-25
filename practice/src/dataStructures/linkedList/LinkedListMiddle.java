package dataStructures.linkedList;

public class LinkedListMiddle {
	
//	Node head;
//	LinkedListDemo2 ll = new LinkedListDemo2(head);
	
//	public void createSampleLinkedList() {
//		System.out.println(head);
//		ll.add("nitin");
//		ll.add("Aman");
//		ll.add("Kesh",10);
//		ll.add("Kumar");
//		ll.add("Varun");
//		ll.add("new", 2);
//		ll.printList();
//		System.out.println(head);
//	}

	public Node add(Node head, Object data) {
		Node newNode = new Node(data, null);
		if (head==null) {
			head = newNode;
			System.out.println(newNode+" When list null");
			return head;
		}
		else {
			newNode.next = head;
			head = newNode;
			System.out.println(newNode+" when elements in list");
			return head;
		}
	}
	
	public void printList(Node head) {
		Node n = head;
		while (n!=null) {
			System.out.print(n.data+" -> ");
			n = n.next;
		}
	}
	
	public Node findMiddle(Node head) {
		Node n = head;
		Node m = head;
		while (n!=null && n.next!=null) {
			n = n.next.next;
			m = n.next;
			return m;
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		
		Node head = null;
		LinkedListMiddle lMiddle = new LinkedListMiddle();
		head = lMiddle.add(head,"nitin");
		head = lMiddle.add(head,"sd");
		head = lMiddle.add(head,"df");
		head = lMiddle.add(head,"nr");
		head = lMiddle.add(head,"ls");
		head = lMiddle.add(head,"in");
		head = lMiddle.add(head,"it");
		head = lMiddle.add(head,"pu");
		head = lMiddle.add(head,"my");
		lMiddle.printList(head);
		
		System.out.println(head);
		
		Node mid = lMiddle.findMiddle(head);
		System.out.println(mid.data);
		
	}
	

}
