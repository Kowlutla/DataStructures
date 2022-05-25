
public class Node<Item> {
	Item data;
	Node<Item> next;
	Node<Item> prev;

	public Node(Item data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}