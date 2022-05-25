package bottomViewOfBinaryTree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;


public class BottomView {
	
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


	public Node createNode(int data)
	{
		Node node=new Node(data);
		return node;
	}


	public void preOrder(Node root)
	{
		if(root==null)
		{
			return ;
		}
		
		Stack<Node>stack=new Stack<Node>();
		stack.push(root);
		while(!stack.isEmpty())
		{
			Node temp=stack.pop();
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
	
	
	public void bottomView(Node root)
	{
		class QueueObj
		{
			Node node;
			int level;
			public QueueObj(Node node,int level)
			{
				this.level=level;
				this.node=node;
			}
		}
		
		if(root==null)
		{
			return;
		}
		Queue<QueueObj>q=new LinkedList<QueueObj>();
		TreeMap<Integer,Node>map=new TreeMap<Integer,Node>();
		
		q.add(new QueueObj(root,0));
		while(!q.isEmpty())
		{
			QueueObj temp=q.poll();
			if(map.containsKey(temp.level))
			{
				map.put(temp.level,temp.node );
			}
			else
			{
				map.put(temp.level,temp.node );
			}
			
			if(temp.node.left!=null)
			{
				q.add(new QueueObj(temp.node.left,temp.level-1));
			}
			if(temp.node.right!=null)
			{
				q.add(new QueueObj(temp.node.right,temp.level+1));
			}
		}
		
		Iterator<Integer>iter=map.keySet().iterator();
		while(iter.hasNext())
		{
			int key=iter.next();
			System.out.print(map.get(key).data+" ");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
