package dfs;

import java.util.Stack;

public class DFSOfGraphUsingMatrix {

	
	
	static class Graph
	{
		int nodes;
		int adjMatrix[][];
		
		public Graph(int nodes)
		{
			this.nodes=nodes;
			adjMatrix=new int[nodes][nodes];
		}
	}
	
	
	
	
	private static void addEdge(Graph graph,int source,int dest)
	{
		graph.adjMatrix[source][dest]=1;
		graph.adjMatrix[dest][source]=1;
	}
	
	
	private static void printGraph(Graph graph)
	{
		for(int i=0;i<graph.nodes;i++)
		{
			System.out.print(i+": ");
			for(int j=0;j<graph.nodes;j++)
			{
				System.out.print(graph.adjMatrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	
	private static void DFS(Graph graph,int source)
	{
		System.out.print("DFS from "+source+" : ");
		boolean isvisited[]=new boolean[graph.nodes];
		Stack<Integer>stack=new Stack<Integer>();
		stack.push(source);
		isvisited[source]=true;
		
		while(!stack.isEmpty())
		{
			source=stack.pop();
			System.out.print(source+" ");
			for(int i=0;i<graph.nodes;i++)
			{
				if(!isvisited[i] && graph.adjMatrix[source][i]==1)
				{
					stack.add(i);
					isvisited[i]=true;
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
        
       for(int i=0;i<graph.nodes;i++)
       {
    	   DFS(graph,i);
    	   System.out.println("\n");
       }

	}

}
