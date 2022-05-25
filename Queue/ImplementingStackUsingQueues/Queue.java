package ImplementingStackUsingQueues;

public class Queue
{
	int maxSize;
	int array[];
	int front=0;
	int rear=0;
	int size=0;
	public Queue(int maxSize)
	{
		this.maxSize=maxSize;
		array=new int[maxSize];
	}
	
	public void enQueue(int data)
	{
		if(isFull())
		{
			System.out.println("Queue is Full... Wait for sometime...");
		}
		else
		{
			array[rear]=data;
			rear=(rear+1)%maxSize;
			size=size+1;
		//	System.out.println(data+" is Added to Queue");
		}
	}
	
	public int deQueue()
	{
		int value=array[front];
		if(isEmpty())
		{
			System.out.println("Queue is Empty... No one is remianing....");
		}
		else
		{
			front=(front+1)%maxSize;
			size=size-1;
		}
		//System.out.println(value+" is removed from queue");
		return value;
	}
	
	public int Peek()
	{
		return array[front];
	}
	
	public boolean isEmpty()
	{
		return size()==0;
	}
	
	public boolean isFull()
	{
		return size()==maxSize;
	}
	
	public void show()
	{
		System.out.println("Queue elements are: ");
		for(int i=0;i<size;i++)
		{
			System.out.println(array[(front+i)%maxSize]);
		}
	}
	
	public int size()
	{
		return size;
	}
}
