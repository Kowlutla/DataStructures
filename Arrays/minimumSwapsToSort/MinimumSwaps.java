package minimumSwapsToSort;

import java.util.Scanner;

//Given an array of integer of size n containing from 1 to n.
//find the minimum no of swaps required to sort array

public class MinimumSwaps {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter lenght of array: ");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter elements into array: ");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		int count=minSwap(array,n);
		System.out.println("Minimum swaps to sort array: "+count);
		sc.close();
	}

	
//	private static int minSwaps1(int array[],int n)
//	{
//		boolean visited[]=new boolean[n];
//		int swap=0;
//		for(int i=0;i<n;i++)
//		{
//			int cycle=0,j=i;
//			while(!visited[j])
//			{
//				visited[j]=true;
//				j=array[j]-1;
//				cycle++;
//			}
//			if(cycle!=0)
//			{
//				swap=swap+cycle-1;
//			}
//			
//		}
//		return swap;
//	}
	
	
//	
//	private static int minSwaps(int[] array, int n) {
//	
//		int count=0;
//		for(int i=0;i<n-2;i++)
//		{
//			for(int j=0;j<n-i-1;j++)
//			{
//				if(array[j]>array[j+1])
//				{
//					count++;
//					int temp=array[j];
//					array[j]=array[j+1];
//					array[j+1]=temp;
//							
//				}
//			}
//		}
//		return count;
//	}
//	
	private static int minSwap(int array[],int n)
	{
		boolean isvisited[]=new boolean[n];
		int swaps=0;
		for(int i=0;i<n;i++)
		{
			int cycle=0,j=i;
			while(!isvisited[j])
			{
				isvisited[j]=true;
				cycle++;
				j=array[j]-1;
				
			}
			
			if(cycle!=0)
			{
				swaps+=cycle-1;
			}
		}
		return swaps;
	}
	

}
