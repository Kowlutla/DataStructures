package doublyLinkedList;

public class Tester {

	public static void main(String[] args) {

		DoublyLinkedList<String>list=new DoublyLinkedList<String>();
		list.add("10");
		list.traverse();
		list.traverseReverse();
		System.out.println();
		list.add("20");
		list.traverse();
		list.traverseReverse();
		System.out.println();
		list.add("30");
		list.add("40");
		list.add("50");
		list.add("60");
		list.add("70");
		list.add("80");
		list.traverse();
		list.traverseReverse();
		System.out.println();
		
		System.out.println(list.get(2));
		System.out.println(list.remove());
		list.traverse();
		list.remove(6);
		list.traverse();
		list.remove(3);
		list.traverse();
		list.remove("10");
		list.traverse();
		
		System.out.println(list.contains("30"));
		System.out.println(list.indexOf("30"));
		System.out.println(list.size());
		System.out.println(list.remove(3));
		System.out.println(list.size());
		list.clear();
		System.out.println(list.isEmpty());
		list.add("kowlutla");
		list.traverse();
	}

}
