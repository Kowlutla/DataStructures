import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		// create new Object Of LinkedDeque
		LinkedDeque<String> q = new LinkedDeque<String>();
		// Check deque is empty or not
		System.out.println("Is Empty: " + q.isEmpty());
		// get the size of deque
		System.out.println("Size: " + q.size());
		// add values to front of deque
		q.addFirst("Three");
		q.addFirst("Two");
		q.addFirst("one");
		// add values to back of deque
		q.addLast("Four");
		q.addLast("Five");
		q.addLast("Six");

		// iterator to iterate all values in deque
		System.out.println("\nItems Of Deque are: ");
		Iterator<String> iter = q.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		// get the fist item of deque
		System.out.println("\nFirst item is: " + q.peekFirst());
		// get the last value of deque
		System.out.println("Last item is: " + q.peekLast());
		// remove the first value of deque
		System.out.println("Removed item from first of deque is: " + q.removeFirst());
		// remove the last value of deque
		System.out.println("Removed item from last of deque is: " + q.removeLast());

		// iterator to iterate all values in deque
		System.out.println("\nItems Of Deque are: ");
		iter = q.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("Size: " + q.size());
		System.out.println("Is Empty: " + q.isEmpty());
	}
}
