import java.util.Scanner;
public class PrimeNo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter A Number");
int num=sc.nextInt();
boolean flag=false;
for(int i=2;i<=num/2;++i)
{
if(num%i==0)
{
flag=true;
break;
}
}
if(flag)
System.out.println("Prime");
else
System.out.println("Not Prime");
}
}