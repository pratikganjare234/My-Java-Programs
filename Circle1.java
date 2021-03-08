public class Circle1
{
public static void main(String args[])
{
Circle1 myCircle=new Circle1(5.0);
System.out.println("The Area of the circle of Radius"+mycircle.radius+"is"+myCircle.getArea());

Circle1 yourCircle=new Circle1();
System.out.println("The Area of the Circle of the Radius"+yourCircle.radius+"is"+yourCircle.getArea());

yourCircle.radius=100;
System.out.println("The area of the circle of radius"+yourCircle.radius+"is"+yourCircle.getArea());

double radius;

Circle1()
{
radius=1.0;
}

Circle1(double newRadius)
{
radius=newRadius;
}

double getArea()
{
return radius*radius*Math.PI;
}
}
}




