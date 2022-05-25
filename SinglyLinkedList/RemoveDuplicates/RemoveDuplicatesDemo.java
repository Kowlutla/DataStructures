package RemoveDuplicates;

public class RemoveDuplicatesDemo {

	public static void main(String[] args) 
	{
		RemoveDuplicates list=new RemoveDuplicates();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(20);
		list.insert(90);
		list.insert(10);
		list.traverse();
		list.removeDuplicates1();
		list.traverse();

	}

}
