package LinkedListInsertion;

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
	
	
	public void insertAfterNode(Node previous,int data)
	{
		Node node=new Node(data);
		if(previous==null)
		{
			System.out.println("Insertion not possible");
			return;
		}
		node.next=previous.next;
		previous.next=node;
		length++;
		System.out.println(data +" is inserted after "+previous.data);
	}
	public void insertAfter(int value,int data)
	{
		Node node=new Node(data);
		Node current=head;
		while(current.next!=null && current.data!=value)
		{
			current=current.next;
		}
		node.next=current.next;
		current.next=node;
		length++;
		System.out.println(data+" inserted after "+value);
	}
	
	
	public void insertBefore(int value,int data)
	{
		if(!searchElement(value))
		{
			System.out.println("Insertion not possible Because "+value+" is not there in list");
		}
		else
		{
			Node node=new Node(data);
			Node current=head;
			if(current==null)
			{
				head=node;
			}
			while(current.next!=null && current.next.data!=value)
			{
				current=current.next;
			}
			node.next=current.next;
			current.next=node;
			length++;
			System.out.println(data+" inserted before "+value);
		}
	}
	
	public void insertAtFirst(int data)
	{
		Node node=new Node(data);
		node.next=head;
		head=node;
		length++;
		System.out.println(data+" inserted at first ");
	}
	
	public void insertAtIndex(int index,int data)
	{
		Node node=new Node(data);
		Node current=head;
		if(index==0)
		{
			node.next=head;
			head=node;
		}
		else 
		{
			for(int i=0;i<index-1;i++)
			{
				current=current.next;
			}
			node.next=current.next;
			current.next=node;
		}
		length++;
		System.out.println(data+ " inserted at index "+index);
	}
	
	public boolean searchElement(int data)
	{
		boolean isThere=false;
		Node current=head;
		if(current==null)
		{
			isThere=false;
		}
		else
		{
			while(current!=null)
			{
				if(current.data==data)
				{
					isThere=true;
					break;
				}
				current=current.next;
			}
		}
		return isThere;
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
