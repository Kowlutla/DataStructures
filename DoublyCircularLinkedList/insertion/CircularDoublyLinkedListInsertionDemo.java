package insertion;

public class CircularDoublyLinkedListInsertionDemo {

	public static void main(String[] args) {
		
		
		CircularDoublyLinkedListInsertion  list=new CircularDoublyLinkedListInsertion ();
		list.traverse();
		list.insertAtHead(10);
		list.traverse();
		list.insertAtHead(20);
		list.traverse();
		list.insertAtHead(30);
		list.traverse();
		list.insertAtLast(100);
		list.traverse();
		list.insertAtHead(200);
		list.traverse();

	}

}
