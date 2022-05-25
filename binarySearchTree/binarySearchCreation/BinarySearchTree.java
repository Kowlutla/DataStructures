package binarySearchCreation;

public class BinarySearchTree 
{
	private class Node
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
		
		public String toString()
		{
			return ""+data;
		}
	}
	
	Node root;
	public void insert(int data)
	{
		root=insert(root,data);
		System.out.println(data+" inserted into tree ");
	}
	public Node insert(Node root,int data)
	{
		Node node=new Node(data);
		if(root==null)
		{
			root=node;
			return root;
		}
		if(root.data>data)
		{
			if(root.left==null)
			{
				root.left=node;
			}
			else
			{
				root.left=insert(root.left,data);
			}
		}
		else if(root.data<data)
		{
			if(root.right==null)
			{
				root.right=node;
			}
			else
			{
				root.right=insert(root.right,data);
			}
		}
		return root;	
	}
	
	public void inOrderTreverse()
	{
		System.out.println("InOrder Traversal : ");
		inOrderTraverse(root);
	}
	
	public void inOrderTraverse(Node root)
	{
		if(root==null)
		{
		//	System.out.println("tree is not exist ");
			return;
		}
		inOrderTraverse(root.left);
		System.out.print(root.data+" ");
		inOrderTraverse(root.right);
		
	}
	
	
	public void preOrderTraversal()
	{
		System.out.println("\nPreOrder Traversal: ");
		preOrderTraversal(root);
	}
	private void preOrderTraversal(Node root) {
		if(root==null)
		{
			return;
		}
		System.out.print(root.data+" ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
		
	}
	
	public void postOrderTraversal()
	{
		System.out.println("\nPost Order Traversal : ");
		postOrderTraversal(root);
	}
	private void postOrderTraversal(Node root) {
		if(root==null)
		{
			return ;
		}
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(root.data+" ");
		
	}
	public boolean searchNode(Node root,int data) {
		if(root==null)
		{
			return false;
		}
		if(root.data==data)
		{
			return true;
		}
		if(root.data>data)
		{
			return searchNode(root.left,data);
		}
		return searchNode(root.right,data);
	}
	
//	public void eularTraversal()
//	{
//		System.out.println("Eular traverse: ");
//		eularTraversal(root);
//	}
////	private void eularTraversal(Node root) {
//		if(root==null)
//		{
//			return;
//		}
//		System.out.print(root.data+" ");
//		if(root.left==null)
//		{
//			eularTraversal(root.left);
//		}
//		if(root.right!=null)
//		{
//			eularTraversal(root.right);
//		}
//		System.out.print(root.data+" ");
//		
//	}
	
	
	
	
}
	
