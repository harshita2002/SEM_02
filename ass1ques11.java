import java.util.Scanner;
/*Create a class Point with instance variables x, y to represent co-ordinates of point and instance method
  setPoint(). Write a Java program to find distance between two points using a method 
  findDistance(Point,Point).
*/
class Point
{
	double x;
	double y;
	void setPoint()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the  coordinates : ");
		x=sc.nextDouble();
		y=sc.nextDouble();
	}
	void display()
	{
		System.out.println("x="+x+"  y="+y);
	}
}
public class ass1ques11
{
	public static double findDistance(Point p1,Point p2)
	{
		double d;
		d=Math.sqrt((Math.pow((p1.x-p2.x), 2)+Math.pow((p1.y-p2.y), 2)));
		return d;
	}

	public static void findDistance(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Point p1=new Point();
		Point p2=new Point();
		p1.setPoint();
		p1.display();
		p2.setPoint();
		p2.display();
		System.out.println(findDistance(p1,p2));
	}

}
