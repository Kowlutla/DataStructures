package deletionInBST;

public class DeletionInBSTDemo {

	public static void main(String[] args) {
	
		DeletionInBST tree=new DeletionInBST();
		
		tree.insert(40);
		tree.insert(20);
		tree.insert(30);
		tree.insert(10);
		tree.insert(50);
		tree.insert(60);
		tree.insert(70);
		tree.insert(80);
		tree.insert(90);
		System.out.println("InOrder traversal : ");
		tree.inOrderTraversal(tree.root);
		System.out.println("\n40 is deleted: ");
		tree.deleteKey(tree.root, 40);
		//tree.inOrderTraversal(tree.root);
		System.out.println("InOrder traversal : ");
		tree.inOrderTraversal(tree.root);

	}

}
