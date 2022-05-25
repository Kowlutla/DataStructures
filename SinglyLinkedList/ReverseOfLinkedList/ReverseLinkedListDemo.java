package ReverseOfLinkedList;

public class ReverseLinkedListDemo {

	public static void main(String[] args) {
		ReverseLinkedList list=new ReverseLinkedList();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		list.traverse();
		list.reverse();
		list.traverse();
		list.swapPairwise();
		list.traverse();

	}

}
