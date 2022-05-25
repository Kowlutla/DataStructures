/**
 
	 Objective: Given a linked list and integer ‘k’, write an algorithm to reverse 
	 the linked list in groups of size ‘k’.
 	
 	Example:
 	--------
 	Input List:		1 - -> 2 - - > 3 - - > 4 - - > 5 - - > 6 - -> null
  	K=3
  	Output List:	3 - - > 2 - - > 1 - - >6 - - > 5 - - > 4 - ->null 
 */
package ReverseOfLinkedListInGroups;

/**
 * @author apiiit-rkv
 *
 */
public class ReverseOfLinkedListInGroups {

	
	
	static class  Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public static void print(Node head)
	{
		if(head==null)
				System.out.println("No elements in list ");
		else
		{
			System.out.println("List Items are: ");
			Node current=head;
			while(current.next!=null)
			{
				System.out.print(current.data+" - - > ");
				current=current.next;
			}
			System.out.println(current.data);
		}
	}
	
	public static Node reverseInGroups(Node head,int k)
	{
		int x=k;
		
		Node current=head;
		Node next=null;
		Node prev=null;
		while(current!=null && x>0)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			x--;
		}
		
		if(next!=null)
		{
			head.next=reverseInGroups(next,k);
		}
		return prev;
	}
	
	
	public static void main(String[] args) {
		
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		head.next.next.next.next=new Node(50);
		head.next.next.next.next.next=new Node(60);
		print(head);
		head=reverseInGroups(head,4);
		print(head);
		
		
	
		

	}

}
