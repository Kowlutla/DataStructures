package reverseDirectedGraph;

public class ReverseDirectedGraph {
	
	
	int nodes;
	int[][]graph;
	
	public ReverseDirectedGraph(int nodes)
	{
		this.nodes=nodes;
		graph=new int[nodes][nodes];
	}
	
	//directed edge
	public void addEdge(int source,int dest)
	{
		//System.out.println("Directed Edge added from "+source+" to "+dest);
		graph[source][dest]=1;
	}
	
	public void removeEdge(int source,int dest)
	{
		graph[source][dest]=0;
	}
	
	
	
	
	public void printGraph()
	{
		for(int i=0;i<nodes;i++)
		{
			System.out.println("vertex "+i+" connected ");
			for(int j=0;j<nodes;j++)
			{
				if(graph[i][j]!=0)
				{
					System.out.print("- - > "+j);
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	
	public int[][] reverseGraph()
	{
		int temp[][]=new int[nodes][nodes];
		for(int i=0;i<nodes;i++)
		{
			for(int j=0;j<nodes;j++)
			{
				temp[j][i]=graph[i][j];
			}
		}
		return temp;
	}
	
	
	public void printMatrix()
	{
		System.out.println("Adjacency matrix: ");
		for(int i=0;i<nodes;i++)
		{
			for(int j=0;j<nodes;j++)
			{
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		ReverseDirectedGraph g=new ReverseDirectedGraph(5);
		g.addEdge(0,1);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 0);
        System.out.println("Original graph: ");
        g.printGraph();
        g.printMatrix();
        
        System.out.println("\nAfter reversing directions of edges: ");
       g.graph= g.reverseGraph();
        g.printMatrix();
        g.printGraph();
        
      
        
	}

}
