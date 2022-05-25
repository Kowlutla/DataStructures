package StackUsingLinkedList;

public class LinkedListEmptyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;
	public LinkedListEmptyException(String msg)
	{
		this.msg=msg;
	}
	
	public String toSting()
	{
		return "underflow....";
	}
}
