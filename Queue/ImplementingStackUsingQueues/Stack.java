package ImplementingStackUsingQueues;



public class Stack {
	public int maxSize;
	Queue q1;
	Queue q2;
	public Stack(int maxSize)
	{
		this.maxSize=maxSize;
		q1=new Queue(maxSize);
		q2=new Queue(maxSize);
	}
	
	public void push(int data)
	{
		if(q1.isEmpty())
		{
			q1.enQueue(data);
		}
		else
		{
			for(int i=0;i<q1.size();i++)
			{
				q2.enQueue(q1.deQueue());
			}
			q1.enQueue(data);
			for(int i=0;i<q2.size();i++)
			{
				q1.enQueue(q2.deQueue());
			}
		}
		System.out.println(data+" added to Stack");
	}
	
	public int pop()
	{
		int value=0;
		if(q1.isEmpty())
		{
			System.out.println("No elements to POP");
		}
		else
		{
			value=q1.deQueue();
			System.out.println(value+" is Removed from stack");
		}
		return value;
	}
	
	public int getSize()
	{
		return q1.size();
	}
	
	public void show()
	{
		if(q1.size()==0)
		{
			System.out.println("NO elements in Stack");
			return;
		}
		System.out.println("Stack elements are: ");
		for(int i=0;i<=q1.size();i++)
		{
			System.out.print(q1.deQueue()+" ");
		}
		System.out.println();
	}

}
