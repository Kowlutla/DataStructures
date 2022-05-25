package DetectLoopInLinkedList;

import java.util.HashSet;

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
	
	
	public boolean isLoop()
	{
		HashSet<Node>set=new HashSet<Node>();
		Node current=head;
		while(current!=null)
		{
			if(set.contains(current))
			{
				return true;
			}
			set.add(current);
			current=current.next;
		}
		return false;
	}
	
	
	public boolean FloydsCycle_FindingAlgorithm()
	{
		Node fast_node=head;
		Node slow_node=head;
		while(fast_node!=null && fast_node.next!=null && slow_node!=null)
		{
			fast_node=fast_node.next.next;
			slow_node=slow_node.next;
			if(fast_node==slow_node)
			{
				return true;
			}
		}
		
		return false;
	}
	
	
	
	public int LoopCount()
	{
		Node fast=head;
		Node slow=head;
		while(slow!=null && fast!=null && fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
			if(slow==fast)
			{
				return getCount(slow);
			}
		}
		return 0;
	}
	
	
	private int getCount(Node slow)
	{
		int count=1;
		Node temp=slow;
		while(temp.next!=slow)
		{
			count++;
			temp=temp.next;
		}
		return count;
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
	
	
	//Method to return product of all numbers in list using recursion
	public int calculateProduct(Node head)
	{
		//base condition(Last node in list)
		if(head.next==null)
		{
			return head.data;
		}
		//recursively calling calculateProduct method 
		//by multiplying current data
		return head.data*calculateProduct(head.next);
	}
	
	
}
