package BinaryTreeCreation;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;




public class BinaryTreeCreation
{
	public class TreeNode
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
		
		public String toString()
		{
			return ""+data;
		}
	}
	
	
	
	TreeNode root;
	
	
	
	public void preOrderTraverse(TreeNode root)
	{
		//System.out.println("Pre order traversal :"); 
		if(root==null)
		{
			return;
		}
		System.out.print(root+" ");
		preOrderTraverse(root.left);
		preOrderTraverse(root.right);
	}
	
	
	
	
	
	public void PreOrderUsingIterater(TreeNode root)
	{
		if(root==null)
		{
			System.out.println("There is not tree exist ");
			return;
		}
		Stack<TreeNode>stack=new Stack<TreeNode>();
		stack.push(root);
		while(!stack.isEmpty())
		{
			TreeNode temp=stack.pop();
			System.out.print(temp.data+" ");
			if(temp.right!=null)
			{
				stack.push(temp.right);
			}
			if(temp.left!=null)
			{
				stack.push(temp.left);
			}
		}
	}
	
	
	public void InOrderTraverse(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		InOrderTraverse(root.left);
		System.out.print(root+" ");
		InOrderTraverse(root.right);
	}
	
	
	
	
	public void InOrderUsingiterater(TreeNode root)
	{
		if(root==null)
		{
			System.out.println("No tree Exist ");
			return;
		}
		Stack<TreeNode> stack=new Stack<TreeNode>();
		TreeNode temp=root;
		while(!stack.isEmpty() || temp!=null)
		{
			if(temp!=null)
			{
				stack.push(temp);
				temp=temp.left;
			}
			else
			{
				temp=stack.pop();
				System.out.print(temp.data+" ");
				temp=temp.right;
			}
		}
	}
	
	public void PostOrderTraverse(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		PostOrderTraverse(root.left);
		PostOrderTraverse(root.right);
		System.out.print(root+" ");
	}
	
	
	public void postOrderUsingStacks(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		Stack<TreeNode>stack1=new Stack<TreeNode>();
		Stack<TreeNode>stack2=new Stack<TreeNode>();
		stack1.push(root);
		while(!stack1.isEmpty())
		{
			TreeNode temp=stack1.pop();
			if(temp.left!=null)
			{
				stack1.push(temp.left);
			}
			if(temp.right!=null)
			{
				stack1.push(temp.right);
			}
			stack2.push(temp);
		}
		while(!stack2.isEmpty())
		{
			System.out.print(stack2.pop().data+" ");
		}
		
	}
	
	
	public void LevelOrderTraverse(TreeNode root)
	{
		if(root==null)
		{
			return ;
		}
		Queue<TreeNode>queue=new LinkedList<TreeNode>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			TreeNode temp=queue.poll();
			System.out.print(temp.data+" ");
			if(temp.left!=null)
			{
				queue.add(temp.left);
			}
			if(temp.right!=null)
			{
				queue.add(temp.right);
			}
		}
	}
	
	
	public void levelOrderUsingRec(TreeNode root)
	{
		int height=getHeight(root);
		for(int i=1;i<=height;i++)
		{
			printAtLevel(root,i);
			System.out.println();
		}
		
	}
	
	private void printAtLevel(TreeNode root, int level) 
	{
		if(root==null)
		{
			return;
		}
		if(level==1)
		{
			System.out.print(root.data+" ");
		}
		printAtLevel(root.left,level-1);
		printAtLevel(root.right,level-1);
		
	}


	public void reverseLevelOrderUsingRec(TreeNode root)
	{
		int height=getHeight(root);
		for(int i=height;i>=1;i--)
		{
			printAtLevel1(root,i);
			System.out.println();
		}
	}
	 
	
	private void printAtLevel1(TreeNode root, int level) 
	{
		if(root==null)
		{
			return;
		}
		if(level==1)
		{
			System.out.print(root.data+" ");
		}
		printAtLevel1(root.right,level-1);
		printAtLevel1(root.left,level-1);
		
	}
	


	private int getHeight(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		int left=getHeight(root.left);
		int right=getHeight(root.right);
		if(left>right)
		{
			return 1+left;
		}
		else
		{
			return 1+right;
		}
		
	}





	public void reverseLevelOrder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		Stack<TreeNode>stack=new Stack<TreeNode>();
		Queue<TreeNode>q=new LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty())
		{
			TreeNode temp=q.poll();
			if(temp.left!=null)
			{
				q.add(temp.left);
			}
			if(temp.right!=null)
			{
				q.add(temp.right);
			}
			stack.push(temp);
		}
		while(!stack.isEmpty())
		{
			System.out.print(stack.pop()+" ");
		}
	//	System.out.println();
	}
	
	
	
	public void eularTraversal(TreeNode root) {
		if(root==null)
		{
			return;
		}
		System.out.print(root.data+" ");
		if(root.left!=null)
		{
			eularTraversal(root.left);
		}
		if(root.right!=null)
		{
			eularTraversal(root.right);
		}
		System.out.print(root.data+" ");
		
	}
	
	
	public void doubleOrderTraversal(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		System.out.print(root.data+" ");
		doubleOrderTraversal(root.left);
		System.out.print(root.data+" ");
		doubleOrderTraversal(root.right);
	}
	
	
	public void tripleOrderTraversal(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		System.out.print(root.data+" ");
		doubleOrderTraversal(root.left);
		System.out.print(root.data+" ");
		doubleOrderTraversal(root.right);
		System.out.print(root.data+" ");
	}
	
	
	public TreeNode creatBinaryTree()
	{
		TreeNode one=new TreeNode(1);
		TreeNode two=new TreeNode(2);
		TreeNode three=new TreeNode(3);
		TreeNode four=new TreeNode(4);
		TreeNode five=new TreeNode(5);
		TreeNode six=new TreeNode(6);
		TreeNode seven=new TreeNode(7);
		TreeNode eight=new TreeNode(8);
		TreeNode nine=new TreeNode(9);
		TreeNode ten=new TreeNode(10);
		TreeNode eleven=new TreeNode(11);
		TreeNode twelve=new TreeNode(12);
		TreeNode thirteen=new TreeNode(13);
		TreeNode fourteen=new TreeNode(14);
		//TreeNode eight=new TreeNode(8);
		 
		
		root=eight;
		eight.left=three;
		eight.right=ten;
		three.left=one;
		three.right=six;
		six.left=four;
		six.right=seven;
		four.right=five;
		ten.left=nine;
		ten.right=thirteen;
		thirteen.left=eleven;
		thirteen.right=fourteen;
		eleven.right=twelve;
		
		
		return root;
	}
}
