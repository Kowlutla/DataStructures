package inOrderSuccessor;

public class InOrderSuccessor 
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
		else
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
	
	
	public void traversal(Node root)
	{
		if(root==null)
		{
			return;
		}
		traversal(root.left);
		System.out.print(root.data+" ");
		traversal(root.right);
	}
	
	
	public int inOrderSuc(Node node)
	{
		if(node==null)
		{
			return -1;
		}
		if(node.right!=null)
		{
			Node temp=getMinRightNode(node);
			return temp.data;
		}
		else
		{
			Node temp=nextGreaterNode(root,node);
			return temp.data;
		}
	}

private Node nextGreaterNode(Node root,Node node) {
		
			if(root==null)
			{
				return null;
			}
			Node temp=root;
			if(temp.left==node)
			{
				return temp;
			}
			if(temp.data<node.data)
			{
				return nextGreaterNode(root.right,node);
			}
			else
			{
				return nextGreaterNode(root.left,node);
			}
	
	}

//	private Node traverseForParent(Node node) {
//		
//		Node temp=root;
//		if(root==null)
//		{
//			return null;
//		}
//		if(node.data<)
//	//	return traverseForParent(root.right);
//		
//	}

	private Node getMinRightNode(Node node) {
		
		Node temp=node.right;
		while(temp.left!=null)
		{
			temp=temp.left;
		}
		return temp;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
