package infixToPostfix;

import java.util.Stack;

public class MaximumInStack {
	
	
	
	Stack<Integer>stack1=new Stack<Integer>();
	Stack<Integer>stack2=new Stack<Integer>();
	
	
	public void push(int data)
	{
		if(stack1.isEmpty())
		{
			stack1.push(data);
			stack2.push(data);
		}
		else
		{
			int temp=stack2.peek();
			int max=Math.max(temp, data);
			stack1.push(data);
			stack2.push(max);
		}
		System.out.println(data+" is Pushed ");
	}
	
	public int getMax()
	{
		return stack2.peek();
	}
	

	public int pop()
	{
		if(!stack1.isEmpty())
		{
			stack2.pop();
			return stack1.pop();
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		
		MaximumInStack max=new MaximumInStack();
		
		max.push(10);
		max.push(-3);
		max.push(45);
		max.push(30);
		System.out.println("Max: "+max.getMax());
		max.pop();
		System.out.println("Max: "+max.getMax());
		

	}

	

}
