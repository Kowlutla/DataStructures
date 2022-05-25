package RemoveLoopFromLinkedList;

public class LinkedListDemo {

	public static void main(String[] args)
	{
		LinkedList list=new LinkedList();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
//		list.insert(20);
//		list.insert(90);
//		list.insert(120);
		list.traverse();
		list.head.next.next.next.next.next = list.head.next;
		//list.traverse();
		if(list.findLoop())
		{
			System.out.println("Yes Loop There ");
		}
		else
		{
			System.out.println("NO Loop");
		}
		//System.out.println("Count of Loop: "+list.LoopCount());
		list.removeLoop();
		list.traverse();

	}

}
