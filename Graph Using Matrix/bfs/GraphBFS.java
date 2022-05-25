package bfs;

import java.util.LinkedList;
import java.util.Queue;

public class GraphBFS {

	private int nodes;
	private int adjMatrix[][];
	private GraphBFS(int nodes)
	{
		this.nodes=nodes;
		adjMatrix=new int[nodes][nodes];
	}
	
	
	private void addEdge(int source,int dest)
	{
		adjMatrix[source][dest]=1;
		adjMatrix[dest][source]=1;
	}
	
	private void printGraph()
	{
		System.out.println("Adjecency Matrix: ");
		for(int i=0;i<nodes;i++)
		{
			System.out.print(i+" : ");
			for(int j=0;j<nodes;j++)
			{
				System.out.print(adjMatrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	private void BFS(int source)
	{
		boolean visited[]=new boolean[nodes];
		
		Queue<Integer>q=new LinkedList<Integer>();
		q.add(source);
		visited[source]=true;
		while(!q.isEmpty())
		{
			source=q.poll();
			System.out.print(source+" ");
			for(int i=0;i<nodes;i++)
			{
				if(!(visited[i]) && adjMatrix[source][i]==1 )
				{
					q.add(i);
					visited[i]=true;
				}
			}
		}
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		GraphBFS g=new GraphBFS(5);
		g.addEdge(0, 1); 
        g.addEdge(0, 4); 
        g.addEdge(1, 2); 
        g.addEdge(1, 3); 
        g.addEdge(1, 4); 
        g.addEdge(2, 3); 
        g.addEdge(3, 4); 
        g.printGraph();
        
        System.out.println("BFS from Node 0: ");
        g.BFS(0);
		

	}

}
