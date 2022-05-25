package reverseStack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {

	static Stack<Integer>stack;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of elements in stack: ");
		int n=sc.nextInt();
		System.out.println("Enter elements into stack: ");
		stack=new Stack<Integer>();
		for(int i=1;i<=n;i++)
		{
			stack.push(sc.nextInt());
		}
		
		System.out.println("Original Stack: ");
		System.out.println(stack);
		System.out.println("After reversing above stack Elements: ");
		stack=reverseStack1(stack);
		System.out.println(stack);
		System.out.println("After reversing above stack Elements: ");
		reverseStack2(stack);
		System.out.println(stack);
		sc.close();

	}

	
	//Time Complexity-O(n)  Space Complexity-O(n)
	private static Stack<Integer> reverseStack1(Stack<Integer> stack) {
		
		Stack<Integer>temp=new Stack<Integer>();
		//Stack<Integer>temp2=new Stack<Integer>()
		while(!stack.isEmpty())
		{
			temp.push(stack.pop());
		}
		return temp;
	}
	
	
	//Time Complexity-O(n)  Space complexity-O(1)
	private static void reverseStack2(Stack<Integer> stack)
	{
		if(stack.isEmpty())
		{
			return;
		}
		else
		{
			int data=stack.pop();
			reverseStack2(stack);
			insertAtBottom(data);
		}
	}


	private static void insertAtBottom(int data) {
	
		if(stack.isEmpty())
		{
			stack.push(data);
		}
		else
		{
			int temp=stack.pop();
			insertAtBottom(data);
			stack.push(temp);
		}
		
	}
	
	
	
	
	
	
	
	
	
	

}
