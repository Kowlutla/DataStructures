package binarySearchCreation;

public class BinarySearchTreeDemo {

	public static void main(String[] args) {
		
		BinarySearchTree tree=new BinarySearchTree();
		tree.insert(1);
		tree.insert(2);
		tree.insert(3);
		tree.insert(4);
		tree.insert(5);
		tree.insert(6);
		tree.insert(7);
		tree.insert(8);
		tree.insert(9);
		tree.insert(10);
		tree.insert(11);
		tree.insert(12);
		tree.insert(13);
		tree.insert(14);
		tree.inOrderTreverse();
		tree.preOrderTraversal();
		tree.postOrderTraversal();
		System.out.println("\n5 is present: "+tree.searchNode(tree.root,5));
		
	}

}
