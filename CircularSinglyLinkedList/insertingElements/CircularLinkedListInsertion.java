package insertingElements;

public class CircularLinkedListInsertion {

	private class Node
	{
		private Node next;
		int data;
		public Node(int data)
		{
			this.data=data;
		}
		public String toString()
		{
			return Integer.toString(data);
		}
	}
	
	Node last;
	int length;
	public CircularLinkedListInsertion()
	{
		last=null;
		length=0;
	}
	
	
	public void insertAtStart(int data)
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
		}
		length++;
		System.out.println(data+" inserted at head ");
	}
	
	
	public void insertAfter(int value,int data)
	{
		if(last==null)
		{
			System.out.println("Insertion not possible");
		}
		else
		{
			Node node=new Node(data);
			Node current=last.next;
			do 
			{
				
				if(current.data==value)
				{
					node.next=current.next;
					current.next=node;
					if(current.next==last)
					{
						last=node;
					}
				}
				current=current.next;
				
			}
			while(current!=last);
			System.out.println(data+" is inserted after "+value);
		}
	}
	
	
	
	
	public void insertAtLast(int data)
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
		System.out.println(data+ " Inserted at the Last");
	}
	
	public void traverse()
	{
		if(last==null)
		{
			System.out.println("List is empty");
			return;
		}
		Node current=last.next;
		while(current!=last)
		{
			System.out.print(current+"- - >");
			current=current.next;
		}
		System.out.println(current);
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -  - - - - - ");
	}
	
	
}
