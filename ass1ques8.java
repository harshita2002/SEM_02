/*Write a Java program that takes two arrays a and b of length n storing int values, and returns the dot product
 of a and b. That is, it returns an array c of length n such that c[i] = a[i] · b[i], for i = 0, . . . , n − 1.
 */

import java.util.*;
public class ass1ques8
{
	public static int[] dotprod(int a1[],int a2[])
	{
		int p1=a1.length;
		int p2=a2.length;
		int res[]=new int[p1];
		for(int i=0;i<p1;i++)
		{
			
				res[i]=a1[i]*a2[i];
				
			
		}
		return res;
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter the size of 1st array : ");//1st array input
		n1=sc.nextInt();
		int a1[]=new int[n1];
		for(int i=0;i<a1.length;i++)
		{
		System.out.println("Enter the element : ");
		a1[i]=sc.nextInt();
		}
		System.out.println("Enter the size of 2nd array : ");//2nd array input
		n2=sc.nextInt();
		int a2[]=new int[n2];
		for(int j=0;j<a2.length;j++)
		{
		System.out.println("Enter the element : ");
		a2[j]=sc.nextInt();
		}
		int aa[]=dotprod(a1,a2);
		for(int i=0;i<aa.length;i++)
		{
			System.out.print(aa[i]+" ");
		}
	}

}
