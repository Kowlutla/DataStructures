package maxAndMinimum;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MaxAndMinimumTree

{
	public class TreeNode
	{
		int data;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int data)
		{
			this.data=data;
			this.left=this.right=null;
			
		}
		
		
		public String toString()
		{
			return ""+data;
		}
		
	}
	
	
	public TreeNode createNode(int data)
	{
		TreeNode node=new TreeNode(data);
		return node;
	}
	
	
	public void inOrderTraversal(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		
		Stack<TreeNode>stack=new Stack<TreeNode>();
		TreeNode temp=root;
		while(!stack.isEmpty() || temp!=null)
		{
			if(temp!=null)
			{
				stack.push(temp);
				temp=temp.left;
			}
			else
			{
				temp=stack.pop();
				System.out.print(temp.data+" ");
				temp=temp.right;
			}
		}
	}
	
	
	
	public int getMaximum(TreeNode node)
	{
		int max=Integer.MIN_VALUE;
		if(node==null)
		{
			System.out.println("Tree is empty ");
			return 0;
		}
		Queue<TreeNode>q=new LinkedList<TreeNode>();
		q.add(node);
		while(!q.isEmpty())
		{
			TreeNode temp=q.poll();
			if(temp.data>max)
			{
				max=temp.data;
			}
			if(temp.left!=null)
			{
				q.add(temp.left);
			}
			if(temp.right!=null)
			{
				q.add(temp.right);
			}
		}
		return max;
	}
	
	public int getMinimum(TreeNode node)
	{
		if(node==null)
		{
			System.out.println("Tree is not exist ");
			return 0;
		}
		int min=Integer.MAX_VALUE;
		Queue<TreeNode>q=new LinkedList<TreeNode>();
		q.add(node);
		while(!q.isEmpty())
		{
			TreeNode temp=q.poll();
			if(temp.data<min)
			{
				min=temp.data;
			}
			if(temp.left!=null)
			{
				q.add(temp.left);
			}
			if(temp.right!=null)
			{
				q.add(temp.right);
			}
		}
		return min;
	}
	
	
	public int getMaximumRec(TreeNode node)
	{
		int max=Integer.MIN_VALUE;
		if(node!=null)
		{
			int value=node.data;
			
			int left=getMaximumRec(node.left);
			int right=getMaximumRec(node.right);
			
			if(left>right)
			{
				max=left;
			}
			else
			{
				max=right;
			}
			if(max<value)
			{
				max=value;
			}
		}
		return max;
	}
	
	
	public int getMinimumRec(TreeNode node)
	{
		int min=Integer.MAX_VALUE;
		
		if(node!=null)
		{
			int value=node.data;
			int left=getMaximumRec(node.left);
			int right=getMaximumRec(node.right);
			if(left>right)
			{
				min=right;
			}
			else
			{
				min=left;
			}
			if(min>value)
			{
				min=value;
			}
		}
		return min;
	}
	
	
	public TreeNode lowestCommonAncestor(TreeNode root,int n1,int n2)
	{
		if(root==null)
		{
			return null;
		}
		if(root.data==n1 || root.data==n2)
		{
			return root;
		}
		TreeNode left=lowestCommonAncestor(root.left,n1,n2);
		TreeNode right=lowestCommonAncestor(root.right,n1,n2);
		
		if(left!=null && right!=null)
		{
			return root;
		}
		if(left==null)
		{
			return right;
		}
		else
		{
			return left;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
