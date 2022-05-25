package SortingStackusingAnotherStack;

public class StackDemo {

	public static void main(String[] args) {
		Stack stack=new Stack(4);
		stack.push(10);
		System.out.println("Peeked element: "+stack.peek());
		stack.push(30);
		System.out.println("Peeked element: "+stack.peek());
		stack.push(20);
		System.out.println("Peeked element: "+stack.peek());
		stack.push(4);
		System.out.println("Peeked element: "+stack.peek());
		stack.push(-40);
		System.out.println("Peeked element: "+stack.peek());
//		System.out.println("Popped element: "+stack.pop());
		System.out.println(stack.isFull());
		System.out.println("Before sorting: ");
		stack.show();
		System.out.println("\nAfter sorting: ");
		Stack temp=stack.sort();
		temp.show();
		
	}

}
