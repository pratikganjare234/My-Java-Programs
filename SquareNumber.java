import java.util.Scanner;
public class SquareNumber
{
private static Scanner roy;
public static void main(String args[])
{
int num,sqr;
roy=new Scanner(System.in);
System.out.println("Enter A Number");
num=roy.nextInt();
sqr=num*num;
System.out.println("The Square of the number is"+sqr);
}
}