package mergeKSortedLinkedLists;

public class LinkedList {
	
	class Node
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
	public void addNode(int data)
	{
		System.out.println(data+" added");
		Node node=new Node(data);
		if(head==null)
		{
			head=node;
			return;
		}
		Node current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=node;
		
	}
	
	
	public void printList()
	{
		if(head==null)
		{
				System.out.println("List is empty ");
				return;
		}
		Node current=head;
		while(current.next!=null)
		{
			System.out.print(current.data+" ==> ");
			current=current.next;
		}
		System.out.print(current.data);
		System.out.println("\n");
	}
	

}
