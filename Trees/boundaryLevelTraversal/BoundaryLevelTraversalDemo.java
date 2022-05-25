package boundaryLevelTraversal;

import boundaryLevelTraversal.BoundaryLevelTraversal.TreeNode;

public class BoundaryLevelTraversalDemo {

	public static void main(String[] args) {
		
		BoundaryLevelTraversal tree=new BoundaryLevelTraversal();
		
		TreeNode root=tree.createNode(10);
		//tree.boundaryLevelTraversal(root);
		root.left=tree.createNode(20);
		root.right=tree.createNode(30);
		root.left.left=tree.createNode(40);
		root.left.right=tree.createNode(50);
		root.right.left=tree.createNode(60);
		root.right.right=tree.createNode(70);
//		root.left.left.right=tree.createNode(80);
//		root.left.left.right.left=tree.createNode(90);
		
		System.out.println("Boundary Level Traversal: ");
		tree.boundaryLevelTraversal(root);
		System.out.println("\nPreOrder: ");
		tree.preOrder(root);
		System.out.println("\nInOrder: ");
		tree.InOrderTraverse(root);
		System.out.println("\nPostOrder: ");
		tree.postOrderTraverse(root);
		
		System.out.println("After Changing: ");
		
		TreeNode temp=tree.doSomething(root);
		System.out.println("\nPreOrder: ");
		tree.preOrder(temp);
		System.out.println("\nInOrder: ");
		tree.InOrderTraverse(temp);
		System.out.println("\nPostOrder: ");
		tree.postOrderTraverse(temp);
		

	}



}
