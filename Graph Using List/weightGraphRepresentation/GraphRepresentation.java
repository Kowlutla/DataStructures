package weightGraphRepresentation;

import java.util.LinkedList;

public class GraphRepresentation {
	
	static class Edge
	{
		int source;
		int dest;
		int weight;
		
		public Edge(int source,int dest,int weight)
		{
			this.source=source;
			this.dest=dest;
			this.weight=weight;
		}
	}
	static class Graph
	{
		int nodes;
		LinkedList<Edge>[]adjList;
		
		public Graph(int nodes)
		{
			this.nodes=nodes;
			
			adjList=new LinkedList[nodes];
			
			for(int i=0;i<nodes;i++)
			{
				adjList[i]=new LinkedList<Edge>();
			}
		}
		
		//undirected graph
		public void addEdge(int source,int dest,int weight)
		{
			Edge edge=new Edge(source,dest,weight);
			adjList[source].add(edge);
			edge=new Edge(dest,source,weight);
			adjList[dest].add(edge);
		}
		
		public void printGraph()
		{
			for(int i=0;i<nodes;i++)
			{
				//LinkedList<Edge> list=adjList[i];
				System.out.println("Adjecency list of vertex "+i+" : ");
				System.out.print("Head: "+i);
				for(Edge list:adjList[i])
				{
					System.out.print("- >"+list.dest+"("+list.weight+")");
				}
				System.out.println("\n");
			}
		}
	}
	
	public static void main(String args[])
	{
		 int vertices = 6;
         Graph graph = new Graph(vertices);
         graph.addEdge(0, 1, 4);
         graph.addEdge(0, 2, 3);
         graph.addEdge(1, 3, 2);
         graph.addEdge(1, 2, 5);
         graph.addEdge(2, 3, 7);
         graph.addEdge(3, 4, 2);
         graph.addEdge(4, 0, 4);
         graph.addEdge(4, 1, 4);
         graph.addEdge(4, 5, 6);
         graph.printGraph();
	}
	
	
	
	
	
	
	
	

}
