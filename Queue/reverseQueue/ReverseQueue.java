package reverseQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseQueue {

	static Queue<Integer>q;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of elements into Queue: ");
		int n=sc.nextInt();
		q=new LinkedList<Integer>();
		System.out.println("Enter elements into queue: ");
		for(int i=0;i<n;i++)
		{
			q.add(sc.nextInt());
		}
		
		System.out.println("Queue Before Reverse: ");
		System.out.println(q);
		reverseQueue1(q);
		System.out.println("After Reversing above Queue: ");
		System.out.println(q);
		reverseQueue2(q);
		System.out.println("After Reversing above Queue: ");
		System.out.println(q);

	}

	
	//Time complexity-O(n) Space Complexity-O(n)
	private static void reverseQueue1(Queue<Integer> q) {
		
		Stack<Integer>stack=new Stack<Integer>();
		while(!q.isEmpty())
		{
			stack.push(q.poll());
		}
		
		while(!stack.isEmpty())
		{
			q.add(stack.pop());
		}
	}
	
	
	//Time Complexity-O(n) Space Complexity-0
	private static void reverseQueue2(Queue<Integer> q)
	{
		if(q.isEmpty())
		{
			return ;
		}
		else
		{
			int data=q.remove();
			reverseQueue2(q);
			q.add(data);
		}
	}

}
