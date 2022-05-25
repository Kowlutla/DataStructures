package QueueUsingLinkedList;

public class Queuedemo {

	public static void main(String[] args) {
		Queue q=new Queue();
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		//System.out.println(q.peek());
		q.deQueue();
		q.deQueue();
		q.deQueue();
		//q.deQueue();
		//q.deQueue();
		//System.out.println(q.deQueue());
		//System.out.println(q.deQueue());
		
		System.out.println("Size: "+q.getSize());
		q.peek();

	}

}
