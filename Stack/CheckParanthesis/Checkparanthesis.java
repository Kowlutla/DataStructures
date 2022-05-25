package CheckParanthesis;

import java.util.Scanner;
import java.util.Stack;

public class Checkparanthesis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of inputs: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print("Enter pattern: "+i);
			String pattern=sc.next();
			String isbalance=isBalanced(pattern);
			System.out.println(pattern+" is balanced: "+isbalance);
		}
		sc.close();
	}

	
//	private static String isBalanced2(String s) {
//		boolean isBalance=false;
//		Stack<Character>stack=new Stack<Character>();
//		for(int i=0;i<s.length();i++)
//		{
//			if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
//			{
//				stack.push(s.charAt(i));
//			}
//			else
//			{
//				if(s.charAt(i)=='}' || s.charAt(i)==']' || s.charAt(i)==')')
//				{
//					stack.pop();
//					isBalance=true;
//				}
//				else
//				{
//					isBalance=false;
//				}
//			}
//		}
//		if(isBalance)
//		{
//			return "Yes";
//		}
//		else
//		{
//			return "No";
//		}
//	}


	//using stack
	private static String isBalanced(String pattern) {
		Stack<Character>stack=new Stack<Character>();
		for(int i=0;i<pattern.length();i++)
		{
			if(pattern.charAt(i)=='(' || pattern.charAt(i)=='{' || pattern.charAt(i)=='[')
			{
				stack.push(pattern.charAt(i));
			}
			else
			{
				if(stack.isEmpty())
				{
					return "No";
				}
				else
				{
					char temp=stack.pop();
					if(pattern.charAt(i)=='}' && temp!='{')
					{
						return "No";
					}
					else if(pattern.charAt(i)==']' && temp!='[')
					{
						return "No";
					}
					else if(pattern.charAt(i)==')' && temp!='(')
					{
						return "No";
					}
				}
			}
		}
		if(stack.isEmpty())
		{
			return "Yes";
		}
		else
		{
			return "No";
		}
	}
	
	
	//Without Using stack
	@SuppressWarnings("unused")
	private static String isBalanced1(String pattern)
	{
		while(pattern.length()!=(pattern=pattern.replaceAll("\\(\\)|\\{\\}|\\[\\]","")).length());
		if(pattern.length()==0)
		{
			return "Yes";
		}
		else
		{
			return "No";
		}
		
	}

}
