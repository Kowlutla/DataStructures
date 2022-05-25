package allPathsFromRoot;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class AllPathsFromRoot 
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
	
	public TreeNode createNode(int data)
	{
		TreeNode node=new TreeNode(data);
		return node;
	}
	
	
	public void InOrderTraversal(TreeNode root)
	{
		if(root==null)
		{
			System.out.println("Tree not exist ");
			return;
		}
		Stack<TreeNode>stack=new Stack<TreeNode>();
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
				System.out.print(temp+" ");
				temp=temp.right;
			}
		}
	}
	
	
//	public int getHeightOfTree(TreeNode root)
//	{
//		if(root==null)
//		{
//			return 0;
//		}
//		return 1+Math.max(getHeightOfTree(root.left),getHeightOfTree(root.right));
//	}
	
	
	
	public void printPaths(TreeNode root)
	{
		int height=getHeightOfTree(root);
		int patharray[]=new int[height];
		printPaths(root,patharray,0);
	}
	
	public void printPaths(TreeNode root,int patharray[],int pathlen)
	{
		if(root==null)
		{
			//System.out.println("tree is empty ");
			return;
		}
		patharray[pathlen]=root.data;
		pathlen++;
		if(root.left==null && root.right==null)
		{
			printArray(patharray,pathlen);
		}
		else
		{
			printPaths(root.left,patharray,pathlen);
			printPaths(root.right,patharray,pathlen);
		}
	}
	


	private void printArray(int[] patharray, int pathlen) {
		
		for(int i=0;i<pathlen;i++)
		{
			System.out.print(patharray[i]+" ");
		}
		System.out.println();
	}


	public int getHeightOfTree(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		else
		{
			int leftdepth=getHeightOfTree(root.left);
			int rightdepth=getHeightOfTree(root.right);
			if(leftdepth>rightdepth)
			{
				return 1+leftdepth;
			}
			else
			{
				return 1+rightdepth;
			}
		}
	}
	
	
	
	public int getLevel(TreeNode root,int data)
	{
		return getLevel(root,data,1);
		
	}


	private int getLevel(TreeNode root, int data, int level) 
	{
		if(root==null)
		{
			return 0;
		}
		if(root.data==data)
		{
			return level;
		}
		int result=getLevel(root.left,data,level+1);
		if(result!=0)
		{
			return result;
		}
		result=getLevel(root.right,data,level+1);
		return result;
	}
	
	
	
	List<Integer>pathlist=new ArrayList<Integer>();
	public boolean printPath(TreeNode root,int value)
	{
		
		if(root==null)
		{
			return false;
		}
		if(root.data==value || printPath(root.left,value) || printPath(root.right,value))
		{
			//System.out.print(root.data+" ");
			pathlist.add(root.data);
			//System.out.println(pathlist);
			return true;
		}
		return false;
	}
	
	
//	public void leftView(TreeNode root)
//	{
//
//        if(root==null)
//        {
//            return;
//        }
//         Queue<TreeNode>q=new LinkedList<TreeNode>();
//         q.add(root);
//         while(!q.isEmpty())
//         {
//             TreeNode temp=q.remove();
//             System.out.print(temp.data+" ");
//             if(temp.left==null)
//             {
//                 q.add(temp.right);
//             }
//             else
//             {
//            	 q.add(temp.left);
//             }
//         }
//	}
	public void leftView1(TreeNode root)
	{
		leftView1(root,0);
	}

	int maxlevel=0;
	private void leftView1(TreeNode root, int level)
	{
		if(root==null)
			return;
		if(level>=maxlevel)
		{
			System.out.print(root.data+" ");
			maxlevel++;
		}
		leftView1(root.left,level+1);
		leftView1(root.right,level+1);
		
	}
	
	public void rightView(TreeNode root)
	{
		rightView(root,0);
	}

	int mlevel=0;
	private void rightView(TreeNode root, int level) {
		
		if(root==null)
		{
			return;
		}
		if(level>=mlevel)
		{
			System.out.print(root.data+" ");
			mlevel++;
		}
		rightView(root.right,level+1);
		rightView(root.left,level+1);
		
	}
	
	
	
	
	
	
}
