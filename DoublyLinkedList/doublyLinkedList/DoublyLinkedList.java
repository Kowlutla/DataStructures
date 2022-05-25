package doublyLinkedList;

public class DoublyLinkedList<E> implements CollectionInterface<E> {

	// inner class LinkedNode
	class LinkedNode<E> {
		E data;
		LinkedNode<E> next;
		LinkedNode<E> previous;

		public LinkedNode(E data) {
			this.data = data;
			this.next = null;
			this.previous = null;
		}
	}

	private LinkedNode<E> head;//hold the starting Node of List
	private LinkedNode<E> tail;//hold the Last Node of List
	private int size = 0;//hold the Size of List

	@Override
	// appends the specified element to the end of this list.
	public boolean add(E e) {
		LinkedNode<E> newNode = new LinkedNode<E>(e);
		newNode.previous = tail;
		if (tail != null) {
			tail.next = newNode;
		}
		tail = newNode;
		if (head == null) {
			head = newNode;
		}
		size++;
		return true;
	}

	@Override
	// adds the specified element to the index location
	// or throws IndexOutOfBoundsException if (index < 0 || index >= size())
	public boolean add(E e, int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException("Index is not in range");
		} else {
			LinkedNode<E> newNode = new LinkedNode<E>(e);
			if (index == 0) {
				head.previous = newNode;
				newNode.next = head;
				head = newNode;
			} else if (index == size - 1) {
				newNode.previous = tail;
				tail.next = newNode;
				tail = newNode;
			} else {
				LinkedNode<E> current = head;
				int indexcount = 0;
				while (indexcount < index - 1) {
					current = current.next;
					indexcount++;
				}
				newNode.previous = current;
				newNode.next = current.next;
				current.next.previous = newNode;
				current.next = newNode;
			}
			size++;
			return true;
		}
	}

	@Override
	// removes all of the elements from this list.
	public void clear() {
		head = null;
		tail = null;
		size = 0;
	}

	@Override
	// returns true if this list contains the specified element.
	public boolean contains(E o) {
		LinkedNode<E> current = head;
		while (current != null) {
			if (current.data.equals(o)) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	@Override
	// returns element at the index
	// or throws IndexOutOfBoundsException if (index < 0 || index >= size())
	public E get(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException("Index is not in range");
		} else {
			LinkedNode<E> current = head;
			int indexCount = 0;
			for (indexCount = 0; indexCount < index; indexCount++) {
				current = current.next;
			}
			return current.data;
		}
	}

	@Override
	// returns the index of o in list or -1 if not found
	public int indexOf(E o) {
		int index = 0;
		LinkedNode<E> current = head;
		while (current != null) {
			if (current.data.equals(o)) {
				return index;
			}
			index++;
			current = current.next;
		}
		return -1;

	}

	@Override
	// returns boolean depending on the size of the list
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	// removes element at position index. Returns true if element was removed
	// or throws IndexOutOfBoundsException if (index < 0 || index >= size())
	public boolean remove(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException("Index is not in range");
		} else if (index == 0) {
			if (head.next != null) {
				head.next.previous = null;
				head = head.next;
			} else {
				head = tail = null;
			}
			size--;
			return true;
		} else if (index == size() - 1) {
			return remove();
		} else {
			LinkedNode<E> current = head;
			int currentIndex = 0;
			while (currentIndex != index) {
				current = current.next;
				currentIndex++;
			}
			current.previous.next = current.next;
			current.next.previous = current.previous;
			size--;
			return true;
		}

	}

	@Override
	// removes fist instance of o. Returns true if element was removed
	public boolean remove(E o) {

		if (head == null) {
			return false;
		}
		if (contains(o)) {
			if (head.data.equals(o)) {
				if (head.next != null) {
					head.next.previous = null;
					head = head.next;
				} else {
					head = tail = null;
				}
				size--;
				return true;
			} else if (tail.data.equals(o)) {
				if (tail.previous != null) {
					tail.previous.next = null;
					tail = tail.previous;
				} else {
					tail = head = null;
				}
				size--;
				return true;
			} else {
				LinkedNode<E> current = head;
				while (!current.data.equals(o)) {
					current = current.next;
				}

				current.previous.next = current.next;
				current.next.previous = current.previous;
				size--;
				return true;
			}
		} else {
			return false;
		}
	}

	@Override
	// removes the last item in the list
	public boolean remove() {
		if (tail == null) {
			return false;
		} else {
			if (tail.previous == null) {
				tail = null;
				head = null;
			} else {
				tail.previous.next = null;
				tail = tail.previous;
			}
			size--;
			return true;
		}
	}

	@Override
	// returns the number of elements in the list
	public int size() {
		return size;
	}

	public void traverse() {
		LinkedNode<E> current = head;
		while (current.next != null) {
			System.out.print(current.data + " => ");
			current = current.next;
		}
		System.out.println(current.data);
	}

	public void traverseReverse() {
		LinkedNode<E> current = tail;
		while (current.previous != null) {
			System.out.print(current.data + " => ");
			current = current.previous;
		}
		System.out.println(current.data);
	}
}
