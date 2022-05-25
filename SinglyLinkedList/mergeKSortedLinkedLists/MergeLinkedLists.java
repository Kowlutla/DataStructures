/**
  	Objective: Given, K sorted linked list, Write an algorithm to merge all the linked list into
  	one linked list which will be also be sorted.
  	
  	Example:
  	--------
  		List 1: -->1-->5
	List 2: -->4-->8
	List 3: -->4-->6-->9
	List 4: -->2-->7-->10
	Merged Linked List: 
	-->1-->2-->4-->4-->5-->6-->7-->8-->9-->10
 */
package mergeKSortedLinkedLists;
import java.util.Comparator;
import java.util.PriorityQueue;

import mergeKSortedLinkedLists.LinkedList.Node;

/**
 * @author apiiit-rkv
 *
 */
public class MergeLinkedLists {

	public static void main(String[] args) {
		
		LinkedList list1=new LinkedList();
		list1.addNode(1);
		list1.addNode(5);
		
		LinkedList list2=new LinkedList();
		list2.addNode(4);
		list2.addNode(8);
		
		LinkedList list3=new LinkedList();
		list3.addNode(4);
		list3.addNode(6);
		list3.addNode(9);
		
		LinkedList list4=new LinkedList();
		list4.addNode(2);
		list4.addNode(7);
		list4.addNode(10);
		
		
		
		System.out.println("List 1: ");
		list1.printList();
		
		System.out.println("List 2: ");
		list2.printList();
		
		System.out.println("List 3: ");
		list3.printList();
		
		System.out.println("List 4: ");
		list4.printList();
		
		
		Node array[]=new Node[] {list1.head,list2.head,list3.head,list4.head};
		
		merge(array);
		
		System.out.println("After merging lists; ");
		list4.printList();
		
		
		
		

	}

	private static Node merge(Node[] array) {
		
		Node result_head=null;
		Node current=null;
		
		PriorityQueue<Node>pq=new PriorityQueue<Node>(new Comparator<Node>()
				{

					@Override
					public int compare(Node o1, Node o2) {
						if(o1.data>o2.data)
						{
							return 1;
						}
						else
						{
							return -1;
						}
					}
					
				});
		
				for(int i=0;i<array.length;i++)
				{
					if(array[i]!=null)
					{
						pq.offer(array[i]);
					}
				}
				
				while(!pq.isEmpty())
				{
					Node node=pq.poll();
					if(result_head==null)
					{
						result_head=node;
						current=node;
					}
					else
					{
						current.next=node;
						current=current.next;
					}
					
					if(node.next!=null)
					{
						pq.add(node.next);
					}
				}
				
				return result_head;
		
	}

}
