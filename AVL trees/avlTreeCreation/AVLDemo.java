package avlTreeCreation;

public class AVLDemo {

	public static void main(String[] args) {
		
		AVL tree=new AVL();
		tree.insert(10);
		tree.insert(20);
		tree.insert(30);
		tree.insert(40);
		tree.insert(50);
		tree.insert(25);
	;
		System.out.println("Traversal : ");
		tree.traverse(tree.root);

	}

}
