package graphRepresentation;

public class Graph {

	boolean adjMatrix[][];
	int nodes;
	
	public Graph(int nodes)
	{
		this.nodes=nodes;
		adjMatrix=new boolean[nodes][nodes];
	}
	
	
	public void addEdge(int i,int j)
	{
		adjMatrix[i][j]=true;
		adjMatrix[j][i]=true;
	}
	
	public void removeEdge(int i,int j)
	{
		adjMatrix[i][j]=false;
		adjMatrix[j][i]=false;
	}
	
	
	public boolean isEdge(int i,int j)
	{
		if(adjMatrix[i][j]==true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//to print graph
	
	public String toString()
	{
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<nodes;i++)
		{
			sb.append(i+" : ");
			for(boolean j:adjMatrix[i])
			{
				sb.append(j?1+" ":0+" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		
		Graph g=new Graph(4);
		g.addEdge(3, 2);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
	//	System.out.println(graph.isEdge(1, 3));
		System.out.println(g.toString());
		
	}

}
