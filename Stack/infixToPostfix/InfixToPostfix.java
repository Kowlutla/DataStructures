package infixToPostfix;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Expression: ");
		String exp=sc.nextLine();
		String postfix=postFix(exp);
		System.out.println("Infix Expression: "+exp);
		System.out.println("Postfix Expression: "+postfix);
		sc.close();
	}

	private static String postFix(String s) {
		
		
		String postfix=new String("");
		Stack<Character>stack=new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isLetterOrDigit(c))
			{
				postfix=postfix+c;
			}
			else if(c=='(')
			{
				stack.push(c);
			}
			else if(c==')')
			{
				while(!stack.isEmpty() && stack.peek()!='(')
				{
					postfix=postfix+stack.pop();
				}
				if(!stack.isEmpty() && stack.peek()!='(')
				{
					return "Invalid expression";
				}
				else
				{
					stack.pop();
				}
			}
			else
			{
				while(!stack.isEmpty() && prec(c)<=prec(stack.peek()))
//				{
//					if(stack.peek()=='(')
//					{
//						return "Invalid ";
//					}
					postfix=postfix+stack.pop();
//				}
				stack.push(c);
			}
		}
		
		while(!stack.isEmpty())
		{
			if(stack.peek()=='(')
			{
				return "Invalid";
			}
			postfix+=stack.pop();
		}
		
	return postfix;
		
		
	}

	private static int prec(char c) {
		
		
		switch(c)
		{
			case '+':
			case '-':	
				return 1;
			case '*':
			case '/':
				return 2;
			case '^':
				return 3;
			default:
				return -1;
				
		}
	}

}
