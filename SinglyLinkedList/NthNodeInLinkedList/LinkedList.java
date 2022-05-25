package NthNodeInLinkedList;

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
	int length=0;
	
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
		length++;
	}
	
	public Node getNth(int index)
	{
		if(head==null)
		{
			return null;
		}
		else
		{
			Node current=head;
			for(int i=0;i<index && current!=null;i++)
			{
				current=current.next;
			}
			if(current!=null)
			{
				return current;
			}
			else
			{
				return null;
			}
		}
	}
	
	
	public Node getNth1(int index)
	{
		Node current=head;
		int count=0;
		while(current!=null)
		{
			if(count==index)
				return current;
			count++;
			current=current.next;
		}
		return null;
	}
	
	
	public Node getNthFromEnd(int index)
	{
		int length=0;
		Node current=head;
		while(current!=null)
		{
			length++;
			current=current.next;
		}
		if(index>length)
			return null;
		current=head;
		for(int i=1;i<(length-index);i++)
		{
			current=current.next;
		}
		return current;
	}
	
	public Node getNthfromEnd1(int index)
	{
		Node current=head;
		Node ref=head;
		int count=0;
		if(head!=null)
		{
			while(count<index)
			{
				if(ref==null)
				{
					System.out.println(index+" is greater than number of element in list ");
					return null;
				}
				count++;
				ref=ref.next;
			}
		}
		while(ref!=null)
		{
			ref=ref.next;
			current=current.next;
		}
		return current;
	}
	
	
	
	public void traverse()
	{
		Node current=head;
		if(current==null)
		{
			System.out.println("No elements in list");
		}
		else
		{
			System.out.println("List elements are: ");
			while(current.next!=null)
			{
				System.out.print(current.data+" = >");
				current=current.next;
			}
			System.out.println(current.data);
			System.out.println();
		}
	}
	
	
}
