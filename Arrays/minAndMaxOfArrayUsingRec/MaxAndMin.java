package minAndMaxOfArrayUsingRec;

import java.util.Scanner;

public class MaxAndMin {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of array: ");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter element into array: ");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		System.out.println("Array: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println("\nMax Element: "+maxi(array,n));
		System.out.println("\nMin Element: "+mini(array,n));
		sc.close();
	}

	private static int mini(int[] array, int n) {
	
		if(n==1)
		{
			return array[n-1];
		}
		return Math.min(array[n-1], mini(array,n-1));
	}

	private static int maxi(int[] array, int n) {
		
		if(n==1)
		{
			return array[n-1];
		}
		return Math.max(array[n-1], maxi(array,n-1));
	}

}
