package OccuranceOfNumberInLinkedList;

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
	
	public void occuranceOfNumber(int number)
	{
		int count=0;
		Node current=head;
		while(current!=null)
		{
			if(current.data==number)
			{
				count++;
			}
			current=current.next;
		}
		System.out.println(number+" Occures "+count+" Times in list");
	}
	
	public void occuranceOfNumber1(int number)
	{
		int count=occurance(number,head,0);
		System.out.println(number+" Occures using recursion: "+count+" times");
	}
	
	
	


	private int occurance(int number, Node node,int count) {
		if(node==null)
			return count;
		if(node.data==number)
			count++;
		return occurance(number,node.next,count);
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
