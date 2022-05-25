package RemoveDuplicates;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates 
{

	public class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
		
		public String toString()
		{
			return ""+data;
		}
	}
	
	Node head;
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
		System.out.println(data+" is inserted into list");
	}
	
	//Time complexity:O(n^2) Space complexity:O(1)
	public void removeDuplicates()
	{
		Node current=head;
		while(current.next!=null && current!=null)
		{
			Node temp=current;
			while(temp.next!=null)
			{
				if(current.data==temp.next.data)
				{
					//Node dup=temp.next;
					temp.next=temp.next.next;
				}
				else
				{
					temp=temp.next;
				}
			}
			
			current=current.next;
		}
	}
	
	
	public void removeDuplicates1()
	{
		
		Set<Integer>set=new LinkedHashSet<Integer>();
		
		if(head==null)
		{
			return;
		}
		Node prev=head;
		Node current=head.next;
		set.add(head.data);
		Node temp;
		while(current!=null)
		{
			int data=current.data;
			if(set.contains(data))
			{
				prev.next=current.next;
				temp=current;
				current=current.next;
				temp.next=null;
			}
			else
			{
				set.add(data);
				prev=current;
				current=current.next;
			}
		}
	}
	
	public void traverse()
	{
		Node current=head;
		System.out.println("List elements are: ");
		System.out.print(current);
		while(current!=null)
		{
			current=current.next;
			System.out.print(" = >"+current);
		}
		System.out.println();
	}
}
