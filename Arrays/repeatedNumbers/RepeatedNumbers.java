/**
  	Given an array of n elements which contains elements from 0 to n-1, with any of these numbers appearing 
  	any number of times. Find these repeating numbers in O(n) and using only constant memory space.
  	
  	For example, let n be 7 and array be {1, 2, 3, 1, 3, 6, 6}, the answer should be 1, 3 and 6.
 */
package repeatedNumbers;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class RepeatedNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length: ");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter elmenents into array :");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		repeatedNumbers(array,n);
		sc.close();

	}

	private static void repeatedNumbers(int[] array, int n) {
		
		System.out.println("Repeated Numbers: ");
		for(int i=0;i<n;i++)
		{
			if(array[Math.abs(array[i])]>0)
			{
				array[Math.abs(array[i])]=-array[Math.abs(array[i])];
			}
			else
			{
				System.out.println(Math.abs(array[i])+" ");
			}
		}
	}

}
