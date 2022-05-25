
//Find two non-repeating numbers in an array in O(n) time and O(1) space

//int [] arrA = {4,5,4,5,3,2,9,3,9,8};
//Output: 2 and 8

package repeatedNumbers;

import java.util.Scanner;

public class TwoNonRepeatedNumbers {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length: ");
		int n = sc.nextInt();
		int array[] = new int[n];
		System.out.println("Enter elmenents into array :");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		nonRepeatedNumbers(array, n);
		sc.close();
	}

	private static void nonRepeatedNumbers(int[] array, int n) {
		
		int xor=array[0];
		for(int i=1;i<n;i++)
		{
			xor=xor^array[i];
		}
		
		int right_set_bit=xor&~(xor-1);
		
		int a=0;int b=0;
		for(int i=0;i<n;i++)
		{
			int current=array[i];
			if((current&right_set_bit)==0)
			{
				a=a^current;
			}
			else
			{
				b=b^current;
			}
		}
		
		System.out.println("Non repeated numbers: "+a+" and "+b);
		
	}
}
