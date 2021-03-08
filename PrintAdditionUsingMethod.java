import java.util.Scanner;
public class PrintAdditionUsingMethod
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("\nEnter Name\n");
String name=sc.nextLine();
System.out.println("\nEnter Two Number\n");
int num1=sc.nextInt();
int num2=sc.nextInt();
int k=Sum(num1,num2);
}
public static int Sum(int x,int y)
{
int z=x+y;
System.out.println("Addition is"+z);
return 0;
}
}


