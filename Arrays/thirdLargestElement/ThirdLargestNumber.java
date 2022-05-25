/**
Find third largest element in a given array

Objective: Given an array of integers, write an algorithm to find the third largest element in the array.

Int [] a = { 6, 8, 1, 9, 2, 1, 10}
Output: Third largest element - 8

Int [] a = { 6, 8, 1, 9, 2, 1, 10, 10}
Output: Third largest element - 9

Int [] a = {6}
Output: Invalid Input, array size is less than 3
 */
package thirdLargestElement;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class ThirdLargestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size : ");
		int n=sc.nextInt();
		int []array=new int[n];
		System.out.println("Enter elements into array :");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		System.out.println("Original array: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println("\nThird largest number is: ");
		int third_largest=thirdLargest(array,n);
		System.out.println(third_largest);
		
		
		System.out.println("Third Smallest number : ");
		int third_smallest=thirdSmallest(array,n);
		System.out.println(third_smallest);
		sc.close();
		
		
	}

	private static int thirdSmallest(int[] array, int n) {
		
		int first=Integer.MAX_VALUE;
		int second=Integer.MAX_VALUE;
		int third=Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++)
		{
			int current=array[i];
			if(current<first)
			{
				third=second;
				second=first;
				first=current;
			}
			else if(current<second)
			{
				third=second;
				second=current;
			}
			else if(third>current)
			{
				third=current;
			}
		}
		
		System.out.println("First Three Smallest numbers: "+first+"  "+second+" "+third);
		
		return third;
	}

	private static int thirdLargest(int[] array, int n) {
		
		
		if(n<=2)
		{
			return -1;
		}
		
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		int third=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++)
		{
			int current=array[i];
			if(current>first)
			{
				third=second;
				second=first;
				first=current;
			}
			else if(current>second)
			{
				third=second;
				second=current;
			}
			else if(current>third)
			{
				third=current;
			}
		}
		
		System.out.println("First Three largest numbers: "+first+"  "+second+" "+third);
		
		return third;
	}

}
