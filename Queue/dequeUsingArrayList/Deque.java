package dequeUsingArrayList;

import java.util.ArrayList;

public class Deque<T> {
	
	int size;
	ArrayList<T>q;
	int maxSize;
	public Deque(int size)
	{
		this.maxSize=size;
		q=new ArrayList<T>();
	}
	
	public void addFront(T data)
	{
		if(q.size()==this.maxSize)
		{
			
			System.out.println("Queue is Full ");
			return;
		}
		else
		{
			q.add(0,data);
			System.out.println(data+" inserted at front ");
			this.size++;
		}
	}
	
	public void addRear(T data)
	{
		if(q.size()==maxSize)
		{
			System.out.println("Queue is full ");
			return;
		}
		else
		{
			q.add(data);
			System.out.println(data+" inserted at rear");
			this.size++;
		}
	}
	
	public T removeFront()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty ");
			return null;
		}
		this.size--;
		T data=q.remove(0);
		System.out.println(data+" is removed from Front ");
		return data;
	}
	
	public T removeRear()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty ");
			return null;
		}
		this.size--;
		T data=q.remove(q.size()-1);
		System.out.println(data+" is removed from rear ");
		return data;
	}
	
	public boolean isEmpty()
	{
		return q.isEmpty();
	}
	
	public boolean isFull()
	{
		return size==this.maxSize;
	}
	
	public T getFront()
	{
		return q.get(0);
	}
	
	public T getRear()
	{
		return q.get(q.size()-1);
	}

	public int getSize()
	{
		return q.size();
	}
	public void printQueue()
	{
		System.out.println("Dequeue elements: ");
		for(int i=0;i<q.size();i++)
		{
			System.out.print(q.get(i)+" ");
		}
		System.out.println();
	}
	
	public static void main(String args[])
	{
		Deque<Integer> qq=new Deque<Integer>(3);
		qq.addFront(20);
		qq.addFront(30);
		qq.addRear(70);
		qq.addRear(80);
		qq.addRear(90);
		qq.removeFront();
		qq.removeRear();
		System.out.print(qq.isEmpty());
		qq.printQueue();
	}
}
