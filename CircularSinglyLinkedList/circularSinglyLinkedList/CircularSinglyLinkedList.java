package circularSinglyLinkedList;

public class CircularSinglyLinkedList {
	
	protected class Node
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
	Node tail;
	int size=0;
	
	public Node insertAtHead(int data)
	{
		Node node=new Node(data);
		System.out.println(data+" is inserted at head ");
		if(size==0)
		{
			head=node;
			tail=node;
			node.next=head;
		}
		else
		{
			node.next=head;
			tail.next=node;
			head=node;
		}
		size++;
		return node;
	}
	
	
	public Node insertAtEnd(int data)
	{
		Node node=new Node(data);
		System.out.println(data+" is inserted at end ");
		if(getSize()==0)
		{
			head=node;
			tail=node;
			head.next=head;
		}
		else
		{
			node.next=head;
			tail.next=node;
			tail=node;
		}
		size++;
		return node;
	}
	
	
	
	public void traverse()
	{
		if(head==null)
		{
			System.out.println("No elements in list ");
			return;
		}
		System.out.println("Elements in list: ");
		Node current=head;
		do
		{
			System.out.print(current.data+" ");
			current=current.next;
		}while(current!=head);
		System.out.println();
	}
	
	
	public void deleteFromStart()
	{
		if(getSize()==0)
		{
			System.out.println("List is empty ");
			return;
		}
		System.out.println(head.data+" is deleted from list ");
		head=head.next;
		tail.next=head;
		size--;
	}
	
	
	
	
	public int getSize()
	{
		return size;
	}

	
	public static void main(String args[])
	{
		CircularSinglyLinkedList list=new CircularSinglyLinkedList();
		list.insertAtHead(10);
		list.insertAtHead(20);
		list.insertAtHead(30);
		list.insertAtHead(40);
		System.out.println("Size: "+list.getSize());
		list.traverse();
		list.insertAtEnd(50);
		list.traverse();
		list.deleteFromStart();
		list.traverse();
	}
	
	
}
