/*  Write a Java program that takes all the lines input to standard input and writes them to standard output 
 	in reverse order. That is, each line is output in the correct order, but the ordering of the lines is
  	reversed.
*/

import java.util.*;
public class ass1ques4 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the no. of line ");
		n=sc.nextInt();
		String s[]=new String [n];
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the line :");
			s[i]=sc.nextLine();
		}
		for(int i=n-1;i>=0;i--)
		{
			System.out.println(s[i]);
		}
	}

}
