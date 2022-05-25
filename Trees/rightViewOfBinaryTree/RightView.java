package rightViewOfBinaryTree;


public class RightView {
	

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
	
	public void rightView(Node root)
	{
		int level=0;
		getRightView(root,level);
	}
	int max=0;
	public void getRightView(Node root,int level)
	{

		if(root==null)
		{
			return;
		}
		if(level>=max)
		{
			System.out.print(root.data+" ");
			max++;
		}
		
		getRightView(root.right,level+1);
		getRightView(root.left,level+1);
	}
	
	
	

}
