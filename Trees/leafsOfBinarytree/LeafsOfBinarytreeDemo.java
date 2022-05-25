package leafsOfBinarytree;

import leafsOfBinarytree.LeafsOfBinarytree.TreeNode;

public class LeafsOfBinarytreeDemo {

	public static void main(String[] args) {
	
		
		LeafsOfBinarytree tree=new LeafsOfBinarytree();
		TreeNode root=tree.createNode(10);
		root.left=tree.createNode(20);
		root.right=tree.createNode(30);
		root.left.left=tree.createNode(40);
		root.left.right=tree.createNode(50);
		root.right.left=tree.createNode(60);
		root.right.right=tree.createNode(70);
		root.right.right.right=tree.createNode(100);
		root.right.right.right.left=tree.createNode(101);
		root.right.right.right.right=tree.createNode(102);
		root.left.left.left=tree.createNode(300);
		root.left.left.right=tree.createNode(400);
		System.out.println("PreOrder Traversal: ");
		tree.PreOrderTraverse(root);
		
		System.out.print("\n\nTotal Node in tree: ");
		int totalnodes=tree.getTotalNode(root);
		System.out.println(totalnodes);
		
		System.out.print("\nNo of Leaf Nodes: ");
		int leafs=tree.getLeafsCount(root);
		System.out.println(leafs);
		
		System.out.print("Leaf Nodes are: ");
		tree.LeafNodes(root);
		
		System.out.print("\n\nNo of Non-Leafs are: ");
		int nonleafs=tree.getNonLeafCount(root);
		System.out.println(nonleafs);
		
		System.out.print("Non leaf Nodes are: ");
		tree.nonLeafNodes(root);
		
		System.out.println("\nNodes at 3rd Level: ");
		tree.NodesAtLevel(root, 3);
		
		System.out.println("\nNo of Full nodes: ");
		System.out.println(tree.getNoOfFullNodes(root));
		
		System.out.println("Full Nodes: ");
		tree.getFullNodes(root);
	}


}
