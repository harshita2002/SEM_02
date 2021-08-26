//with using space
//* * * * *
// * * * *
//  * * *
//   * *
//    *

import java.util.Scanner;

public class Ptrn4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i,j,a;
		String s="";
		System.out.println("Enter the value of a : ");
		a=sc.nextInt();
		for(i=1;i<=a;i++)
		{
			System.out.print(s);
			for(j=i;j<=a;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			s=s+" ";
		}
	}
}
