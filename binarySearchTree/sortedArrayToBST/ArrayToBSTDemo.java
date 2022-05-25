package sortedArrayToBST;

public class ArrayToBSTDemo {

	public static void main(String[] args) {
		
		ArrayToBST tree=new ArrayToBST();
		int array[]= {10,20,30,40,50,60,70,80,90};
		tree.root=tree.createBSTFromArray(array, 0, array.length-1);
		tree.traverse(tree.root);
		
	}

}
