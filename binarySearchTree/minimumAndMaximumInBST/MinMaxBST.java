package minimumAndMaximumInBST;

public class MinMaxBST 
{
	public class Node
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
	
	Node root;
	
	public void insert(int data)
	{
		root=insert(root,data);
		
	}

	private Node insert(Node root, int data) {
		
		Node node=new Node(data);
		if(root==null)
		{
			root=node;
			return root;
		}
		if(data<root.data)
		{
			root.left=insert(root.left,data);
		}
		else
		{
			root.right=insert(root.right,data);
		}
		return root;
	}
	
	public void inOrderTraverse(Node root)
	{
		if(root==null)
		{
			return ;
		}
		inOrderTraverse(root.left);
		System.out.print(root.data+" ");
		inOrderTraverse(root.right);
	}
	
	public int getMinimum(Node root)
	{
		if(root.left==null)
		{
			return root.data;
		}
		return getMinimum(root.left);
		//return -1;
	}
	
	public int getMaximum(Node root)
	{
		if(root.right==null)
		{
			return root.data;
		}
		return getMaximum(root.right);
	}
	
}
