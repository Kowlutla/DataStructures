package StackInCollection;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Stack<Integer>stack=new Stack<Integer>();
		for(int i=0;i<7;i++)
		{
//			System.out.print("Enter value: ");
			//System.out.println("is Empty: "+stack.isEmpty());
			stack.push(i);
			System.out.println("Peeked element: "+stack.peek());
			//System.out.println("Popped element: "+stack.pop());
			System.out.println("-----------------------------------------------");
		}
//		for(int i=0;i<stack.size();i++)
//		{
//			System.out.println(stack.get(i));
//		}
		System.out.println("Index of 6 is: "+stack.search(6));
		for(int i=0;i<stack.size();i++)
		{
			System.out.println("Popped "+(i+1)+" :"+stack.pop());
		}
//		System.out.println("Size: "+stack.size());
//		System.out.println(stack.pop());
//		System.out.println("Size: "+stack.size());
//		System.out.println(stack.remove(5));
//		System.out.println("Size: "+stack.size());
//		System.out.println(stack.search(1));
//		System.out.println("Size: "+stack.size());
//		
//		System.out.println("All elements in stack: ");
//		Iterator<Integer>iter=stack.iterator();
//		while(iter.hasNext())
//		{
//			System.out.println(iter.next());
//		}
		sc.close();
	}

}
