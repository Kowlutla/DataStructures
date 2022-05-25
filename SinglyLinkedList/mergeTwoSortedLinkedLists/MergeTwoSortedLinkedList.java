/**
Merge or Combine Two Sorted Linked Lists

Objective: Given two sorted linked lists, objective is to merge both the lists in sorted order.

Input: Two sorted linked list List a, List b.

Example: 

List a : ->2->6->18

Listb: ->1->3->17->19

Merged List: ->1->2->3->6->17->18->19

 */
package mergeTwoSortedLinkedLists;

/**
 * @author apiiit-rkv
 *
 */
public class MergeTwoSortedLinkedList {

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
	
	
	public static void printList(Node head)
	{
		if(head==null)
			return;
//		System.out.println("List elements are: ");
		Node current=head;
		while(current!=null)
		{
			System.out.print(current.data+"  ");
			current=current.next;
		}
	}
	
	
	public static Node mergeList(Node head1,Node head2)
	{
		if(head1==null)
			return head2;
		if(head2==null)
			return head1;
		
		Node temp=new Node(0);
		Node result=temp;
		
		while(head1!=null && head2!=null)
		{
			if(head1.data>head2.data)
			{
				result.next=head2;
				result=result.next;
				head2=head2.next;
			}
			else
			{
				result.next=head1;
				result=result.next;
				head1=head1.next;
			}
		}
		
		
		while(head1!=null)
		{
			result.next=head1;
			head1=head1.next;
			result=result.next;
		}
		while(head2!=null)
		{
			result.next=head2;
			head2=head2.next;
			result=result.next;
		}
		
		return temp.next;
	}
	
	
	public static void main(String[] args) {
		
		Node head1=new Node(10);
		head1.next=new Node(20);
		head1.next.next=new Node(30);
		head1.next.next.next=new Node(40);
		head1.next.next.next.next=new Node(50);
		
		System.out.println("List1: ");
		printList(head1);
		
		Node head2=new Node(15);
		head2.next=new Node(25);
		head2.next.next=new Node(35);
		head2.next.next.next=new Node(45);
		head2.next.next.next.next=new Node(55);
		head2.next.next.next.next.next=new Node(65);
		
		System.out.println("\nList 2: ");
		printList(head2);
		
		System.out.println("\nMerged List: ");
		Node merge=mergeList(head1,head2);
		printList(merge);

	}

}
