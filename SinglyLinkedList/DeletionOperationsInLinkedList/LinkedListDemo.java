package DeletionOperationsInLinkedList;

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
		list.deleteAtLast();
		list.traverse();
		list.deleteAtLast();
		list.traverse();
		list.deleteAtLast();
		list.traverse();
		list.insert(20);
		list.traverse();
		list.insert(12);
		list.traverse();
		list.insert(14);
		list.traverse();
		list.deleteKey(12);
		list.traverse();
		list.deleteAtIndex(0);
		list.traverse();
		list.deleteLinkedList();
		list.traverse();
	}

}
