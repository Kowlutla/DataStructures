package DetectLoopInLinkedList;

public class LinkedListDemo {

	public static void main(String[] args)
	{
		LinkedList list=new LinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(4);
		list.insert(3);
		list.insert(5);
//		list.insert(6);
//		list.insert(7);
		//list.insert(120);
		list.traverse();
		//list.head.next.next.next.next.next = list.head.next;
		if(list.FloydsCycle_FindingAlgorithm())
		{
			System.out.println("Yes Loop There ");
		}
		else
		{
			System.out.println("NO Loop");
		}
		System.out.println("Count of Loop: "+list.LoopCount());
		//list.traverse();
		
		System.out.println(list.calculateProduct(list.head));

	}

}
