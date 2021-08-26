import java.util.*;
public class Ptrn 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,sum=0,p=1,a;
		System.out.println("Enter the value of a : ");
		a=sc.nextInt();
		for( i=1;i<=a;++i)
		{
			for(int j=1;j<=a-i;++j)
			{
				System.out.print(" ");
			}
			System.out.println(i*p);
			p=p*10+1;
			p=p*10+1;
		}
	}

}
