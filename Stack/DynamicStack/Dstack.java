package DynamicStack;

public class Dstack
{

	int capacity=2;
	int[] stack=new int[capacity];
	int top=0;
	public void push(int data)
	{
		if(size()==capacity)
			expand();
		stack[top]=data;
		top++;
	
	}
	private void expand() 
	{
		int length=size();
		int newStack[]=new int[capacity*2];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack=newStack;
		capacity=capacity*2;
		
	}
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
		}
		
		else
		{
			int data=stack[top-1];
			top--;
			stack[top]=0;
			shrink();
			System.out.println("Popped Value is : "+data);
		}
	}
	private void shrink() 
	{
		int length=size();
		if(length<=(capacity/2)/2)
		{
			capacity=capacity/2;
		}
		int newStack[]=new int[capacity];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack=newStack;
		
	}
	public void peep()
	{
		if(size()==0)
		{
			System.out.println("No elements to peep");
		}
		else
		{
			System.out.println( "Peeped Value is" +stack[top-1]);
		}
	}
	public int size()
	{
		return top;
	}
	public boolean isEmpty()
	{
		if(top==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void show()
	{
		for(int n:stack)
		{
			System.out.print(n+" ");
		}
		System.out.println();
	}
}
