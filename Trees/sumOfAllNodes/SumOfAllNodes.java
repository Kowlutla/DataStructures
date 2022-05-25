package sumOfAllNodes;

import sumOfAllNodes.Tree.TreeNode;

class Tree {

	
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
	
	//TreeNode root;
	
	public TreeNode createNode(int data)
	{
		TreeNode node=new TreeNode(data);
		node.left=null;
		node.right=null;
		return node;
	}
	
	
	public void preOrderTraversal(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		System.out.print(root.data+" ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	
	public int sumOfNodes(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		return root.data+sumOfNodes(root.left)+sumOfNodes(root.right);
	}
	
	public int getDifferenceEvenOddLevels(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		
		return root.data-getDifferenceEvenOddLevels(root.left)-getDifferenceEvenOddLevels(root.right);
	}
}


public class SumOfAllNodes
{
	public static void main(String args[])
	{
		
		Tree tree=new Tree();
		TreeNode root=tree.createNode(10);
		root.left=tree.createNode(20);
		root.right=tree.createNode(30);
		root.left.left=tree.createNode(40);
		root.left.right=tree.createNode(50);
		root.right.left=tree.createNode(60);
		root.right.right=tree.createNode(70);
		System.out.println("PreOrder Traversal: ");
		tree.preOrderTraversal(root);
		
		
		System.out.print("\nSum of all Nodes: ");
		System.out.println(tree.sumOfNodes(root));
		
		System.out.println("Difference of Even Odd levels: "+tree.getDifferenceEvenOddLevels(root));
		
	}
}






