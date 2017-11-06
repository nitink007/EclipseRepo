package dataStructure.doubleLinkedList;

public class NodeDImpl {
	
	NodeDDemo n = new NodeDDemo();
	
	public void createSampleList(int length) {
		for (int i = 0; i < length; i++) {
			n.add((int)(Math.random()*100+1));
		}
	}

	public static void main(String[] args) {
		
		NodeDImpl node = new NodeDImpl();
		node.createSampleList(9);
//		node.n.printList();
		
//		node.n.add(55, 10);
//		node.n.printList();
		node.n.append(99999);
		node.n.add(111, 5);
		node.n.printList();
		node.n.delete(111);
		node.n.printList();
	}
	

}
