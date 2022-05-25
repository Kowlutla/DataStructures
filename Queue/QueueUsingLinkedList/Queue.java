package QueueUsingLinkedList;

public class Queue 
{
	private class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
		}
		
	}
	Node front,rear;
	int size=0;
	public void enQueue(int data)
	{
		
		
		Node temp=rear;
		rear=new Node(data);
		//rear.next=null;
		if(isEmpty())
		{
			front=rear;
		}
		else
		{
			temp.next=rear;
		}
		System.out.println(data+" is added to Queue ");
		size++;
	}
	
	public int deQueue()
	{
		
		if(!isEmpty())
		{
			int value=front.data;
			front=front.next;
			System.out.println(value+" is removed from Queue");
			size--;
			return value;
		}
		else
		{
			System.out.println("No elements to remove........");
			return -1;
		}
	}
	
	public int peek()
	{
		if(!isEmpty())
		{
			System.out.println(front.data+" is peeked from Queue");
			return front.data;
		}
		else
		{
			System.out.println("No elements to peek");
			return -1;
		}
	}
	
	public int getSize()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return size==0;
	}
	
}
