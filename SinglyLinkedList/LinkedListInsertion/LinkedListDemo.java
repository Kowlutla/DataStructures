package LinkedListInsertion;

import ImplementingSinglyLinkedList.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.insert(10);
		list.traverse();
		list.insert(20);
		list.traverse();
		list.insert(30);
		list.traverse();
		list.insert(40);
		list.traverse();
		list.insert(60);
		list.traverse();
		list.insertAtFirst(100);
		list.traverse();
		list.insertAfter(20,120);
		list.traverse();
		list.insertAtIndex(2, -34);
		list.traverse();
		list.insertAtFirst(123);
		list.traverse();
		list.insertAtIndex(0,1);
		list.traverse();
		list.insertBefore(60, 1000);
		list.traverse();
		list.insertAfter(10, 123);
		System.out.println("- - - -- - - -  -- - - - - - - - - - - - - -");
		LinkedList list1=new LinkedList();
		list1.insertInSortingOrder(10);
		list1.traverse();
		list1.insertInSortingOrder(1);
		list1.traverse();
		list1.insertInSortingOrder(-4);
		list1.traverse();
		list1.insertInSortingOrder(2);
		list1.traverse();
	}
}
