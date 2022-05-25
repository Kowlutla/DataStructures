package RemoveLoopFromLinkedList;

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
	
	public void removeLoop(Node node)
	{
		node.next=null;
		
	}
	public void removeLoop1(Node node)
	{
		Node current=node;
		Node temp=node;
		//to count  the no of nodes in loop
		int count=1;
		while(current.next!=temp)
		{
			current=current.next;
			count++;
		}
		//System.out.println("Count"+count);
		current=head;
		temp=head;
		//move temp node count nodes after head
		
		for(int i=0;i<count;i++)
		{
			temp=temp.next;
		}
		//move both nodes they will meet where loop is starting
		while(temp!=current)
		{
			current=current.next;
			temp=temp.next;
		}
		
		while(temp.next!=current)
		{
			temp=temp.next;
		}
		temp.next=null;
	}
	public void removeLoop()
	{
		Node fast_node=head;
		Node slow_node=head;
		while(slow_node!=null && fast_node!=null && fast_node.next!=null )
		{
			fast_node=fast_node.next.next;
			slow_node=slow_node.next;
			if(slow_node==fast_node)
			{
				removeLoop(slow_node);
				return;
			}
		}
	}
	public boolean findLoop()
	{
		Node fast_node=head;
		Node slow_node=head;
		while(slow_node!=null && fast_node!=null && fast_node.next!=null )
		{
			if(slow_node==fast_node)
			{
				//removeLoop(slow_node);
				return true;
			}
			fast_node=fast_node.next.next;
			slow_node=slow_node.next;
		}
		return false;
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
