package leftViewOfBinaryTree;

public class LeftView {
	
	public class Node
	{
		int data;
		Node left;
		Node right;
		
		public Node(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
//	Node root;
	
	public Node createNode(int data)
	{
		Node node=new Node(data);
		return node;
	}
	
	
	public void preOrder(Node root)
	{
		if(root==null)
		{
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public void leftView(Node root)
	{
		int level=0;
		getLeftView(root,level);
	}

	int maxlevel=0;
	private void getLeftView(Node root, int level) {
		
		
		if(root==null)
		{
			return;
		}
		if(level>=maxlevel)
		{
			System.out.print(root.data+" ");
			maxlevel++;
		}
		getLeftView(root.left,level+1);
		getLeftView(root.right,level+1);
	}
	
	
	
	
	
	
	
	
	

}
