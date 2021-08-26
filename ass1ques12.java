/*Write a Java class Flower that has three instance variables of type String, int, and float, which respectively
  represent the name of the flower, its number of petals, and price. Your class must include a method that 
  initializes each variable to an appropriate value, and your class should include methods for setting the value
  of each type, and getting the value of each type.
*/

import java.util.Scanner;
 class flower
{
	String name;
	int nopetal;
	float price;
	Scanner sc=new Scanner(System.in);
	void setData()
	{
		System.out.println("Enter the name of flower : ");
		name=sc.next();
		System.out.println("Enter the no. of petals : ");
		nopetal=sc.nextInt();
		System.out.println("Enter the price : ");
		price=sc.nextInt();
	}
	void display()
	{
		System.out.println("Name : "+name+" Number of petals: "+nopetal+" Price: "+price);
	}
}

public class ass1ques12 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		flower f1=new flower();
		f1.setData();
		f1.display();
	}

}
