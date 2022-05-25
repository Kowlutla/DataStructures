/**
 * 
 */
package printAllSubArrays;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class PrintAllSubArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size: ");
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
		allSubArrays(array,n);
		sc.close();

	}

	private static void allSubArrays(int[] array, int n) {
		
		System.out.println("\nAll Sub Arrays:");
		
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				for(int k=i;k<j;k++)
				{
					System.out.print(array[k]+" ");
				}
				System.out.println();
			}
		}
		
	}

}
