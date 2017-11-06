package dataStructure.doubleLinkedList;

public class NodeDDemo {
	
	NodeD head;
	
	public void add(Object data) {
		if (head == null) {
			head = new NodeD(data);
			return;
		}
		
		NodeD newNode = new NodeD(data);
		newNode.next = head;
		head = newNode;
		newNode.data = data;
	}
	
	public void add(Object data,int position) {
		
		try {
			int counter = 1;
			NodeD n = head;
			NodeD newNode = new NodeD(data);
			
			if (head == null) {
				head = new NodeD(data);
				return;
			}
			if (position==1) {
				add(data);
				return;
			}
		
			while (n!=null) {
				if (counter==position-1) {
					newNode.next = n.next;
					newNode.prev = n.next.prev;
					n.next = newNode;
					n.next.prev = newNode;
					return;
				}
				n = n.next;
				counter++;
			}
			
		} catch (Exception e) {
			System.err.println(e.getCause()+" Suggestion: use append method if want to add element in the end");
		}
	}
	
	public void append(Object data) {
		NodeD newNode = new NodeD(data);
		NodeD n = head;
		
		while (n.next!=null) {
			n = n.next;
		}
		
		newNode.next = n.next;
		newNode.prev = n;
		n.next = newNode;
	}
	
	public void delete(Object data) {
		NodeD n = head;
		
		while (n!=null) {
			if (n.data.equals(data)) {
				n.prev.next = n.next;
				n.next.prev = n.prev;
				return;
			}
			n = n.next;
		}
	}
	
	public void printList() {
		NodeD n = head;
		while (n!=null) {
			System.out.print(n.data+" ");
			n = n.next;
		}
		System.out.println("\n");
	}

	
	
}
