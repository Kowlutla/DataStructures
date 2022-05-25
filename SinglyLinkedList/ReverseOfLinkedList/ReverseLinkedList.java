package ReverseOfLinkedList;

public class ReverseLinkedList
{

	public class Node
	{
		int data;
		Node next;
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
		System.out.println(data+" is inserted into list");
	}
	
	public void swapPairwise()
	{
		Node current=head;
		while(current!=null && current.next!=null)
		{
			int temp=current.data;
			current.data=current.next.data;
			current.next.data=temp;
			current=current.next.next;
		}
	}
	
	
	public void reverse()
	{
		Node current=head;
		Node next=null;
		Node previous=null;
		while(current!=null)
		{
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		head=previous;
		System.out.println("List is reversed");
	}
	
	
	
	
	public void traverse()
	{
		Node current=head;
		System.out.println("List elements are: ");
		System.out.print(current);
		while(current!=null)
		{
			current=current.next;
			System.out.print(" = >"+current);
		}
		System.out.println();
	}

}
