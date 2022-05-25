package minimumAndMaximumInBST;

public class MinMaxBSTDemo {

	public static void main(String[] args) {
		
		MinMaxBST tree=new MinMaxBST();
		tree.insert(40);
		tree.insert(20);
		tree.insert(30);
		tree.insert(10);
		tree.insert(50);
		tree.insert(60);
		tree.insert(70);
		tree.insert(80);
		tree.insert(90);
		System.out.println("In Order Traversal: ");
		tree.inOrderTraverse(tree.root);
		
		System.out.println("\nMinimum in Tree: "+tree.getMinimum(tree.root));
		System.out.println("\nMaximum in Tree: "+tree.getMaximum(tree.root));
	}

}
