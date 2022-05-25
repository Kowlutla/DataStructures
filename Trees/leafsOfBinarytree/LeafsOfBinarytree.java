package leafsOfBinarytree;

import java.util.Stack;

public class LeafsOfBinarytree
{
	public class TreeNode
	{
		int data;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
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
	
	
	
	public void PreOrderTraverse(TreeNode root)
	{
		if(root==null)
		{
			return ;
		}
		Stack<TreeNode>stack=new Stack<TreeNode>();
		stack.add(root);
		while(!stack.isEmpty())
		{
			TreeNode temp=stack.pop();
			System.out.print(temp.data+" ");
			if(temp.right!=null)
			{
				stack.add(temp.right);
			}
			if(temp.left!=null)
			{
				stack.add(temp.left);
			}
		}
	}
	
	
	
	//Counts the no of leaf nodes
	public int getLeafsCount(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		if(root.left==null && root.right==null)
		{
			return 1;
		}
		return getLeafsCount(root.left)+getLeafsCount(root.right);
	}
	
	//Print the all leaf nodes in tree
	public void LeafNodes(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		if(root.left==null && root.right==null)
		{
			System.out.print(root+" ");
		}
		LeafNodes(root.left);
		LeafNodes(root.right);
	}
	


	
	//Count the total no of nodes in tree
	public int getTotalNode(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		return 1+getTotalNode(root.left)+getTotalNode(root.right);
	}
	
	//Count the no of Non leafs nodes in tree
	public int getNonLeafCount(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		if(root.left==null && root.right==null)
		{
			return 0;
		}
		return 1+getNonLeafCount(root.left)+getNonLeafCount(root.right);
	}
	
	
	//Print all Non leafs nodes in tree
	public void nonLeafNodes(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		
		if(root.left!=null || root.right!=null)
		{
			System.out.print(root+" ");
		}
		nonLeafNodes(root.left);
		nonLeafNodes(root.right);
	}
	
	public void NodesAtLevel(TreeNode root,int level)
	{
		if(root==null)
		{
			return;
		}
		if(level==1)
		{
			System.out.print(root.data+" ");
		}
		NodesAtLevel(root.left,level-1);
		NodesAtLevel(root.right,level-1);
	}
	
	public int getNoOfFullNodes(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		int count=0;
		if(root.left!=null && root.right!=null)
		{
			count++;
		}
		count=count+getNoOfFullNodes(root.left)+getNoOfFullNodes(root.right);
		return count;
		
	}
	
	public void getFullNodes(TreeNode root)
	{
		if(root!=null)
		{
			getFullNodes(root.left);
			if(root.left!=null && root.right!=null)
			{
				System.out.print(root.data+" ");
			}
			getFullNodes(root.right);
		}
		
	}
	
	
	
	
	
	
}
