package StackUsingTwoQueues;

public class StackDemo {

	public static void main(String[] args) {
		Stack stack=new Stack();
		System.out.println(stack.isEmpty());
		System.out.println(stack.peek());
		stack.push(10);
		stack.push(20);
		System.out.println("Peeked element: "+stack.peek());
		System.out.println("Popped Element: "+stack.pop());
		System.out.println("Peeked element: "+stack.peek());
		System.out.println("Popped element: "+stack.pop());
		System.out.println("Peeked element: "+stack.peek());
	}

}
