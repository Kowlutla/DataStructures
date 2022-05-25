package product;

public class LinkedList {
	
	Node head;
	int length=0;
	
	public void insert(int number)
	{
		Node node=new Node(number);
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
		System.out.println(number+" inserted into list");
		length++;
	}
}
