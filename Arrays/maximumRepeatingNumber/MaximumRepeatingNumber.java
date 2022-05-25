/**
  	Given an array of size n, the array contains numbers in range from 0 to k-1 where k is a 
  	positive integer and k <= n. Find the maximum repeating number in this array. For example, 
  	let k be 10 the given array be arr[] = {1, 2, 2, 2, 0, 2, 0, 2, 3, 8, 0, 9, 2, 3}, the maximum repeating
  	number would be 2. Expected time complexity is O(n) and extra space allowed is O(1). 
  	Modifications to array are allowed. 
 */
package maximumRepeatingNumber;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class MaximumRepeatingNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length: ");
		int n=sc.nextInt();
		System.out.print("Enter max element in array :");
		int k=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter elmenents into array :");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		int max_repeating_number=getMaxRepeatingNumber1(array,n,k);
		System.out.println("Maximum repeating number: "+max_repeating_number);
		max_repeating_number=getMaxRepeatingNumber2(array,n,k);
		System.out.println("Maximum repeating number: "+max_repeating_number);
		sc.close();

	}

	//Time complexity: O(n) Space complexity:O(k)
	private static int getMaxRepeatingNumber1(int[] array,int n,int k) {
		
		int count[]=new int[k+1];
		for(int i=0;i<n;i++)
		{
			count[array[i]]++;
		}
		int max=0,index=0;;
		for(int i=0;i<=k;i++)
		{
			if(count[i]>max)
			{
				max=count[i];
				index=i;
			}
		}
		return index;
		
	}
	
	private static int getMaxRepeatingNumber2(int array[],int n,int k)
	{
		for(int i=0;i<n;i++)
		{
			array[array[i]%k]=array[array[i]%k]+k;
		}
		
		int max=Integer.MIN_VALUE;
		int index=0;
		for(int i=0;i<n;i++)
		{
			if(array[i]>max)
			{
				index=i;
				max=array[i];
			}
		}
		return index;
		
	}

}
