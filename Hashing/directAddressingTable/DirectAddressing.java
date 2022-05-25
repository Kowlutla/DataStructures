package directAddressingTable;

import java.util.Scanner;

public class DirectAddressing {
	
	private String array[];
	private static final int DEFAULT_CAPACITY=10;
	
	public DirectAddressing()
	{
		array=new String[DEFAULT_CAPACITY];
	}
	
	public DirectAddressing(int capacity)
	{
		array=new String[capacity];
	}
	
	public void insert(int key,String value)
	{
		array[key]=value;
	}
	
	public void delete(int key)
	{
		array[key]=null;
	}
	
	public String get(int key)
	{
		return array[key];
	}
	
	public void clear()
	{
		int len=array.length;
		array=new String[len];
	}
	
	public void printTable()
	{
		System.out.println("Addressing Table: ");
		for(int i=0;i<array.length;i++)
		{
			if(array[i]!=null)
			{
				System.out.println("Key: "+i+"\t"+"Value: "+array[i]);
			}
		}
	}
	
	
	public static void main(String args[])
	{  

        Scanner scan = new Scanner(System.in);

        System.out.println("Direct Addressing Table Test\n\n");
        /* Make object of DirectAddressingTable */

        DirectAddressing dat = new DirectAddressing();
        
        char c;
        do
        {
        	System.out.println("Direct addressing operations: \n");
        	System.out.println("1.Insert ");
        	System.out.println("2.Delete ");
        	System.out.println("3.Get ");
        	System.out.println("4.Clear table ");
        	
        	int choice=scan.nextInt();
        	switch(choice)
        	{
        		case 1:
        			System.out.print("Enter key : ");
        			int key=scan.nextInt();
        			System.out.print("Enter Value: ");
        			String value=scan.next();
        			dat.insert(key, value);
        			break;
        			
        		case 2:
        			System.out.print("Enter key: ");
        			dat.delete(scan.nextInt());
        			break;
        		case 3: 
        			System.out.print("Enter key: ");
        			System.out.println(dat.get(scan.nextInt()));
        			break;
        		case 4:
        			dat.clear();
        			System.out.println("Direct Addressing table is cleared ");
        			break;
        		default:
        			System.out.println("Invalid Option ");
        			break;
        	}
        	
        	dat.printTable();
            System.out.println("\nDo you want to continue (Type y or n) \n");
        	c=scan.next().charAt(0);
        	
        	
        }while(c=='Y' || c=='y');

 
	}
	

}
