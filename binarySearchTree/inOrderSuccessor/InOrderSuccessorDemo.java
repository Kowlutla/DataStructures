package inOrderSuccessor;

import inOrderSuccessor.InOrderSuccessor.Node;

public class InOrderSuccessorDemo {

	public static void main(String[] args) {
		
		InOrderSuccessor tree=new InOrderSuccessor();
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
		tree.traversal(tree.root);
		
		Node temp=tree.root.left.left;
		System.out.println("\nInOrder Successor of "+temp.data+" is: "+tree.inOrderSuc(temp));
	}

}
