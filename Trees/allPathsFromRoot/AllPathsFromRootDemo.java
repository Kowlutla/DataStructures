package allPathsFromRoot;

import java.util.Collections;

import allPathsFromRoot.AllPathsFromRoot.TreeNode;

public class AllPathsFromRootDemo {

	public static void main(String[] args) {
		
		AllPathsFromRoot tree=new AllPathsFromRoot();

		TreeNode root=tree.createNode(10);
		root.left=tree.createNode(20);
		root.right=tree.createNode(30);
		root.left.left=tree.createNode(40);
		root.left.right=tree.createNode(50);
		root.right.left=tree.createNode(60);
		root.right.right=tree.createNode(70);
		root.left.left.right=tree.createNode(80);
		root.left.left.right.left=tree.createNode(90);
//		root.right.right.right=tree.createNode(100);
//		root.left.left.left=tree.createNode(300);
//		root.left.left.right=tree.createNode(400);
//		root.left.left.left.right=tree.createNode(500);
//		root.left.left.left.left=tree.createNode(600);
		System.out.println("In Order Traversal: ");
		tree.InOrderTraversal(root);
		
		System.out.print("\nHeight of tree: ");
		System.out.println(tree.getHeightOfTree(root));
		
		System.out.println("All possible path from root: ");
		tree.printPaths(root);
		
		
		System.out.println("\nLevel of 30 is "+tree.getLevel(root, 30));
		
		
		System.out.println("Path from root to 50 is: ");
		tree.printPath(root, 50);
		Collections.reverse(tree.pathlist);
		System.out.println(tree.pathlist);
		
		System.out.println("Left View using recursion: ");
		tree.leftView1(root);
		System.out.println("\nRight View using recursion : ");
		tree.rightView(root);
	}

}
