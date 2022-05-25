package DynamicStack;

import java.util.Scanner;

public class DynamicStackDemo 
{
	public static void main(String[] args) 
	{

		Dstack stack=new Dstack();
		Scanner sc=new Scanner(System.in);
		boolean doagain=true;
		while(doagain)
		{
			System.out.println("----------------------------------------");
			System.out.println("Select which operation want to Perfoem:");
			System.out.println("1.Push\n2.Pop\n3.Peep\n4.Size\n5.isEmpty\n6.Show\n");
			System.out.println("Operation Number: ");
			int option=sc.nextInt();
			switch(option)
			{
				case 1:
				{
					System.out.print("Enter data: ");
					int data=sc.nextInt();
					stack.push(data);
					break;
				}
				case 2:
				{
					stack.pop();
					break;
				}
				case 3:
				{
					stack.peep();
					break;
				}
				case 4:
				{
					System.out.println("Size of Stack "+stack.size());
					break;
				}
				case 5:
				{
					System.out.println("Is Stack Empty: "+stack.isEmpty());
					break;
				}
				case 6:
				{
					stack.show();
					break;
				}
				default:
				{
					System.out.println("Invalid Entry");
					break;
				}
			}
			System.out.print("1.Continue\n2.Exit\n");
			System.out.println("Enter your Choice: ");
			int choice=sc.nextInt();
			if(choice==1)
			{
				doagain=true;
			}
			else
			{
				doagain=false;
			}
		}
		
		System.out.println("--- THANK YOU ... VISIT AGAIN------");	
		sc.close();
	}
}
