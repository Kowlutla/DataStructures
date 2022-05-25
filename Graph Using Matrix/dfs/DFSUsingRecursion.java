package dfs;

public class DFSUsingRecursion {

	
	int nodes;
	int graph[][];
	
	public DFSUsingRecursion(int nodes)
	{
		this.nodes=nodes;
		graph=new int[nodes][nodes];
	}
	
	//undirected graph
	public void addEdge(int source,int dest)
	{
		if(source>=nodes || dest>=nodes)
		{
			System.out.println("Edge between nodes not possible ");
			return;
		}
		
		graph[source][dest]=1;
		graph[dest][source]=1;
		System.out.println("An edge is added between "+source+" and "+dest);
	}
	
	
	
	public void printGraph()
	{
		
		System.out.println("Adjacency list : \n");
		for(int i=0;i<nodes;i++)
		{
			System.out.print(i+":\t");
			for(int j=0;j<graph[i].length;j++)
			{
				System.out.print(graph[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}
	
	
	public void dfsUsingRecursion(int source)
	{
		boolean visited[]=new boolean[nodes];
		
		dfsUsingRecursionUtil(source,visited);
		System.out.println();
	}
	
	
	private void dfsUsingRecursionUtil(int source, boolean[] visited) {
	
		visited[source]=true;
		System.out.print(source+"  ");
		for(int i=0;i<nodes;i++)
		{
			if(graph[source][i]==1 && !visited[i])
			{
				dfsUsingRecursionUtil(i,visited);
			}
		}
		
	}

	public static void main(String[] args) {
		
		DFSUsingRecursion g=new DFSUsingRecursion(5);
		g.addEdge(0, 1); 
		g.addEdge(0, 4); 
		g.addEdge(1, 2); 
		g.addEdge(1, 3); 
		g.addEdge(1, 4); 
		g.addEdge(2, 3); 
		g.addEdge(3, 4); 
		g.printGraph();
		
		System.out.println("\nDFS from all vertices: ");
		for(int i=0;i<g.nodes;i++)
		{
			System.out.print("DFS from "+i+" : ");
			g.dfsUsingRecursion(i);
		}
	}

}
