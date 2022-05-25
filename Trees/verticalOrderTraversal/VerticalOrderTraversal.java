package verticalOrderTraversal;

import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;

public class VerticalOrderTraversal 
{
	protected class Node
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
	
	
	Node root;
	
	public Node createTree(int data)
	{
		Node node=new Node(data);
		return node;
	}
	
	
	
	public void levelOrder(Node root)
	{
		if(root==null)
		{
			return;
		}
		
		Queue<Node>q=new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty())
		{
			Node temp=q.poll();
			System.out.print(temp.data+" ");
			if(temp.left!=null)
			{
				q.add(temp.left);
			}
			if(temp.right!=null)
			{
				q.add(temp.right);
			}
		}
	}
	
	
	public void verticalOrder(Node root)
	{
		TreeMap<Integer,LinkedList<Integer>> map=new TreeMap<>();
		int level=0;
		getVerticalOrder(root,map,level);
		
		for(Entry<Integer,LinkedList<Integer>> entry:map.entrySet())
		{
			System.out.println(entry.getValue());
		}
	}



	private void getVerticalOrder(Node root, TreeMap<Integer, LinkedList<Integer>> map, int level) {
		
		if(root==null)
		{
			return;
		}
		
		LinkedList<Integer>list=map.get(level);
		if(list==null)
		{
			list=new LinkedList<>();
			list.add(root.data);
		}
		else
		{
			list.add(root.data);
		}
		
		map.put(level, list);
		
		getVerticalOrder(root.left,map,level-1);
		getVerticalOrder(root.right,map,level+1);
		
	}
	
	
	
	
	
	
	
}
