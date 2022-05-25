package rotateDoublyLinkedList;

public class RotateLinkedListDemo {

	public static void main(String[] args) {
		
		
		RotateLinkedList list=new RotateLinkedList();
		list.insertAtLast(10);
		list.insertAtLast(20);
		list.insertAtLast(30);
		list.insertAtLast(40);
		list.insertAtLast(50);
		list.insertAtLast(60);
		System.out.println("List Items: ");
		list.traverse();
		System.out.println("\nAfter rotating: ");
		list.rotateP(4);
		list.traverse();
		
	}

}
