import java.util.Scanner;

class node
	{
	node next;
	int n;
	}


public class stack_01 
{
 public static node stacks=new node();
 
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		stacks=null;
		while(true)
		{
			System.out.println("Enter 1 for pushing"
					+ "\nEnter 2 to pop"
					+ "\nEnter 3 for displaying"
					+ "\nEnter 4 if you want to exit the programme");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:push();break;
			case 2:pop();break;
			case 3:disp();break;
			case 4:return;
			}
		}
	}
	public static void push()
	{
		node temp=new node();
		Scanner sc1=new Scanner (System.in);
		System.out.println("Enter the number ");
		temp.n=sc1.nextInt();
		if(stacks==null)
		{
			temp.next=null;
		}
		else
		{
		temp.next=stacks;
		}
		stacks=temp;
		System.out.println("Added");
	}
	public static void pop()
	{
		if(stacks==null)
		{
			System.out.println("Already empty stack");
			return;
		}
		stacks=stacks.next;
		System.out.println("Deleted");
	}
	public static void disp()
	{
		if(stacks==null)
		{
			System.out.println("Already empty stack");
			return;
		}
		node temp=new node();
		temp=stacks;
		while(temp!=null)
		{
			System.out.println(temp.n);
			temp=temp.next;
		}
	}

}
