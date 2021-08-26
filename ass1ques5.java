/* Write  a Java method, isOdd, that takes an int i and returns true if and only if i is odd. Your method can't
   use the multiplication, modulus, or division operators, however.
*/

import java.util.*;
public class ass1ques5 
{	public static boolean isOdd(int n)
	{
	int p=n;
	for(int i=p;p>1;i--)
	{
		p-=2;
	}
	if(p==1)
		return true;
	else
		return false;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be checked :");
		int n=sc.nextInt();
		System.out.println(isOdd(n));
	}

}
