package LCAinBST;

public class LowestCommonAncsetorBSTDemo {

	public static void main(String[] args) {
		
		LowestCommonAncsetorBST tree=new LowestCommonAncsetorBST();
		
		tree.insert(40);
		tree.insert(20);
		tree.insert(30);
		tree.insert(10);
		tree.insert(50);
		tree.insert(60);
		tree.insert(70);
		tree.insert(80);
		tree.insert(90);
		System.out.println("Pre Order Traversal: ");
		tree.preOrderTraverse(tree.root);
		System.out.print("\nLCA of 50 and 60 using recursion : ");
		tree.LCA(tree.root, 50, 60);
		System.out.print("\nLCA of 10 and 90 without using recursion : ");
		System.out.println(tree.LCA1(tree.root, 10, 90).data);
	}

}
