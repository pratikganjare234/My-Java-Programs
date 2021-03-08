//gretest among three numbers
import java.util.Scanner;
public class GretestAmongThreeNumbers
{
public static void main(String args[])
{
Scanner gt=new Scanner(System.in);
System.out.println("Enter Three Integers");
int a=gt.nextInt();
int b=gt.nextInt();
int c=gt.nextInt();
int d=a+b+c;
if(a>b&&a>c)
{
System.out.println("A is Greter"+a);
}
if(b>a&&b>c)
{
System.out.println("B is Greter"+b);
}
else
{
System.out.println("C is greater"+c);
}
System.out.println("The Addition Among this Three Numbers is="+d);
}
}
