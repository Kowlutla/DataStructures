package SearchElementInLinkedList;

public class LinkedList 
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
	
	
	
	public boolean searchElement(int key)
	{
		Node current=head;
		while(current!=null)
		{
			if(current.data==key)
			{
				return true;
			}
			current=current.next;
		}
		return false;
	}
	
	
	public boolean searchElement1(int data)
	{
		return searchElement1(head,data);
	}
	
	public boolean searchElement1(Node head,int value)
	{
		if(head==null)
		{
			return false;
		}
		if(head.data==value)
		{
			return true;
		}
		return searchElement1(head.next,value);
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
	
	
	
	public int getCount()
	{
		int count=0;
		Node current=head;
		while(current!=null)
		{
			count++;
			current=current.next;
		}
		return count;
	}
	
}
