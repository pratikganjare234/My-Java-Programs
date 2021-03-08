public class TestPassObject
{
public static void main(String args[])
{
Circle3 myCircle=new Circle3(5.0);
printCircle(myCircle);
}
public static void printCircle(Circle3 c)
{
System.out.println("The Area of the Circle of Radius"+c.getRadius()+"is"+c.getArea());
}
}