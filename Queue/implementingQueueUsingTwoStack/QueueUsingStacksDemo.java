package implementingQueueUsingTwoStack;

public class QueueUsingStacksDemo {

	public static void main(String[] args) 
	{
		QueueUsingStacks q=new QueueUsingStacks();
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(80);
		q.enQueue(40);
		q.enQueue(5);
		q.enQueue(70);
		q.enQueue(1);
		q.enQueue(90);
	//	q.traverse();
		System.out.println("Dequeued Element: "+q.deQueue());
		System.out.println("Dequeued Element: "+q.deQueue());
		System.out.println("Dequeued Element: "+q.deQueue());
		System.out.println("Dequeued Element: "+q.deQueue());
		System.out.println("Dequeued Element: "+q.deQueue());
		System.out.println("Dequeued Element: "+q.deQueue());
		System.out.println("Dequeued Element: "+q.deQueue());
		//System.out.println("Dequeued Element: "+q.deQueue());
		q.traverse();

	}

}
