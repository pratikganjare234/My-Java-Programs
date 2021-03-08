import java.util.Scanner;
public class SwapUsingMethod
{
public static void main(String args[])
{
Scanner swap=new Scanner(System.in);
System.out.println("Enter Two Numbers");
int N1=swap.nextInt();
int N2=swap.nextInt();
SwapNumber(N1,N2);
}
public static int SwapNumber(int num1,int num2)
{
int swapNum=Num1;
num1=num2;
num2=swapNum;
}
}


