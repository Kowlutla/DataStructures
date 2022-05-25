package sortedArrayToBST;

public class ArrayToBST {

	
	public class Node
	{
		int data;
		Node left;
		Node right;
		
		public Node(int data)
		{
			this.data=data;
		}
	}
	Node root;
	
	public void traverse(Node root)
	{
		if(root==null)
		{
			return;
		}
		System.out.print(root.data+" ");
		traverse(root.left);
		
		traverse(root.right);
	}
	
	
	public Node createBSTFromArray(int array[],int start,int last)
	{
		if(start>last)
		{
			return null;
		}
		int mid=(start+last)/2;
		Node node=new Node(array[mid]);
		node.left=createBSTFromArray(array,start,mid-1);
		node.right=createBSTFromArray(array,mid+1,last);
		return node;
	}

}


