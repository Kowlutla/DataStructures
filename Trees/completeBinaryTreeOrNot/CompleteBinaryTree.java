package completeBinaryTreeOrNot;

public class CompleteBinaryTree 
{
	protected class TreeNode
	{
		int data;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int data)
		{
			this.data=data;
		}
	}
	
	public TreeNode createNode(int data)
	{
		TreeNode node =new TreeNode(data);
		return node;
	}
	
	
	protected boolean isComplete(TreeNode root)
	{
		if(root==null)
		{
			return true;
		}
		
		if(root.left!=null && root.right==null || root.right!=null && root.left==null)
		{
			return false;
		}
		return isComplete(root.left) && isComplete(root.right);
		
		
	}
	
}
