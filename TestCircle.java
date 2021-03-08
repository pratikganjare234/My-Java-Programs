//Object Programming
public class TestCircle
{
public static void main(String args[])
{

Circle1 myCircle=new Circle1(5.0);            //Creating Object1
System.out.println("The Area of the circle of radius"+myCircle.radius+"is"+myCircle.getArea());

         
Circle1 yourCircle=new Circle1();              //Creating Object2
System.out.println("The Area of the circle of radius"+yourCircle.radius+"is"+yourCircle.getArea());

yourCircle.radius=100;
System.out.println("The Area of the Circle of radius"+yourCircle.radius+"is"+yourCircle.getArea());

}
}
class Circle1
{
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
