import java.util.Scanner;

//*****
//****
//***
//**
//*


public class Ptrn7 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=5,i,j;
		System.out.println("Enter the value of a : ");
		a=sc.nextInt();
		for( i=a;i>=1;i--)
		{
			for( j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
