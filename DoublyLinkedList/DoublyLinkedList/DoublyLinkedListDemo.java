package DoublyLinkedList;

public class DoublyLinkedListDemo {

	public static void main(String[] args) {
		DoublyLinkedList list=new DoublyLinkedList();
		list.insertAtHead(10);
		list.traverseFromHead();
		list.traverseFromTail();
		list.deleteAtHead();
		list.traverseFromHead();
		list.traverseFromTail();
		list.insertAfterNode(list.head,200);
		list.traverseFromHead();
		list.traverseFromTail();
		list.reverseList();
		list.traverseFromHead();
		list.traverseFromTail();
		list.insertAtHead(20);
		list.traverseFromHead();
		list.traverseFromTail();
		list.insertAtLast(40);
		list.traverseFromHead();
		list.traverseFromTail();
		list.reverseList();
		list.traverseFromHead();
		list.traverseFromTail();
		list.deleteAtHead();
		list.traverseFromHead();
		list.traverseFromTail();
		list.insertAtHead(24);
		list.traverseFromHead();
		list.traverseFromTail();
		list.insertAtHead(23);
		list.traverseFromHead();
		list.traverseFromTail();
		list.deleteNode(list.head.next);
		list.traverseFromHead();
		list.traverseFromTail();

	}

}
