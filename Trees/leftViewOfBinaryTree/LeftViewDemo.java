package leftViewOfBinaryTree;

import leftViewOfBinaryTree.LeftView.Node;

public class LeftViewDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LeftView tree=new LeftView();
		Node root=tree.createNode(10);
		root.left=tree.createNode(20);
		root.right=tree.createNode(30);
		root.left.left=tree.createNode(40);
		root.left.right=tree.createNode(50);
		root.right.left=tree.createNode(60);
		root.right.right=tree.createNode(70);
		root.right.left.right=tree.createNode(80);
		root.right.right.right=tree.createNode(90);
		root.right.right.right.right=tree.createNode(100);
		
		System.out.println("Pre Order: ");
		tree.preOrder(root);
		
		System.out.println("\nLeft View : ");
		tree.leftView(root);
		

	}

}
