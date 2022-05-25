package VerticalSum;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Stack;
import java.util.TreeMap;

public class VerticalSum 
{
	public class TreeNode
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
		TreeNode node=new TreeNode(data);
		return node;
	}
	
	public void preOrderTraversal(TreeNode root)
	{
		if(root==null)
		{
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
	
//	public void verticalSum(TreeNode root)
//	{
//		TreeMap<Integer,Integer>map=new TreeMap<Integer,Integer>();
//		verticalSum(root,map,0);
//		for(Entry<Integer,Integer>entry:map.entrySet())
//		{
//			System.out.print(entry.getValue()+" ");
//		}
//	}
//
//	private void verticalSum(TreeNode root, TreeMap<Integer, Integer> map, int level) 
//	{
//		if(root==null)
//		{
//			return;
//		}
//		
//		verticalSum(root.left,map,level-1);
//		if(map.get(level)!=null)
//		{
//			int sum=root.data+map.get(level);
//			map.put(level,sum);
//		}
//		else
//		{
//			map.put(level, root.data);
//		}
//		verticalSum(root.right,map,level+1);
//	}
//	
	public void verticalSum(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		TreeMap<Integer,Integer>map=new TreeMap<Integer,Integer>();
		verticalSum(root,map,0);
		
		for(Entry<Integer,Integer>entry:map.entrySet())
		{
			System.out.print(entry.getValue()+" ");
		}
	}
	
	public void verticalSum(TreeNode root,TreeMap<Integer,Integer> map,int level)
	{
		
		if(root==null)
		{
			return;
		}
		verticalSum(root.right,map,level+1);
		
		if(map.get(level)!=null)
		{
			map.put(level, map.get(level)+root.data);
		}
		else
		{
			map.put(level, root.data);
		}
		verticalSum(root.left,map,level-1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
