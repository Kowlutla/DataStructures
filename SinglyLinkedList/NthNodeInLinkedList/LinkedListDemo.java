package NthNodeInLinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		System.out.println(list.getNth(0));
		list.insert(10);
		System.out.println("ELement is: "+list.getNth(0));
		list.insert(30);
		list.insert(14);
		System.out.println("ELement is: "+list.getNth1(2));
		
		System.out.println("Element: "+list.getNthfromEnd1(4));
	}
}
