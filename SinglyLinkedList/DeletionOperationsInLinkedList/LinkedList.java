package DeletionOperationsInLinkedList;

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
		length++;
		System.out.println(data+" is Inserted into list");
	}
		
	
	public Node deleteAtLast()
	{
		if(head==null)
		{
			System.out.println("List is empty... Can't remove ");
			return null;
		}
		else if(head.next==null)
		{
			Node temp=head;
			int value=temp.data;
			head=null;
			System.out.println(value+ " is removed from list which is at head position ");
			length--;
			return temp;
			
		}
		else
		{
			Node current=head;
			while(current.next.next!=null)
			{
				current=current.next;
			}
			Node temp=current.next;
			int value=current.next.data;
			current.next=null;
			System.out.println(value+" is removed from list which is at last ");
			length--;
			return temp;
		}
	}
	
	public int deleteAtHead()
	{
		if(head==null)
		{
			System.out.println("Deletion not possible ");
			return -1;
		}
		else
		{
			int value=head.data;
			head=head.next;
			System.out.println(value+" is deleted from list which is at head ");
			length--;
			return value;
		}
	}
	
	public void deleteAtIndex(int index)
	{
		if(head==null)
		{
			System.out.println("List is empty... No elements to delete ");
			return;
		}
		if(index==0)
		{
			head=head.next;
			System.out.println("Node at index "+index+" is deleted");
			return;
		}
		else
		{
			Node current=head;
			
			for(int i=0;i<index-1 && current!=null;i++)
			{
				current=current.next;
			}
			if(current==null || current.next==null)
			{
				System.out.println("Index is out of List ");
				return;
			}
			else
			{
				current.next=current.next.next;
				System.out.println("Node at index "+index+" is deleted");
				return;
			}
		}
	}
	
	
	public Node deleteAfter(int value)
	{
			boolean isThere=search(value);
			if(!isThere)
			{
				System.out.println("Yoour entered value is "+value+" not in the List to remove next element");
				return null;
			}
			else
			{
				Node current=head;
				while(current.next!=null && current.data!=value)
				{
					current=current.next;
				}
				Node temp=current.next;
				current.next=current.next.next;
				System.out.println("Node after "+value +" is deleted ");
				return temp;
			}
	}
	
	public void deleteKey(int value)
	{
		if(head==null)
		{
			System.out.println("List is empty.....No elements to Delete ");
			return ;
		}
		else
		{
			Node current=head;
			Node previous=null;
			if(current!=null && current.data==value)
			{
				System.out.println(value+" is deleted from list" );
				head=head.next;
			}
			else
			{
				while(current!=null && current.data!=value)
				{
					previous=current;
					current=current.next;
				}
				if(current==null)
				{
					System.out.println(value +" is not in the list");
					return;
				}
				else
				{
					previous.next=current.next;
					System.out.println(value+" is removed from list ");
					return;
				}
			}
		}
	}
	
	
	
	public boolean search(int value)
	{
		boolean isThere=false;
		if(head==null)
		{
			isThere=false;
		}
		else
		{
			Node current=head;
			while(current!=null)
			{
				if(current.data==value)
				{
					isThere=true;
					break;
				}
				else
				{
					isThere=false;
				}
				current=current.next;
			}
		}
		return isThere;
	}
	
	
	
	public void deleteLinkedList()
	{
		head=null;
		System.out.println("Linkedlist is deleted");
	}
	
	public void traverse()
	{
		if(head==null)
		{
			System.out.println("List is empty ");
		}
		else
		{
			System.out.println("List items are: ");
			Node current=head;
			while(current.next!=null)
			{
				System.out.print(current.data+"-->");
				current=current.next;
			}
			System.out.println(current.data);
		}
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
	}
}
