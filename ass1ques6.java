/*Write a Java method for finding the smallest and largest numbers in an array of integers and compare that
  to a java method that would do the same thing.
 */

import java.util.*;
public class ass1ques6 
{

	public static void smlgt(int a[])
	{
		int p=a.length;
		for(int i=0;i<p-1;i++)
		{
			for(int j=0;j<p-1-i;j++)
			{
				if(a[i]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Smallest no. in the array is "+a[0]+" and Largest no. is "+a[p-1]);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
		System.out.println("Enter the element : ");
		a[i]=sc.nextInt();
		}
		smlgt(a);
	}

}
