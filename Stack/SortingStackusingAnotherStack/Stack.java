package SortingStackusingAnotherStack;

public class Stack {

	int maxSize;
	int array[];
	int top;
	public Stack(int maxSize)
	{
		this.maxSize=maxSize;
		array=new int[maxSize];
		top=0;
	}
	
	
	public void push(int data)
	{
		if(top<0 || top>=maxSize)
		{
			System.out.println("Stack has not enough Memory... Can not push "+data);
		}
		else
		{
			array[top]=data;
			top++;
		}
	}
	
	public int pop()
	{
		if(top<0)
		{
			System.out.println("Stack underFlow.... Can't pop");
			return 0;
		}
		int value=array[top-1];
		top=top-1;
		array[top]=0;
		return value;
	}
	
	public int peek()
	{
		if(top<0 )
		{
			System.out.println("Stack underFlow.... Can't peek");
			return 0;
		}
		return array[top-1];
	}
	
	public boolean isEmpty()
	{
		return top==0;
	}
	
	public boolean isFull()
	{
		return top==maxSize;
	}
	public  Stack sort()
	{
		Stack temp=new Stack(maxSize);
		while(!this.isEmpty())
		{
			int current_data=this.pop();
			while(!temp.isEmpty()&&temp.peek()<current_data)
			{
				this.push(temp.pop());
			}
			temp.push(current_data);
			
		}
		return temp;
	}
	
	
	public void show()
	{
		for(int i=0;i<top;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
}
