package priorityQueueUsingArray;

public class PriorityQueue {
	
	int size;
	int heap[];
	
	public PriorityQueue(int maxSize)
	{
		this.size=0;
		heap=new int[maxSize];
	}
	
	
	
	//To push the elements into Queue
	public void push(int data)
	{
		if(size==heap.length)
		{
			throw new IllegalStateException();
		}
		else
		{
			int pos=size;
			heap[pos]=data;
			
			while(pos>0)
			{
				int parent=(pos-1)/2;
				if(heap[pos]>heap[parent])
				{
					swap(pos,parent);
				}
				else
				{
					break;
				}
				pos=parent;
			}
			size++;
			System.out.println("Pushed: "+data);
		}
		
	}
	
	
	
	public int pop()
	{
		if(size==0)
		{
			throw new IllegalStateException();
		}
		else
		{
			int toReturn=heap[0];
			heap[0]=heap[size-1];
			int pos=0;
			while(pos<(size/2))
			{
				int leftChild=(pos*2)+1;
				int rightChild=(pos*2)+2;
				if(rightChild<size && heap[rightChild]>heap[leftChild])
				{
					if(heap[pos]>=heap[rightChild])break;
					swap(pos,rightChild);
					pos=rightChild;
				}
				else
				{
					if(heap[pos]>=heap[leftChild])break;
					swap(pos,leftChild);
					pos=leftChild;
				}
			}
			
			size--;
			System.out.println("Poped: "+toReturn);
			return toReturn;
		}
	}

	private void swap(int pos, int parent) {
		
		int temp=heap[pos];
		heap[pos]=heap[parent];
		heap[parent]=temp;
		
	}


	public void printQueue()
	{
		System.out.println("Queue: ");
		for(int i=0;i<size;i++)
		{
			System.out.print(heap[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		PriorityQueue q=new PriorityQueue(5);
		q.push(10);
		q.push(6);
		q.push(4);
		q.push(15);
		q.push(30);
		q.printQueue();
		q.pop();
		q.pop();
		q.pop();
		q.pop();
		q.pop();
		//q.pop();
		
		

	}

}
