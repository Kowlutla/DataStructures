package SortingOfLinkedList;

public class LinkedListSortingDemo {

	public static void main(String[] args) {
		LinkedListSorting list=new LinkedListSorting();
		list.sortList();
		list.traverse();
		list.insert(10);
		list.insert(-4);
		list.insert(40);
		list.insert(74);
		list.insert(11);
		list.insert(-9);
		list.insert(13);
		list.insert(123);
		list.traverse();
		list.sortList();
		list.traverse();
	}

}
