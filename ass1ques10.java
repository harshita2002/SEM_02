/* Create a class Student with instance variables name, roll, mark and instance methods setData(), display().
  Write a Java program to create three objects of Student class to input details of three different students
  and display the details. Enclose main() method inside another class StudentDetails. 
  (Use the setter method setData() to input details.)
*/

import java.util.Scanner;
class student
{
	int roll;
	double mark;
	String name;
	void getdata(String n,int r,double m)
	{roll=r;
	name=n;
	mark=m;
	}
	void display()
	{
		System.out.println("Name:- "+name+"\tRoll.No.:-"+roll+"\tMark:-"+mark);
	}
}
public class ass1ques10
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);student ss=new student();
		Scanner s2=new Scanner(System.in);student sss=new student();
		student s1=new student();
		System.out.println("enter the name,roll,mark of the student");
		String n=s2.next();
		int roll=sc.nextInt();
		double mar=sc.nextDouble();
		s1.getdata(n,roll,mar);
		
		System.out.println("enter the name,roll,mark of the student");
		 n=s2.next();
		 roll=sc.nextInt();
		 mar=sc.nextDouble();
		ss.getdata(n,roll,mar);
		
		sss.getdata(n, roll, mar);
		System.out.println("The details of the student are:-");
		s1.display();
		ss.display();
		sss.display();
		
	}

}
