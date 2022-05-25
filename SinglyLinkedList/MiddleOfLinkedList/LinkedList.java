package MiddleOfLinkedList;

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
	public void insert(int data)
	{
		Node node=new Node(data);
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node current=head;
			while(current.next!=null)
			{
				current=current.next;
			}
			current.next=node;
		}
		System.out.println(data+" inserted into list");
		
	}
	
	public void middleOfLinkedList()
	{
		int length=0;
		Node current=head;
		while(current!=null)
		{
			length++;
			current=current.next;
		}
		int mid=length/2;
		current=head;
		for(int i=1;i<=mid;i++)
		{
			current=current.next;
		}
		System.out.println(current);
	}
	
	
	public void middleOfLinkedList1()
	{
		Node current=head;
		Node temp=head;
		while(current!=null && current.next!=null)
		{
			current=current.next.next;
			temp=temp.next;
		}
		System.out.println("Middle element using 2nd Method:  "+temp);
	}
	
	
	public void middleOfLinkedList2()
	{
		Node current=head;
		int count=0;
		Node temp=head;
		while(current!=null)
		{
			if(count%2==1)
			{
				temp=temp.next;
			}
			count++;
			current=current.next;
		}
		System.out.println("Middle Element using 3rd Method: "+temp);
	}
	
	public void traverse()
	{
		System.out.println("Elements are: ");
		Node current=head;
		while(current.next!=null)
		{
			System.out.print(current+"- >");
			current=current.next;
		}
		System.out.println(current);
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
	}
	
}
