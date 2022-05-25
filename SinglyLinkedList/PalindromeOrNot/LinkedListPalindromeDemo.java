package PalindromeOrNot;

public class LinkedListPalindromeDemo {

	public static void main(String[] args) {
		LinkedListPalindrome list=new LinkedListPalindrome();
		list.insert('d');
		list.insert('a');
		list.insert('b');
		list.insert('c');
		list.insert('d');
		list.insert('d');
		list.insert('c');
		list.insert('b');
		list.insert('a');
		list.insert('d');
		list.traverse();
		System.out.println(list.isPalindrome1());
		
		System.out.println("Count: "+list.getCount(list.head));
	}

}
