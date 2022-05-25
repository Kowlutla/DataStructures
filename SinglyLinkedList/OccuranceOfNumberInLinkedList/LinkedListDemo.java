package OccuranceOfNumberInLinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.insert(10);
		list.insert(20);
		list.insert(34);
		list.insert(1);
		list.insert(10);
		list.insert(10);
		list.traverse();
		list.occuranceOfNumber1(20);
	}

}
