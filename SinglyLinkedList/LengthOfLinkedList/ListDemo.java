package LengthOfLinkedList;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list.push(10);
		list.push(20);
		list.push(30);
		list.push(4);
		list.traverse();
		System.out.println("Length of List: "+list.getLength1());
	}

}

