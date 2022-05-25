package rotateDoublyLinkedList;

public class RotateLinkedList
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
	
	
	 public void rotateP (int p)
	 {
	       
	      Node temp1=head;
	      Node temp2=head;
	      while(temp1.next!=null)
	      {
	    	  temp1=temp1.next;
	      }
	      int i=1;
	      while(i<=p)
	      {
	    	  head=temp2.next;
	    	  head.previous=null;
	    	  temp2.next=null;
	    	  temp1.next=temp2;
	    	  i++;
	    	  temp2=head;
	    	  temp1=temp1.next;
	      }
	      head=temp2;
	 }

	
	
	
	
	
	
	
	public void traverse()
	{
		Node current=head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	
}
