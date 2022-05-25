package DoublyLinkedList;

public class DoublyLinkedList
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
	Node tail;
	
	public void insertAtHead(int data)
	{
		Node node=new Node(data);
		node.previous=null;
		node.next=head;
		if(head!=null)
		{
			head.previous=node;
		}
		head=node;
		if(tail==null)
		{
			tail=node;
		}
		System.out.println(data+" inserted at head");
	}
	
	
	public void insertAfterNode(Node last_node,int data)
	{
		Node node=new Node(data);
		if(last_node==null)
		{
			System.out.println("Insertion not possible because node not exist");
			return;
		}
		node.next=last_node.next;
		node.previous=last_node;
		last_node.next=node;
		tail=node;
		if(node.next!=null)
		{
			node.next.previous=node;
		}
		System.out.println(data+" inserted after "+last_node.data);
	}
	
	
	
	
	public void insertAtLast(int data)
	{
		Node node=new Node(data);
		node.previous=tail;
		node.next=null;
		if(tail!=null)
		{
			tail.next=node;
		}
		tail=node;
		if(head==null)
		{
			head=node;
		}
		System.out.println(data+" is inserted at last ");
	}
	
	
	public void deleteAtHead()
	{
		if(head==null)
		{
			System.out.println("Deletion not possible");
			return ;
		}
		int value=head.data;
		if(head.next==null)
		{
			head=null;
			tail=null;
		}
		else
		{
			head.next.previous=null;
			head=head.next;
		}
		System.out.println(value+" is deleted from list at Head");
		
	}
	
	public void deleteNode(Node node)
	{
		if(node==null)
		{
			System.out.println("Deletion not Possible");
			return;
		}
		int value=node.data;
		if(head.next==null || head==null)
		{
			head=null;
			tail=null;
		}
		else
		{
			node.previous.next=node.next;
			node.next.previous=node.previous;
		}
		System.out.println(value+ " is removed from list ");
	}
	
	
	public void deleteAtLast()
	{
		if(tail==null)
		{
			System.out.println("Deletion not possible");
			return ;
		}
		int value=tail.data;
		tail.previous.next=null;
		tail=tail.previous;
		System.out.println(value+" deleted from list at last position");
	}
	
	public void reverseList()
	{
		Node current=head;
		Node temp=null;
		while(current!=null)
		{
			temp = current.previous; 
            current.previous = current.next; 
            current.next = temp; 
            current = current.previous; 
		}
		if(temp!=null)
		{
			tail=head;
			head=temp.previous;
		}
		System.out.println("List is Reversed");
	}
	
	public void traverseFromHead()
	{
		System.out.println("Traversing from head");
		if(head==null)
		{
			System.out.println("List is empty ");
		}
		else
		{
			Node current=head;
			while(current.next!=null)
			{
				System.out.print(current+"- - >");
				current=current.next;
			}
			System.out.println(current);
		}
	}
	
	
	public void traverseFromTail()
	{
		System.out.println("Traversing from tail ");
		Node current=tail;
		if(current==null)
		{
			System.out.println("List is Empty");
			return;
		}
		while(current.previous!=null)
		{
			System.out.print(current+"- - > ");
			current=current.previous;
		}
		System.out.println(current);
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - ");
	}
	
	
	
	
	
	
}
