package StackUsingTwoQueues;

import java.util.LinkedList;
import java.util.Queue;

public class Stack {
	Queue<Integer> q1=new LinkedList<Integer>();
	Queue<Integer> q2=new LinkedList<Integer>();
	
	public void push(int data)
	{
		if(q1.isEmpty())
		{
			q1.add(data);
		}
		else
		{
			for(int i=0;i<q1.size();i++)
			{
				q2.add(q1.remove());
			}
			q1.add(data);
			for(int i=0;i<q2.size();i++)
			{
				q1.add(q2.remove());
			}
		}
	}
	
	public int peek()
	{
		if(q1.isEmpty())
		{
			throw new QueueEmptyException("Underflow exception");
		}
		else
		{
			return q1.peek();
		}
	}
	
	public int pop()
	{
		if(q1.isEmpty())
		{
			throw new QueueEmptyException("Underflow exception");
		}
		return q1.remove();
	}
	public boolean isEmpty()
	{
		return q1.size()==0;
	}
}
