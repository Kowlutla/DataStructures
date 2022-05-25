package treeBSTorNot;

public class CheckBST 
{
	protected class Node
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
	
	public Node createNode(int data)
	{
		Node node=new Node(data);
		return node;
	}
	
	public boolean isBST(Node root,int min,int max)
	{
		if(root==null)
		{
			return true;
		}
		
		if(root.data>max || root.data<min)
		{
			return false;
		}
		return isBST(root.left,min,root.data) && isBST(root.right,root.data,max);
	}
	
	public void traverse(Node node)
	{
		if(node==null)
		{
			return;
		}
		traverse(node.left);
		System.out.print(node.data+" ");
		traverse(node.right);
	}
	
	
	
}
