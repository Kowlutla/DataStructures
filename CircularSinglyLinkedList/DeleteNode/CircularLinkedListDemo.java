package DeleteNode;

public class CircularLinkedListDemo {

	public static void main(String[] args) {
		
		
		CircularLinkedList list=new CircularLinkedList();
		list.deleteAtStart();
		list.insert(10);
		list.traverse();
		list.insert(2);
		list.traverse();
		list.insert(2);
		list.traverse();
		list.insert(3);
		list.deleteAtStart();
		list.traverse();
		list.insert(5);
		list.traverse();
		list.deleteAtLast();
		list.traverse();
		list.insert(5);
		list.insert(6);
		list.insert(7);
		list.insert(8);
		list.traverse();
		list.deleteAllPrimes();
		list.traverse();

	}

}
