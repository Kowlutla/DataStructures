/**
 Populate Next Siblings Pointers in a Given Binary Tree OR Populate Next Right Pointers in Each Node
 
 Objective: – Given a binary tree with three pointers left, right and nextSibling). Write the program to provide the nextsibling pointers.
 
 This problem can also be referred as “Populating Next Right Pointers in Each Node”
 
 
 */
package populateNextSibling;

/**
 * @author apiiit-rkv
 *
 */
public class PopulateNextSibling {


	static class Node
	{
		int data;
		Node left;
		Node right;
		Node sibling;
		public Node(int data)
		{
			this.data=data;
		}
	}
	
	
	public static Node createNode(int data)
	{
		Node node=new Node(data);
		return node;
	}
	
	public static void preOrder(Node root)
	{
		if(root==null)
				return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static Node nextSibling(Node root)
	{
		if(root!=null)
		{
			if(root.left!=null)
			{
				root.left.sibling=root.right;
			}
			if(root.right!=null)
			{
				if(root.sibling!=null)
				{
					root.right.sibling=root.sibling.left;
				}
			}
			
			nextSibling(root.left);
			nextSibling(root.right);
			return root;
		}
		return null;
	}
	
	public static void printSiblings(Node root)
	{
		while(root!=null)
		{
			System.out.print(root.data+" ");
			root=root.sibling;
		}
		System.out.println();
		
	}
	
	
	public static void main(String[] args) {
		
		
		Node root=createNode(10);
		root.left=createNode(20);
		root.right=createNode(30);
		root.left.left=createNode(40);
		root.left.right=createNode(50);
		root.right.left=createNode(60);
		root.right.right=createNode(70);
		root.right.left.right=createNode(80);
		root.right.right.right=createNode(90);
		root.right.right.right.right=createNode(100);
		
		System.out.println("Pre Order: ");
		preOrder(root);
		
		System.out.println("\nSiblings: ");
		
		root=nextSibling(root);
		printSiblings(root.left);
		printSiblings(root.left.left);
		

	}

}
