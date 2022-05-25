package avlTreeCreation;

public class AVL {
	
	public class Node
	{
		int data,height;
		Node left;
		Node right;
		public Node(int data)
		{
			this.height=1;
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

	private Node insert(Node node, int data) {
		
	
		if(node==null)
		{
			return (new Node(data));
		}
		
		if(node.data<data)
		{
			node.right=insert(node.right,data);
		}
		else if(node.data>data)
		{
				node.left=insert(node.left,data);
		}
		else 
		{
			return node;
		}
		node.height=1+Math.max(height(node.left),height(node.right));
		int balance=getbalance(node);	
		
		if(balance>1 && data<node.left.data)
		{
			return rightRotate(node);
		}
		if(balance<-1 && data>node.right.data)
		{
			return leftRotate(node);
		}
		if(balance>1 && data>node.left.data)
		{
			node.left=leftRotate(node.left);
			return rightRotate(node);
		}
		if(balance<-1 && data<node.right.data)
		{
			node.right=rightRotate(node.right);
			return leftRotate(node);
		}
	return node;
		
	}
	
	private Node leftRotate(Node x) {
		
		Node y=x.right;
		Node temp=y.left;
		
		y.left=x;
		x.right=temp;
		x.height=1+Math.max(height(x.left), height(x.right));
		y.height=1+Math.max(height(y.left), height(y.right));
		return y;
		
	}

	private Node rightRotate(Node y) {
		Node x=y.left;
		Node t2=x.right;
		x.right=y;
		y.left=t2;
		y.height = Math.max(height(y.left), height(y.right)) + 1; 
	    x.height = Math.max(height(x.left), height(x.right)) + 1; 
		return x;
		
	}

	int height(Node n)
	{
		if(n==null)
		{
			return 0;
		}
		return n.height;
	}
	

	
	
	

	public void traverse(Node root)
	{
		if(root==null)
		{
			return;
		}
		
		System.out.print(root.data+" ");
		traverse(root.left);
		
		traverse(root.right);
	}

	private int getbalance(Node node) {
		if(node==null)
		{
			return 0;
		}
		return height(node.left)-height(node.right);
	}
	
	
	
	public void traversal(Node root)
	{
		if(root==null)
		{
			return;
		}
		
		System.out.print(root.data+" ");
		traversal(root.left);
		traversal(root.right);
	}
	
	

}
