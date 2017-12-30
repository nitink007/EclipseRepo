package dataStructures.queue;

public class QueueImpl {
	
	public static void main(String[] args) {
		QueueDemo<String> q = new QueueDemo<>();
		
		q.enQueue("nitin");
		q.enQueue("aman");
		q.enQueue("anita");
		q.enQueue("nisheeth");
		
		while (!q.isEmpty()) {
			System.out.println(q.deQueue());
		}

	}

}
