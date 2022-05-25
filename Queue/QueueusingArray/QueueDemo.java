package QueueusingArray;

public class QueueDemo {

	public static void main(String[] args) 
	{
		Queue queue=new Queue(5);
		queue.enQueue(10);
		queue.enQueue(11);
		queue.enQueue(12);
		queue.enQueue(13);
		queue.enQueue(14);
		queue.deQueue();	
		queue.enQueue(15);
		queue.show();

	}

}
