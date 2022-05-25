package implementingQueueUsingTwoStack;

import java.util.Stack;

public class QueueUsingStacks 
{
	Stack <Integer>stack1=new Stack<Integer>();
	Stack<Integer>stack2=new Stack<Integer>();
	
	
	public void enQueue(int data)
	{
		if(stack1.isEmpty())
		{
			stack1.push(data);
		}
		else
		{
			while(!stack1.isEmpty())
			{
				stack2.push(stack1.pop());
			}
			stack1.push(data);
			while(!stack2.isEmpty())
			{
				stack1.push(stack2.pop());
			}
		}
		System.out.println("Queue is Enqueued with "+data);
	}
	
	
	public int deQueue()
	{
		if(stack1.isEmpty())
		{
			System.out.println("No elements in Queue");
			return -1;
		}
		return stack1.pop();
	}
	
	
	public void traverse()
	{
		if(stack1.isEmpty())
		{
			System.out.println("No elements in Queue ");
			return;
		}
		System.out.println("Queue Elements are: ");
		while(!stack1.isEmpty())
		{
			System.out.print(stack1.pop()+" ");
		}
		System.out.println();
		
	}
	
}
