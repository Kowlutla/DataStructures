package StackUsingLinkedList;

public class StackDemo {

	public static void main(String[] args) throws LinkedListEmptyException{
		Stack stack=new Stack();
		System.out.println(stack.isEmpty());
		stack.push(10);
		System.out.println("peeked element: "+stack.peek());
		stack.push(20);
		System.out.println("peeked element: "+stack.peek());
		stack.push(40);
		System.out.println("peeked element: "+stack.peek());
		stack.push(50);
		System.out.println("peeked element: "+stack.peek());
		System.out.println("Popped element: "+stack.pop());
		System.out.println("After ppopping peeked element: "+stack.peek());
	}

}
