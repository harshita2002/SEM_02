//123454321
// 2345432
//  34543
//   454
//    5
import java.util.Scanner;

public class Ptrn5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i,j,a;
		
		System.out.println("Enter the value of a : ");
		a=sc.nextInt();
		for(i=1;i>=a;i++)
		{
			for(j=1;j<a;j++)
			{
				if(i==j || i+j>=a-1)
				{
				System.out.print(i);
				}
				
			}
			System.out.println();
			
		}
	}
}
