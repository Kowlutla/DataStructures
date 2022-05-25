package binaryTreeToLinkedList;

public class BinaryTreeToLinkedList {
	
	static class TreeNode
	{
		int data;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	static class ListNode
	{
		int data;
		ListNode next;
		
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public static void inOrder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	static ListNode temp=new ListNode(0);
	public static void convertTreeToList(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		convertTreeToList(root.left);
		System.out.print(root.data+" ");
		ListNode current=new ListNode(root.data);
		temp.next=current;
		temp=temp.next;
		convertTreeToList(root.right);
	}
	
	public static void main(String[] args) {
	
		
		TreeNode root=new TreeNode(10);
		root.left=new TreeNode(20);
		root.right=new TreeNode(30);
		root.left.left=new TreeNode(40);
		root.left.right=new TreeNode(50);
		root.right.left=new TreeNode(60);
		root.right.right=new TreeNode(70);

		System.out.println("InOrder Traversal: ");
		inOrder(root);
		
		System.out.println("\nTree To List: ");
		convertTreeToList(root);
		ListNode head=temp.next;
		ListNode current=head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		
		
	}

}
