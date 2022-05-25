package maxAndMinimum;

import maxAndMinimum.MaxAndMinimumTree.TreeNode;

public class MaxAndMinimumTreeDemo {

	public static void main(String[] args) {
		
		
		MaxAndMinimumTree tree=new MaxAndMinimumTree();
		
		TreeNode root=tree.createNode(10);
		root.left=tree.createNode(20);
		root.right=tree.createNode(30);
		root.left.left=tree.createNode(40);
		root.left.right=tree.createNode(50);
		root.right.left=tree.createNode(60);
		root.right.right=tree.createNode(70);
		root.right.right.right=tree.createNode(100);
		root.left.left.left=tree.createNode(300);
		root.left.left.right=tree.createNode(400);
		root.left.left.left.right=tree.createNode(500);
		
		System.out.println("In Order Traversal: ");
		tree.inOrderTraversal(root);
		
		System.out.println("\n\nMaximum element in tree without Recursion : "+tree.getMaximum(root));
		
		System.out.println("\nMinimum element in tree  without  Recursion: "+tree.getMinimum(root));
		
		System.out.println("\nMaximum element in tree Using Recursion : "+tree.getMaximumRec(root));
		
		System.out.println("\nMinimum element in tree Using Recursion : "+tree.getMinimumRec(root));
		
		System.out.println("\nLCA(300,100): "+tree.lowestCommonAncestor(root, 300, 100));
		System.out.println("\nLCA(70,80): "+tree.lowestCommonAncestor(root, 70, 80));

	}

}
