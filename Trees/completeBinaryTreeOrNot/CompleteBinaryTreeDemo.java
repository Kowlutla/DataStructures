package completeBinaryTreeOrNot;

import completeBinaryTreeOrNot.CompleteBinaryTree.TreeNode;

public class CompleteBinaryTreeDemo {

	public static void main(String[] args) {
		
		CompleteBinaryTree tree=new CompleteBinaryTree();
		TreeNode root=tree.createNode(10);
		root.left=tree.createNode(20);
		root.right=tree.createNode(30);
		root.left.left=tree.createNode(40);
		root.left.right=tree.createNode(50);
		root.left.left.left=tree.createNode(60);
		root.left.left.right=tree.createNode(70);
		if(tree.isComplete(root))
		{
			System.out.println("Complete");
		}
		else
		{
			System.out.println("Not Complete");
		}
		

	}

}
