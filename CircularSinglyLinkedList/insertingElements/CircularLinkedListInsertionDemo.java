package insertingElements;

public class CircularLinkedListInsertionDemo {

	public static void main(String[] args) {
		
		
		CircularLinkedListInsertion list=new CircularLinkedListInsertion();
		list.traverse();
		list.insertAtLast(100);
		list.insertAtStart(10);
		list.traverse();
		list.insertAtStart(34);
		list.traverse();
		list.insertAtStart(32);
		list.traverse();
		list.insertAfter(34,200);
		list.traverse();
//		list.insertAfter(34, 45);
//		list.traverse();

	}

}
