package boundaryLevelTraversal;

import BinaryTreeCreation.BinaryTreeCreation.TreeNode;

public class BoundaryLevelTraversal
{
	public class TreeNode
	{
		int data;
		TreeNode right;
		TreeNode left;
		
		public TreeNode(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
		
	}
	
	public TreeNode createNode(int data)
	{
		TreeNode node=new TreeNode(data);
		return node;
	}
	
	public void boundaryLevelTraversal(TreeNode root)
	{
		if(root==null)
		{
			System.out.println("Tree not exist ");
			return;
		}
		System.out.print(root.data+" ");
		leftView(root.left);
		printLeafs(root);
		printRightViewBottomUp(root.right);
	}

	private void leftView(TreeNode root) {
		
		if(root==null)
		{
			return;
		}
		System.out.print(root.data+" ");
		if(root.left==null && root.right==null)
		{
			return;
		}
		if(root.left==null)
		{
			leftView(root.right);
		}
		else
		{
			leftView(root.left);
		}
		
	}
	
	public void printLeafs(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		
		if(root.left==null && root.right==null)
		{
			System.out.print(root.data+" ");
			return;
		}
		printLeafs(root.left);
		printLeafs(root.right);
		
	}
	
	
	public void printRightViewBottomUp(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		if(root.left==null && root.right==null)
		{
			return;
		}
		if(root.right!=null)
		{
			printRightViewBottomUp(root.right);
		}
		else if(root.left!=null)
		{
			printRightViewBottomUp(root.left);
		}
		System.out.print(root.data+" ");
	}
	
	
	public void preOrder(TreeNode root)
	{
		//System.out.println("Pre Order: ");
		if(root==null)
			return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	
	public void InOrderTraverse(TreeNode root)
	{
		//System.out.println("InOrder: ");
		if(root==null)
		{
			return;
		}
		InOrderTraverse(root.left);
		System.out.print(root.data+" ");
		InOrderTraverse(root.right);
	}
	
	
	public void postOrderTraverse(TreeNode root)
	{
		//System.out.println("PostOrder: ");
		if(root==null)
		{
			return;
		}
		postOrderTraverse(root.left);
		postOrderTraverse(root.right);
		System.out.print(root.data+" ");
	}
	
	public TreeNode doSomething(TreeNode root)
	{
		if(root==null)
		{
			return null;
		}
		
		TreeNode temp=new TreeNode(root.data);
		temp.right=doSomething(root.left);
		temp.left=doSomething(root.right);
		return temp;
	}
	
	
	
}
