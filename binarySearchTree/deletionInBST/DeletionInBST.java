package deletionInBST;

public class DeletionInBST
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
		
		public String toStirng()
		{
			return ""+data;
		}
	}
	
	Node root;
	
	public void insert(int data)
	{
		root=insert(root,data);
		System.out.println(data+ " is inserted into tree ");
	}
	
	private Node insert(Node root,int data)
	{
		Node node=new Node(data);
		if(root==null)
		{
			root=node;
		}
		else
		{
			if(root.data>data)
			{
				if(root.left==null)
				{
					root.left=node;
				}
				else
				{
					insert(root.left,data);
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
					insert(root.right,data);
				}
			}
		}
		return root;
	}
	
	
	
	public void inOrderTraversal(Node root)
	{
		if(root==null)
		{
			return;
		}
//		System.out.print(root.data+" ");
		inOrderTraversal(root.left);
		System.out.print(root.data+" ");
		inOrderTraversal(root.right);
		
	}
	
	
	public Node deleteKey(Node root,int key)
	{
		if(root==null)
		{
			return null;
		}
		if(root.data>key)
		{
			root.left=deleteKey(root.left,key);
		}
		else if(root.data<key)
		{
			root.right=deleteKey(root.right,key);
		}
		else//if value is found
		{
			if(root.left==null || root.right==null)//check for if node contain atmost one children
			{
				if(root.right!=null)
				{
					return root.right;
				}
				else if(root.left!=null)
				{
					return root.left;
				}
				else 
				{
					return null;
				}
			}
			else //if node contain two nodes and have to swap min value from right sub tree with current node 
			{	 //and then delete the last node
				Node rightmin=getMinimum(root);
				root.data=rightmin.data;
				root.right=deleteKey(root.right,rightmin.data);
				return root;
			}
		}
		return root;
	}

	private Node getMinimum(Node node) {
		if(node==null)
		{
			return null;
		}
		Node temp=node.right;
		while(temp.left!=null)
		{
			temp=temp.left;
		}
		return temp;
	}
	
	
	
	
}
