package LCAinBST;

public class LowestCommonAncsetorBST 
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
	
	public void preOrderTraverse(Node node)
	{
		if(node==null)
		{
			return ;
		}
		System.out.print(node.data+" ");
		preOrderTraverse(node.left);
		preOrderTraverse(node.right);
	}
	
	
	public void LCA(Node root,int a,int b)
	{
		if(root==null)
		{
			return;
		}
		
		if(root.data>a && root.data>b)
		{
			LCA(root.left,a,b);
		}
		if(root.data<a && root.data<b)
		{
			LCA(root.right,a,b);
		}
		else
		{
			System.out.print(root.data);
		}
		
	}
	
	public Node LCA1(Node root,int a,int b)
	{
		while(root!=null)
		{
			if(root.data>a && root.data>b)
			{
				root=root.left;
			}
			if(root.data<a && root.data<b)
			{
				root=root.right;
			}
			else 
			{
				return root;
			}
		}
			
		return root;
	}
}
