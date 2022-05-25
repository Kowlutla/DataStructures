package product;

public class MainClass {

	public static void main(String[] args) {

		// creating linked list Object
		LinkedList list = new LinkedList();
		// inserting elements into list
		list.insert(1);
		list.insert(2);
		list.insert(4);
		list.insert(5);
		list.insert(3);

		// getting linkedlist head
		Node current = list.head;

		// creating main Class Object to access calculateProduct method
		MainClass main = new MainClass();
		// calling calculateProduct method and printing results
		System.out.println("\nProduct of all numbers in list: " + main.calculateProduct(current));

	}

	// Method to return product of all numbers in list using recursion
	public int calculateProduct(Node current) {
		// base condition(Last node in list)
		if (current.next == null) {
			return current.number;
		}
		// recursively calling calculateProduct method
		// by multiplying current number
		return current.number * calculateProduct(current.next);
	}

}
