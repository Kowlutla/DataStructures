package Insertion;

public class DoublyLinkedListInsertion 
{

	public class Node
	{
		int data;
		Node next;
		Node previous;
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
			this.previous=null;
		}
		
		public String toString()
		{
			return ""+data;
		}
	}
	Node head;
	public void insertAtHead(int data)
	{
		Node node=new Node(data);
		node.next=head;
		node.previous=null;
		if(head!=null)
		{
			head.previous=node;
		}
		head=node;
		System.out.println(data+" inserted at head ");
	}
	
	public void insertAtLast(int data)
	{
		
		Node node=new Node(data);
		Node current=head;
		if(current==null)
		{
			head=node;
			System.out.println(data+" inserted at last");
			return;
		}
		while(current.next!=null)
		{
			current=current.next;
		}
		node.previous=current;
		current.next=node;
		System.out.println(data+" inserted at last");
	}
	
	public void insertAfter(Node previous_Node,int data)
	{
		Node node=new Node(data);
		if(previous_Node==null)
		{
			System.out.println("Insertion not possible because Node not exist");
			return;
		}
		node.next=previous_Node.next;
		node.previous=previous_Node;
		previous_Node.next=node;
		if(node.next!=null)
		{
			node.next.previous=node;
		}
		System.out.println(data+" is inserted after "+previous_Node.data);
	}
	
	public void insertBefore(Node next_node,int data)
	{
		Node node=new Node(data);
		
		if(next_node==null)
		{
			System.out.println("Insertion not possible ");
			return;
		}
		node.previous=next_node.previous;
		next_node.previous.next=node;
		node.next=next_node;
		next_node.previous=node;
		System.out.println(data+" inserted before "+next_node.data);
	}
	
	
	
	public void traverse()
	{
		Node current=head;
		if(current==null)
		{
			System.out.println("List is Empty");
			return;
		}
		System.out.println("List Elements are: ");
		while(current.next!=null)
		{
			System.out.print(current+"- - >");
			current=current.next;
		}
		System.out.println(current);
		System.out.println("- - - - - - - - - -  - - - - - - - - - - - - - - - - - -");
	}
	
}
