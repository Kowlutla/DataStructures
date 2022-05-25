package treeBSTorNot;

import treeBSTorNot.CheckBST.Node;

public class CheckBSTDemo {

	public static void main(String[] args) {
		
		
		CheckBST tree=new CheckBST();
		
		Node root=tree.createNode(30);
		root.left=tree.createNode(20);
		root.right=tree.createNode(40);
		root.left.left=tree.createNode(10);
		root.right.right=tree.createNode(50);
		
		System.out.println("In Order traversal: ");
		tree.traverse(root);
		System.out.println();
		if(tree.isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE))
		{
			System.out.println("the tree is BST");
		}
		else
		{
			System.out.println("The tree is Not BST");
		}
		

	}

}
