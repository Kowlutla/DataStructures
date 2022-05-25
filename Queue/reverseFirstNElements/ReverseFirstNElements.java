package reverseFirstNElements;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseFirstNElements {

	static Queue<Integer>q;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of elements into Queue: ");
		int len=sc.nextInt();
		q=new LinkedList<Integer>();
		System.out.println("Enter elements into queue: ");
		for(int i=0;i<len;i++)
		{
			q.add(sc.nextInt());
		}
		
		System.out.println("Enter N for sorting first n elements: ");
		int n=sc.nextInt();
		System.out.println("Queue Before Reverse: ");
		System.out.println(q);
		reverseFirstNElements1(q,n);
		System.out.println("Above Queue After reversing first "+n+" Elements: ");
		System.out.println(q);
		reverseFirstNElements2(q,n);
		System.out.println("Above Queue After reversing first "+n+" Elements: ");
		System.out.println(q);

	}
	
	//Time complexity-O(n) Space Complexity-O(n)
	private static void reverseFirstNElements1(Queue<Integer> q,int n) 
	{
		
		Stack<Integer>stack=new Stack<Integer>();
		
		for(int i=1;i<=n;i++)
		{
			stack.push(q.poll());
		}
		
		while(!stack.isEmpty())
		{
			int data=stack.peek();
			q.add(data);
			stack.pop();
		}
		
		for(int i=0;i<q.size()-n;i++)
		{
			int data=q.remove();
			q.add(data);
		}
	}
	
	
	//Time Complexity-O(n) Space Complexity-O(1)
	public static void reverseFirstNElements2(Queue<Integer> q,int n)
	{
		reverseFirstNElements2Util(q,n);
		for(int i=1;i<=q.size()-n;i++)
		{
			int data=q.remove();
			q.add(data);
		}
	}
	static int count=0;
	public static void reverseFirstNElements2Util(Queue<Integer> q,int n)
	{
		if(count==n)
		{
			return;
		}
		else
		{
			count++;
			int data=q.remove();
			reverseFirstNElements2Util(q,n);
			q.add(data);
			
		}
	}

}
