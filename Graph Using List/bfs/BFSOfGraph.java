package bfs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSOfGraph {
	
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
	
	
	private static void addEdge(Graph graph,int source,int dest)
	{
		graph.adjList[source].add(dest);
		graph.adjList[dest].add(source);
	}
	
	private static boolean isEdgeThere(Graph graph,int source,int dest)
	{
		if(graph.adjList[source].contains(dest))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	private static void printGraph(Graph graph)
	{
		for(int i=0;i<graph.nodes;i++)
		{
			System.out.println("Adjecency list of Node :"+i );
			System.out.print("Head: ");
			
			for(int j:graph.adjList[i])
			{
				System.out.print("- > "+j);
			}
			System.out.println("\n");
		}
	}
	
	
	
	static private void BFS(Graph graph,int source)
	{
		
		System.out.println("BFS from Node "+source);
		Queue<Integer> q=new LinkedList<Integer>();
		boolean visited[]=new boolean[graph.nodes];
		q.add(source);
		visited[source]=true;
		while(!q.isEmpty())
		{
			source=q.poll();
			System.out.print(source+" ");
			Iterator<Integer> iter=graph.adjList[source].listIterator();
			while(iter.hasNext())
			{
				int temp=iter.next();
				if(!visited[temp])
				{
					q.add(temp);
					visited[temp]=true;
				}
			}
		}
	}
	
	
	public static void main(String args[])
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter no of vertices: ");
		int nodes=5;
		Graph graph=new Graph(nodes);
		addEdge(graph, 0, 1); 
        addEdge(graph, 0, 4); 
        addEdge(graph, 1, 2); 
        addEdge(graph, 1, 3); 
        addEdge(graph, 1, 4); 
        addEdge(graph, 2, 3); 
        addEdge(graph, 3, 4);
		System.out.println(isEdgeThere(graph,3,2));
		printGraph(graph);
		
		for(int i=0;i<graph.nodes;i++)
		{
			//System.out.println("BFS from Node "+i);
			BFS(graph,i);
			System.out.println();
		}
	}
	
	
	
	

}
