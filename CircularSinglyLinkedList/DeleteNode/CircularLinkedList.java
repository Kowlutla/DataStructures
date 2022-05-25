package DeleteNode;

public class CircularLinkedList
{
	public class Node
	{
		Node next;
		int data;
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
	
	public CircularLinkedList()
	{
		this.last=null;
	}
	
	public void insert(int data)
	{
		Node node=new Node(data);
		if(last==null)
		{
			last=node;
			last.next=last;
		}
		else
		{
			node.next=last.next;
			last.next=node;
			last=node;
		}
		System.out.println(data+" is inserted");
	}
	
	
	public Node deleteAtStart()
	{
		if(last==null)
		{
			System.out.println("No elements to delete");
			return null;
		}
		
		Node node=last.next;
		if(last.next==null)
		{
			last=null;
		}
		else
		{
			last.next=node.next;
		}
		node.next=null;
		System.out.println(node+" is deleted from list at head position ");
		return node;
	}
	
	
	public Node deleteAtLast()
	{
		if(last==null)
		{
			System.out.println("list is empty... not possible to delete any ");
			return null;
		}
		Node current=last.next;
		Node delete_node=last;
		if(last.next==last)
		{
			last=null;
		}
		else
		{
			while(current.next!=last)
			{
				current=current.next;
			}
			current.next=last.next;
			last=current;
		}
		System.out.println(delete_node+" is deleted from last al last position ");
		return delete_node;
	}
	
	
	
	public void deleteAllPrimes()
	{
		System.out.println("Prime numbers are deleted from list: ");
		Node current=last.next;
		do {
			boolean isprime=isPrime(current.data);
			if(isprime)
			{	
				deleteNode(current);
				//System.out.println(current+" ");
			}
			current=current.next;
		}while(current!=last);
		if(isPrime(current.data))
			deleteNode(current);
	}
	
	
	
	private void deleteNode(Node node) {
	
		if(node==last.next)
		{
			last.next=node.next;
			return;
		}
		Node current=last;
		Node temp;
		while(current.next!=node)
		{
			current=current.next;
		}
		current.next=node.next;
		
	}

	private boolean isPrime(int data)
	{
		for(int i=2;i<data;i++)
		{
			if(data%i==0)
			{
				return false;
			}
		}
		return true;
	}

	public void traverse()
	{
		System.out.println("Elements are: ");
		if(last==null)
		{
			System.out.println("No elements in lits");
			//return;
		}

		else
		{
			Node current=last.next;
			while(current!=last)
			{
				System.out.print(current+"- - >");
				current=current.next;
			}
			System.out.println(current);
		}
	}
	
	
	
	
	
	
	
}
