/**
 Check the completeness of given binary tree | Set 1 – Using Node Count

Objective: Given a binary tree, write an algorithm to determine whether the tree is complete or not. 

Complete Binary Tree: A binary tree T with n levels is complete if all levels except possibly 
			the last are completely full, and the last level has all its nodes to the left side.
			
  
 */
package completeOfBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author kowlutla
 *
 */
public class CompleteNessOfBinaaryTree {

	
	static class Node
	{
		int data;
		Node left;
		Node right;
		
		public Node(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
		
	}
	
	public static Node createNode(int data)
	{
		Node node=new Node(data);
		return node;
	}
	
	public static void preOrder(Node root)
	{
		if(root==null)
				return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static boolean isComplete(Node root)
	{
		if(root==null)
				return true;
		int count_node=getCount(root);
		
		return isCompleteUtil(root,0,count_node);
	}
	
	private static boolean isCompleteUtil(Node root, int index, int count_node) {
		
		if(root==null)
			return true;
		
		if(index>=count_node)
			return false;
		int left=2*index+1;
		int right=2*index+2;
		
		return isCompleteUtil(root.left,left,count_node)&& isCompleteUtil(root.right,right,count_node);
	}

	public static int getCount(Node root)
	{
		if(root==null)
			return 0;
		return 1+getCount(root.left)+getCount(root.right);
	}
	
	
	public static boolean isComplete1(Node root)
	{
		if(root==null)
			return true;
		Queue<Node>q=new LinkedList<Node>();
		q.add(root);
		boolean isLast=false;
		while(!q.isEmpty())
		{
			Node temp=q.poll();
			if(temp==null)
			{
				isLast=true;
			}
			else 
			{
				if(isLast)
				{
					return false;
				}
				q.add(temp.left);
				
				q.add(temp.right);
			}
			
			
				
		}
		return true;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Node root=createNode(10);
		root.left=createNode(20);
		root.right=createNode(30);
		root.left.left=createNode(40);
		root.left.right=createNode(50);
		root.right.left=createNode(60);
		root.right.right=createNode(70);
		root.left.left.left=createNode(80);
		root.right.right.right=createNode(90);
		root.right.right.right.right=new Node(100);
		
		System.out.println("Pre order: ");
		preOrder(root);
		
		System.out.println("\nTree is Complete: ");
		System.out.println(isComplete(root));
		
		System.out.println("\nTree is Complete: ");
		System.out.println(isComplete1(root));
	}

}
