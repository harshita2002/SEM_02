//    1
//   212
//  32123
// 4321234
//543212345


import java.util.Scanner;

public class Ptrn2 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,j,a;
		String s1="",s2="";
		System.out.println("Enter the value of a : ");
		a=sc.nextInt();
		for(i=1;i<=a;++i)
		{
			for(j=1;j<=a-i;++j)
			{
				System.out.print(" ");
			}
			s1=i+s1;
			if(i>1)
			{
				s2=s2+i;
			}
			System.out.println(s1+s2);
		}
	}
}
