package sortingQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class SortingQueue {

	static Queue<Integer>q;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of elements in Queue: ");
		int n=sc.nextInt();
		System.out.println("Enter elements into stack: ");
		q=new LinkedList<Integer>();
		for(int i=1;i<=n;i++)
		{
			q.add(sc.nextInt());
		}
		
		System.out.println("Original Queue: ");
		System.out.println(q);
		System.out.println("Peek: "+q.peek());
		System.out.println("Queue After Sorting: ");
		sortQueue2(q);
		System.out.println(q);
		
	}
	private static void sortQueue1(Queue<Integer> q2) {
		
		Stack<Integer>temp=new Stack<Integer>();
		while(!q.isEmpty())
		{
			int current=q.poll();
			while(!temp.isEmpty() && temp.peek()<current)
			{
				q.add(temp.pop());
			}
			temp.add(current);
		}
		while(!temp.isEmpty())
		{
			q.add(temp.pop());
		}
		
	}
	
	
	static void sortQueue2(Queue<Integer> q)
	{
		if(q.isEmpty())
		{
			return ;
		}
		else
		{
			int data=q.poll();
			sortQueue2(q);
			pushInQueue(q,data,q.size());
		}
	}
	private static void pushInQueue(Queue<Integer> q,int data, int size) {
	
		if(size==0 || q.isEmpty())
		{
			q.add(data);
			return;
		}
		else if(q.peek()>=data)
		{
			q.add(data);
			FrontToLast(q,size);
		}
		else
		{
			q.add(q.poll());
			pushInQueue(q,data,size-1);
		}
		
	}
	private static void FrontToLast(Queue<Integer> q,int size) {
		
		if(size<=0)
		{
			return;
		}
		q.add(q.poll());
		FrontToLast(q,size-1);
		
	}
	
	
	

}
