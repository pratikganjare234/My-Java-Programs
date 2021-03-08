import java.util.Scanner;
public class Sq
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter A Num");
int sqr=sc.nextInt();
int num=sqr*sqr;
int cube=sqr*sqr*sqr;
System.out.println("Square is"+num+"Cube is"+cube);
}
}