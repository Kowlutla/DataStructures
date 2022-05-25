package topViewOfBinaryTree;

import topViewOfBinaryTree.TopView.Node;;

public class TopViewDemo {

	public static void main(String[] args) {
		
		TopView tree=new TopView();
		
		Node root=tree.createNode(10);
		//tree.boundaryLevelTraversal(root);
		root.left=tree.createNode(20);
		root.right=tree.createNode(30);
		root.left.left=tree.createNode(40);
		root.left.right=tree.createNode(50);
		root.right.left=tree.createNode(60);
		root.right.right=tree.createNode(70);
		root.right.left.right=tree.createNode(80);
		root.right.right.right=tree.createNode(90);
		System.out.println("Pre Order: ");
		tree.preOrder(root);
		System.out.println("\nTop View: ");
		tree.topView(root);
		

	}

}
