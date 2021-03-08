import java.util.Scanner;
public class TestMax
{
public static void main(String args[])
{
Scanner mt=new Scanner(System.in);
System.out.println("Enter Two Number");
int a=mt.nextInt();
int b=mt.nextInt();
int k=Max(a,b);
System.out.println("The Maximum Betweeen : "+a+"..and.."+b+"..is.."+k);
}
public static int Max(int num1,int num2)
{
int result;
if(num1>num2)
result=num1;
else
result=num2;
return result;
}
}