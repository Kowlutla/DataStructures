package BinaryTreeCreation;

import BinaryTreeCreation.BinaryTreeCreation.TreeNode;

public class BinaryTreeCreationDemo {

	public static void main(String[] args) 
	{
		
		BinaryTreeCreation tree=new BinaryTreeCreation();
		TreeNode root=tree.creatBinaryTree();
		System.out.println("Pre Order Traversal Using Recursion: ");
		tree.preOrderTraverse(root);
		
		System.out.println("\n- - - - - - - - - - - - - - - - - - -");
		System.out.println("Pre Order Traversal Using Iterator :");
		tree.PreOrderUsingIterater(root);
		
		System.out.println("\n- - - - - - - - - - - - - - - - - - -");
		System.out.println("In Order Traversal  Using Recursion: ");
		tree.InOrderTraverse(root);
		

		System.out.println("\n- - - - - - - - - - - - - - - - - - -");
		System.out.println("In Order Traversal Using Iterator :");
		tree.InOrderUsingiterater(root);
		
		System.out.println("\n- - - - - - - - - - - - - - - - - - -");
		System.out.println("Post Order Traversal  Using Recursion: ");
		tree.PostOrderTraverse(root);
		
		System.out.println("\n- - - - - - - - - - - - - - - - - - -");
		System.out.println("Post Order Traversal  Using stacks: ");
		tree.postOrderUsingStacks(root);
		
		System.out.println("\n- - - - - - - - - - - - - - - - - - -");
		System.out.println("Level Order Traversal without recursion:");
		tree.LevelOrderTraverse(root);
		
		System.out.println("\n- - - - - - - - - -  - - - - - - - - - - - ");
		System.out.println("Level Order using reccurion: ");
		tree.levelOrderUsingRec(root);
		
		System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("Reversed Level order without recursion: ");
		tree.reverseLevelOrder(root);
		
		System.out.println("\n- - - - - - - - - -  - - - - - - - - - - - ");
		System.out.println("Reverse of Level Order using reccurion: ");
		tree.reverseLevelOrderUsingRec(root);
	
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - ");
		System.out.println("Eular Traversal: " );
		tree.eularTraversal(root);
		System.out.println();
		
		System.out.println("- - -- - - - - - - - - - - - - - - - - - - - - - ");
		System.out.println("Double Order traversal: ");
		tree.doubleOrderTraversal(root);
		
		System.out.println("\n- - -- - - - - - - - - - - - - - - - - - - - - - ");
		System.out.println("Triple Order traversal: ");
		tree.tripleOrderTraversal(root);
	}

}
