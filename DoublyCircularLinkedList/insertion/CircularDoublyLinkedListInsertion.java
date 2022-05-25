package insertion;

public class CircularDoublyLinkedListInsertion 
{
	public class Node
	{
		Node next;
		Node previous;
		int data;
	
		
		public Node(int data)
		{
			this.data=data;
			next=null;
			previous=null;
		}
		public String toString()
		{
			return ""+data;
		}
	}
	
	
	
	Node head;
	Node tail;
	int length=0;
	
	public void insertAtHead(int data)
	{
		Node node=new Node(data);
		node.previous=tail;
		node.next=head;
		if(head!=null)
		{
			node.next=head;
		}
		head=node;
		if(tail==null)
		{
			tail=node;
		}
		System.out.println(data+" inserted into list at head");
	}
	
	
	
	public void insertAtLast(int data)
	{
		Node node=new Node(data);
		node.previous=tail;
		node.next=head;
		if(tail!=null)
		{
			tail.next=node;
		}
		tail=node;
		if(head==null)
		{
			head=node;
		}
		System.out.println(data+" inserted at last ");

	}
	
	
	
	public void insertAfter(Node previous,int data)
	{
		Node node=new Node(data);
	}
	
	public void traverse()
	{
		if(head==null)
		{
			System.out.println("No elements in list");
		}
		else
		{
			System.out.println("List Items are: ");
			Node current=head;
			while(current!=tail)
			{
				System.out.print(current+" - - >");
				current=current.next;
			}
			System.out.println(current);
			System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - -");
		}
	}
	
	
	
	
	
	
}
