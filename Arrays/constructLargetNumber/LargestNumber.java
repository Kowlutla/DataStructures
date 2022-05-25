/**
Construct the largest number from the given array.

Objective: Given an array of integers, write an algorithm to construct the largest number possible by appending the array elements. 

 Given Input: [7, 78]
Largest Number Possible: 787
Explanation: two possibilities are 778 and 787. 787 is larger than 778.

Given Input: [25, 42, 39]
Largest Number Possible: 423925
 */
package constructLargetNumber;

import java.util.ArrayList;
import java.util.*;
/**
 * @author apiiit-rkv
 *
 */
public class LargestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of array :");
		int n=sc.nextInt();
		ArrayList<Integer>list=new ArrayList<Integer>(n);
		System.out.println("Enter elements : ");
		for(int i=1;i<=n;i++)
		{
			list.add(sc.nextInt());
		}
		
		largestNumber(list);
		sc.close();
	}

	private static void largestNumber(ArrayList<Integer> list) {
		
		String result="";
		
		Collections.sort(list,new Comparator<Integer>()
				{
					public int compare(Integer a,Integer b)
					{
						String ab=""+a+b;
						String ba=""+b+a;
						
						if(ab.compareTo(ba)<0)
						{
							return 1;
						}
						else
						{
							return -1;
						}
					}
				});
		
		for(int i=0;i<list.size();i++)
		{
			result=result+list.get(i);
		}
		
		System.out.println(result);
		
	}

}
