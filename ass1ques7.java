/*Write a  Java method that takes an array of int values and determines if there is a pair of distinct
  elements of the array whose product is odd
 */

import java.util.*;
public class ass1ques7
{
	public static void oddprod(int a[])
	{
		int p=a.length;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				p=a[i]*a[j];
				if(p%2!=0)
				{
					System.out.println("product of"+a[i]+"and"+a[j]+" is odd");
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the size of array : ");
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
		System.out.println("Enter the element : ");
		a[i]=sc.nextInt();
		}
		oddprod(a);
	}

}
