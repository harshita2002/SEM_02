//*
//**
//***
//****
//*****

import java.util.*;
public class Ptrn6
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,i,j;
		System.out.println("Enter the value of a : ");
		a=sc.nextInt();
		for(i=0;i<=a;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
