package Insertion;

public class DoublyLinkedListInsertionDemo {

	public static void main(String[] args) {
		
		DoublyLinkedListInsertion list=new DoublyLinkedListInsertion();
		list.traverse();
		list.insertAtLast(50);
		list.traverse();
		list.insertAtHead(10);
		list.traverse();
		list.insertAtHead(20);
		list.traverse();
		list.insertAtHead(30);
		list.traverse();
		list.insertAtLast(40);
		list.traverse();
		list.insertBefore(list.head.next,180);
		list.traverse();
		list.insertAfter(list.head.next,100);
		list.traverse();
		//list.insertAfter(list.head.next.next.next.next.next,100);
		//list.traverse();

	}

}
