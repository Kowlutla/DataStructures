package dfs;

import java.util.Iterator;
import java.util.LinkedList;

public class DFSOfGraphUsingRecursion {

	int nodes;
	LinkedList<Integer>[]graph;
	
	public DFSOfGraphUsingRecursion(int nodes)
	{
		this.nodes=nodes;
		graph=new LinkedList[nodes];
			
		for(int i=0;i<nodes;i++)
		{
			graph[i]=new LinkedList<Integer>();
		}
	}
	
	
	public void addEdge(int source,int dest)
	{
		if(source>=nodes || dest>=nodes)
		{
			System.out.println("Edge can't possible ");
			return;
		}
		
		
		graph[source].add(dest);
		graph[dest].add(source);
		
		System.out.println("An edge is added between "+source+" and "+dest);
	}
	
	
	
	public void printGraph()
	{
		System.out.println("Graph Adjacency: ");
		
		for(int i=0;i<nodes;i++)
		{
			System.out.print("Head "+i+" : ");
			Iterator<Integer>iter=graph[i].listIterator();
			while(iter.hasNext())
			{
				System.out.print("- - > "+iter.next());
			}
			System.out.println();
		}
	}
	
	
	
	
	public void DFSUsingRecursion(int source)
	{
		boolean visited[]=new boolean[nodes];
		DFSUsingRecursionUtil(source,visited);
		System.out.println();
	}
	
	private void DFSUsingRecursionUtil(int source, boolean[] visited) {
		
		visited[source]=true;
		System.out.print(source+" - - > ");
		for(int i=0;i<graph[source].size();i++)
		{
			int dest=graph[source].get(i);
			if(!visited[dest])
			{
				DFSUsingRecursionUtil(dest,visited);
			}
		}
	}


	public static void main(String[] args) {
		
		DFSOfGraphUsingRecursion g=new DFSOfGraphUsingRecursion(5);
		
		g.addEdge(0, 1); 
		g.addEdge(0, 4); 
		g.addEdge(1, 2); 
		g.addEdge(1, 3); 
		g.addEdge(1, 4); 
		g.addEdge(2, 3); 
		g.addEdge(3, 4); 
		g.printGraph();
		
		
		System.out.println("DFS Of all Nodes: ");
		for(int i=0;i<g.nodes;i++)
		{
			g.DFSUsingRecursion(i);
		}
	

	}

}
