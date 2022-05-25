/**
 	Objective: Given a linked list, swap every  kth node in that. If at the end of the list 
 	remaining nodes are less than k, leave them untouched
 	
 	Input : ->1->2->3->4->5->6->7->8->9->10 , K = 4
	Output: ->4->2->3->1->8->6->7->5->9->10
 	
 */
package swapEveryKthNode;

/**
 * @author kowlutla
 *
 */
public class SwapEveryKthNode {
	
	
	static class Node
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
			System.out.println("List is empty ");
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

	
	public static Node swapNode(Node head,int k)
	{
		int x=k;
		Node prev_node=head;
		Node temp=head;
		Node next_node;
		
		if(x<2)
			return head;
		if(temp!=null)
			next_node=head.next;
		else
			return null;
		
		while((x-2)>0)
		{
			if(next_node!=null)
			{
				prev_node=next_node;
				next_node=next_node.next;
				x--;
			}
			else
			{
				return head;
			}
		}
		
		Node new_node=next_node.next;
		prev_node.next=temp;
		next_node.next=temp.next;
		temp.next=swapNode(new_node,k);
		return next_node;
	}
	
	public static void main(String[] args) {
		
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		head.next.next.next.next=new Node(50);
		head.next.next.next.next.next=new Node(60);
		head.next.next.next.next.next.next=new Node(70);
		head.next.next.next.next.next.next.next=new Node(80);
		head.next.next.next.next.next.next.next.next=new Node(90);
		print(head);
		head=swapNode(head,3);
		print(head);

	}

}
