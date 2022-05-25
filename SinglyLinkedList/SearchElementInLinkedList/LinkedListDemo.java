package SearchElementInLinkedList;

import java.util.HashSet;

import SearchElementInLinkedList.LinkedList.Node;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.insert(10);
		list.insert(40);
		list.insert(30);
		list.insert(34);
		list.insert(13);
		list.insert(46);
		list.insert(31);
		list.insert(35);
		LinkedList list1=new LinkedList();
		list1.insert(20);
		list1.insert(10);
		list1.insert(40);
		list1.insert(30);
		list1.insert(11);
		list1.insert(31);
		list1.insert(35);
		list1.insert(34);
		list1.head.next.next=list.head.next;
		list.traverse();
		list1.traverse();
		intersectionOfList(list1,list);
		System.out.println(instersectionPoint(list1,list));
		System.out.println();
		if(list.searchElement(20))
		{
			System.out.println(20+" is in list");
		}
		else
		{
			System.out.println(20+" is not in list");
		}
		
		
		if(list.searchElement1(20))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

	}

	public static void intersectionOfList(LinkedList list1,LinkedList list2) {
		HashSet<Integer>set=new HashSet<Integer>();
		System.out.println("Intersection of two lists: ");
		Node current=list1.head;
		while(current!=null)
		{
			set.add(current.data);
			current=current.next;
		}
		
		current=list2.head;
		while(current!=null)
		{
			if(set.contains(current.data))
			{
				System.out.print(current.data+" ");
			}
			current=current.next;
		}
		System.out.println();
		
	}
	
	public static Node intersectionPoint(LinkedList list1,LinkedList list2)
	{
		HashSet<Node>set=new HashSet<Node>();
		System.out.println("Intersection Point of two list ");
		Node current=list1.head;
		while(current!=null)
		{
			set.add(current);
			current=current.next;
		}
		
		current=list2.head;
		while(current!=null)
		{
			if(set.contains(current))
			{
				return current;
			}
			current=current.next;
		}
		return null;
	}
	
	
	public static Node instersectionPoint(LinkedList list1,LinkedList list2)
	{
		System.out.println("Intersection point 2: ");
		int count1=list1.getCount();
		int count2=list2.getCount();
		if(count1>count2)
		{
			int d=count1-count2;
			return intersection(d,list1,list2);
			 
		}
		else
		{
			int d=count2-count1;
			return intersection(d,list2,list1);
			
		}
		
	}

	private static Node intersection(int count, LinkedList list1, LinkedList list2) {
		Node current1=list1.head;
		Node current2=list2.head;
		for(int i=0;i<count;i++)
		{
			current1=current1.next;
		}
		
		while(current1!=null && current2!=null)
		{
			if(current1.data==current2.data)
			{
				return current1;
			}
			current1=current1.next;
			current2=current2.next;
		}
		return null;
		
	}
	

}
