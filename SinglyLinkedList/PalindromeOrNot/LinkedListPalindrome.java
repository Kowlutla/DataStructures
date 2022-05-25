package PalindromeOrNot;

import java.util.Stack;

public class LinkedListPalindrome 
{
	
	public class Node
	{
		char data;
		Node next;
		public Node(char data)
		{
			this.data=data;
		}
		
		public String toString()
		{
			return ""+data;
		}
	}
	
	Node head;
	public void insert(char data)
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
	
	//space complexity O(n)
	public boolean isPalindrome()
	{
		Node current=head;
		Stack<Character>stack=new Stack<Character>();
		while(current!=null)
		{
			stack.push(current.data);
			current=current.next;
		}
		
		current=head;
		while(current!=null)
		{
			char temp=stack.pop();
			if(temp!=current.data)
			{
				return false;
			}
			current=current.next;
		}
		
		return true;
	}

	
	public boolean isPalindrome1()
	{
		Node fast=head;
		Node slow=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		Node middle=reverseList(slow);
		
		Node current=head;
		while(middle!=null)
		{
			if(current.data!=middle.data)
			{
				return false;
			}
			current=current.next;
			middle=middle.next;
		}
		return true;
	}
	
	
	
	
	private Node reverseList(Node slow) {
		
		Node current=slow;
		Node next=null;
		Node previous=null;
		while(current!=null)
		{
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		return previous;
	}

	public int getCount(Node head)
	{
		if(head==null)
		{
			return 0;
		}
		return 1+getCount(head.next);
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
