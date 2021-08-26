import java.util.Scanner;

//star without space
//*****
// ***
//  *
public class Ptrn3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i,j,a;
		String s="";
		System.out.println("Enter the value of a : ");
		a=sc.nextInt();
		for(i=a;i>=1;i=i-2)
		{
			System.out.print(s);
			for(j=a;j>a-i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
			s=s+" ";
		}
	}
}
