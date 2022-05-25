package dfs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DFSOfGraph {
	
	
	static class Graph
	{
		int nodes;
		LinkedList<Integer>adjList[];
	
		public Graph(int nodes)
		{
			this.nodes=nodes;
			adjList=new LinkedList[nodes];
			
			for(int i=0;i<nodes;i++)
			{
				adjList[i]=new LinkedList<Integer>();
			}
		}
	}
	
	
	static void addEdge(Graph graph,int source,int dest)
	{
		try{
			graph.adjList[source].add(dest);
			graph.adjList[dest].add(source);
		}
		catch(Exception e)
		{
			System.out.println("Not Possible to create Edge between "+source+" and "+dest);
		}
	}
	
	
	static void printGraph(Graph graph)
	{
		
		for(int i=0;i<graph.nodes;i++)
		{
			System.out.println("Adjecency list of  vertex: "+i);
			System.out.print("Head: "+i+"  ");
			for(int j:graph.adjList[i])
			{
				System.out.print("- > "+j);
			}
			System.out.println("\n");

		}
	}
	
	
	
	private static void DFS(Graph graph,int source)
	{
		Stack<Integer>stack=new Stack<Integer>();
		boolean visited[]=new boolean[graph.nodes];
		stack.push(source);
		visited[source]=true;
		while(!stack.isEmpty())
		{
			source=stack.pop();
			System.out.print(source+" ");
			
			Iterator<Integer>iter=graph.adjList[source].listIterator();
			while(iter.hasNext())
			{
				int temp=iter.next();
				if(!visited[temp])
				{
					stack.push(temp);
					visited[temp]=true;
				}
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		Graph graph=new Graph(5);
		addEdge(graph, 0, 1); 
        addEdge(graph, 0, 4); 
        addEdge(graph, 1, 2); 
        addEdge(graph, 1, 3); 
        addEdge(graph, 1, 4); 
        addEdge(graph, 2, 3); 
        addEdge(graph, 3, 4);
        
        printGraph(graph);
        
        DFS(graph,0);
		
		

	}

}
