package verticalOrderTraversal;

import verticalOrderTraversal.VerticalOrderTraversal.Node;

public class VerticalOrderTraversalDemo {

	public static void main(String[] args) {
	
		VerticalOrderTraversal tree=new VerticalOrderTraversal ();
		
		Node root=tree.createTree(10);
		//tree.boundaryLevelTraversal(root);
		root.left=tree.createTree(20);
		root.right=tree.createTree(30);
		root.left.left=tree.createTree(40);
		root.left.right=tree.createTree(50);
		root.right.left=tree.createTree(60);
		root.right.right=tree.createTree(70);
		root.right.left.right=tree.createTree(80);
		root.right.right.right=tree.createTree(90);
		System.out.println("Level Order : ");
		tree.levelOrder(root);
		System.out.println("\nVertical Order: ");
		tree.verticalOrder(root);
		
	}

}
