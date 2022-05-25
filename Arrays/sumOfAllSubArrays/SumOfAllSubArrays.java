/**
 Sum of all sub arrays in O(n) Time

 Objec­tive:  Given an array write an algorithm to find the sum of all the possible sub arrays.
 
 
	 int [] a = {1, 2, 3};
	
	Output: Possible sub arrays –
	{1}, {2}, {3}, {1, 2} , {2, 3}, {1, 2, 3}
	So sum = 1+ 2+ 3 + 3 + 5 + 6 = 20
 */
package sumOfAllSubArrays;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class SumOfAllSubArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array Size: ");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter elements into array: ");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		int sum=method1(array,n);
		System.out.println("Sum : "+sum);
		sum=method2(array,n);
		System.out.println("Sum : "+sum);
		sc.close();
	}

	
	//Time complexity:O(n^3)
	private static int method1(int[] array, int n) {
		
		int sum=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				for(int k=i;k<j;k++)
				{
					sum+=array[k];
				}
			}
		}
		return sum;
	}

	//time complexity:O(n)
	private static int method2(int array[],int n)
	{
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+array[i]*(n-i)*(i+1);
		}
		return sum;
	}
}
