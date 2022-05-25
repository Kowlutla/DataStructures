import java.util.Iterator;

public class LinkedDeque<Item> {
	// Instance variables
	Node<Item> first;// reference to the front of deque
	Node<Item> last;// reference to the back of the deque
	int n;// size of the deque

	/*
	 * Constructor Initializes the instance variables to appropriate values
	 */
	public LinkedDeque() {
		this.first = null;
		this.last = null;
		this.n = 0;
	}

	/*
	 * Return whether Deque is empty or not
	 */
	public boolean isEmpty() {
		return (n == 0);
	}

	/*
	 * Returns Size of Deque
	 */
	public int size() {
		return n;
	}

	/*
	 * Add the given item to the front of the deque Increment n by one
	 */
	public void addFirst(Item item) {
		Node<Item> newNode = new Node<Item>(item);
		if (isEmpty()) {
			first = last = newNode;
		} else {
			first.prev = newNode;
			newNode.next = first;
			first = newNode;
		}
		n++;
	}

	/*
	 * Add the given item to the back of the deque Increment n by one
	 */
	public void addLast(Item item) {
		Node<Item> newNode = new Node<Item>(item);
		if (isEmpty()) {
			first = last = newNode;
		} else {
			newNode.prev = last;
			last.next = newNode;
			last = newNode;
		}
		n++;
	}

	// Return the item at front of deque
	public Item peekFirst() {
		if (isEmpty()) {
			throw new RuntimeException("Deque is empty");
		} else {
			return first.data;
		}
	}

	// Remove and Return the item at front of deque
	public Item removeFirst() {
		if (isEmpty()) {
			throw new RuntimeException("Deque is empty");
		}

		Node<Item> temp = first;
		if (first.next == null) {
			last = null;
		} else {
			first.next.prev = null;
		}
		first = first.next;
		n--;
		return temp.data;
	}

	// Return the item at the back of the deque
	public Item peekLast() {
		if (isEmpty()) {
			throw new RuntimeException("Deque is empty");
		} else {
			return last.data;
		}
	}

	// Remove and Return the item at the back of the deque
	public Item removeLast() {
		if (isEmpty()) {
			throw new RuntimeException("Deque is empty");
		} else {
			Node<Item> temp = last;
			if (last.prev == null) {
				first = null;
			} else {
				last.prev.next = null;
			}
			last = last.prev;
			n--;
			return temp.data;
		}
	}

	/*
	 * Return an Object of type DequeIterator
	 */
	public Iterator<Item> iterator() {
		return new DequeIterator();
	}

	class DequeIterator implements Iterator<Item> {

		// Instance variable
		// Reference to the current Node in the iterator
		Node<Item> current;

		/*
		 * initializes the instance variable appropiately
		 */
		public DequeIterator() {
			this.current = first;
		}

		/*
		 * Return whether the iterator has more items to iterate or not
		 */
		public boolean hasNext() {
			return (current != null);
		}

		/*
		 * Return the item in the current Node and advance current to the next node
		 */
		public Item next() {

			Item data = current.data;
			current = current.next;
			return data;
		}
	}
}
