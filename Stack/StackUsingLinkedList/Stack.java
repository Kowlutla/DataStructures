package StackUsingLinkedList;

public class Stack 
{
	Node head=null;
	public void push(int data)
	{
		Node node=new Node(data);
		Node temp=head;
		head=node;
		head.next=temp;
	}
	
	public int peek() 
	{
			if(head==null)
			{
				System.out.println("Stack underflow....!! ");
				return 0;
			}
			return head.data;
	}
	
	public int pop() 
	{
		if(head==null)
		{
			System.out.println("Stack underflow....!! ");
			return 0;
		}
		int value=head.data;
		head=head.next;
		return value;
	}
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void show()
	{
		Node current=head;
		while(current.next!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
	}

}
