package reverseDirectedGraph;

import java.util.LinkedList;

public class ReverseGraph {

	
	static class Graph
	{
		int nodes;
		LinkedList<Integer>[] adjList;
		
		public Graph(int nodes)
		{
			this.nodes=nodes;
			adjList=new LinkedList[nodes];
			
			for(int i=0;i<nodes;i++)
			{
				adjList[i]=new LinkedList<Integer>();
			}
		}
		
		
		public void addEdge(int source,int dest)
		{
			adjList[source].add(dest);
		}
		
		public void printGraph()
		{
			System.out.println("Adjacency list of each vertex: ");
			for(int i=0;i<nodes;i++)
			{
				System.out.print("Vertex "+i+" connected to\n ");
				for(int j=0;j<adjList[i].size();j++)
				{
					System.out.print(" - - > "+adjList[i].get(j));
				}
				System.out.println();
			}
		}
		
		
		
		public Graph reverseGraph(Graph graph)
		{
			Graph temp=new Graph(nodes);
			for(int i=0;i<nodes;i++)
			{
				int source=i;
				LinkedList<Integer>nodelist=adjList[source];
				for(int j=0;j<nodelist.size();j++)
				{
					int dest=nodelist.get(j);
					temp.addEdge(dest, source);
				}
			}
			return temp;
		}
		
	}
	
	
	public static void main(String args[]) {
		Graph graph=new Graph(5);
		graph.addEdge(0,1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 0);
        System.out.println("---------------Original Graph---------------------------");
        graph.printGraph();
        
        System.out.println("---------------Reversed Graph---------------------------");
        Graph reverse_graph=graph.reverseGraph(graph);
        reverse_graph.printGraph();
	}
	


}
