package sortingStack;

import java.util.Scanner;
import java.util.Stack;

public class SortingStack {

	static Stack<Integer>stack;
	public static void main(String[] args) {
		
		stack=new Stack<Integer>();
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
		stack=sortStack1(stack);
		System.out.println("After sorting above stack: ");
		System.out.println(stack);
		
		System.out.println("After soring above stack: ");
		sortStack2(stack);
		System.out.println(stack);
		sc.close();
	}

	
	//Space complexity-O(1) 
	private static void sortStack2(Stack<Integer> stack) {
		
		if(stack.isEmpty())
		{
			return;
		}
		else
		{
			int data=stack.pop();
			sortStack2(stack);
			sortStack2Util(data);
		}
		
	}
	
	static void sortStack2Util(int data)
	{
		if(stack.isEmpty() || stack.peek()<=data)
		{
			stack.push(data);
		}
		else
		{
			int temp=stack.pop();
			sortStack2Util(data);
			stack.push(temp);
		}
	}

	//Space Complexity: O(n)
	private static Stack<Integer> sortStack1(Stack<Integer> stack) {
		
		Stack<Integer>temp=new Stack<Integer>();
		
		while(!stack.isEmpty())
		{
			int current=stack.pop();
			while(!temp.isEmpty() && temp.peek()<current)
			{
				stack.push(temp.pop());
			}
			temp.push(current);
		}
		return temp;
	}
	
	
	
	
	
	

}
