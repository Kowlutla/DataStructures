package LengthOfLinkedList;

public class LinkedList 
{
	public class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
		}
		public String toString()
		{
			return ""+data;
		}
	}
	
	Node head;
	public void push(int data)
	{
		Node node=new Node(data);
		node.next=head;
		head=node;
		System.out.println(data+" is pushed into LinkedList");
	}
	
	
	public int getLength()
	{
		int length=0;
		Node current=head;
		while(current!=null)
		{
			length++;
			current=current.next;
		}
		return length;
	}
	
	public int getLength1()
	{
		return getLength1(head);
	}
	
	public int getLength1(Node node)
	{
		if(node==null)
		{
			return 0;
		}
		return 1+getLength1(node.next);
	}
	
	public void traverse()
	{
		Node current=head;
		while(current.next!=null)
		{
			System.out.print(current+"- ->");
			current=current.next;
		}
		System.out.println(current);
	}
}
