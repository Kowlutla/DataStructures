package SortingOfLinkedList;

public class LinkedListSorting 
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
	
	
	
	
	public void sortList()
	{
		Node current=head;
		while(current!=null && current.next!=null)
		{
			Node temp=current.next;
			while(temp!=null)
			{
				if(current.data>temp.data)
				{
					int i=current.data;
					current.data=temp.data;
					temp.data=i;
				}
				temp=temp.next;
			}
			current=current.next;
		}
		System.out.println("- - - - - - - List is sorted- - --  - - - - - - - - - \n");
		
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
