package unWeightGraphRepresentation;

import java.util.LinkedList;

public class GraphRepresentation {
	
	
	static class Graph
	{
		int nodes;
		LinkedList<Integer> adjList[];
		
		public Graph(int nodes)
		{
			this.nodes=nodes;
			adjList=new LinkedList [nodes];
			
			for(int i=0;i<nodes;i++)
			{
				adjList[i]=new LinkedList<>();
			}
		}
	}
	
	//undirected graph
	static void addEdge(Graph graph,int source,int dest)
	{
		graph.adjList[source].add(dest);
		graph.adjList[dest].add(source);
	}

	static void printGraph(Graph graph)
	{
		for(int i=0;i<graph.nodes;i++)
		{
			System.out.println("Adjecency list of vertex "+i+" : ");
			System.out.print("Head: ");
			for(int j:graph.adjList[i])
			{
				System.out.print(" - > "+j);
			}
			System.out.println("\n");
		}
	}
	
	public static void main(String args[])
	{
		Graph graph =new Graph(5);
		addEdge(graph, 0, 1); 
        addEdge(graph, 0, 4); 
        addEdge(graph, 1, 2); 
        addEdge(graph, 1, 3); 
        addEdge(graph, 1, 4); 
        addEdge(graph, 2, 3); 
        addEdge(graph, 3, 4); 
		printGraph(graph);
	}
	
	
	
}
