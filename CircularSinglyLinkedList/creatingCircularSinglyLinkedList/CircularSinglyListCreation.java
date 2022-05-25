package creatingCircularSinglyLinkedList;

public class CircularSinglyListCreation 
{
	private class Node
	{
		private Node next;
		private int data;
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
		
		public String toString()
		{
			return ""+data;
		}
	}
	
	Node last;
	int length;
	public CircularSinglyListCreation()
	{
		last=null;
		length=0;
	}
	
	public int getLength()
	{
		return length;
	}
	
	public boolean isEmpty()
	{
		return length==0;
	}
	
	public void createCirculatLinkedList()
	{
		Node a=new Node(1);
		Node b=new Node(2);
		Node c=new Node(3);
		Node d=new Node(4);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=a;
		last=d;
	}
	
	public void traverse()
	{
		if(last==null)
		{
			System.out.println("List is Empty");
			return;
		}
		System.out.println("List items are: ");
		Node first=last.next;
		while(first!=last)
		{
			System.out.print(first+"- - >");
			first=first.next;
		}
		System.out.print(first);
		
	}
	
}
