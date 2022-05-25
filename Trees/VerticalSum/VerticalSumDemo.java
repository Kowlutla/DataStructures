package VerticalSum;

import VerticalSum.VerticalSum.TreeNode;

public class VerticalSumDemo {

	public static void main(String[] args) {
		
		VerticalSum tree=new VerticalSum();
		TreeNode root=tree.createNode(10);
		root.left=tree.createNode(20);
		root.right=tree.createNode(30);
		root.left.left=tree.createNode(40);
		root.left.right=tree.createNode(50);
		root.right.left=tree.createNode(60);
		root.right.right=tree.createNode(70);
		root.left.left.right=tree.createNode(80);
		root.left.left.left=tree.createNode(100);
		root.left.left.right.left=tree.createNode(90);
		System.out.println("Pre Oder Traversal: ");
		tree.preOrderTraversal(root);
		System.out.println("\nVertical Sum: ");
		tree.verticalSum(root);
	}

}
