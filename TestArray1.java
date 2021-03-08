import java.util.Scanner;
public class TestArray1
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number of Element");
n=sc.nextInt();
if(n>5)
{
System.exit(0);
}
double pratik[]=new double[n];
for(int i=0;i<pratik.length;i++)
{
System.out.println("Enter Doubles Values");
pratik[i]=sc.nextDouble();
}
double total=0;
for(int i=0;i<pratik.length;i++)
{
total+=pratik[i];
}
System.out.println("Total is = "+total);
double max=pratik[0];
for(int i=0;i<pratik.length;i++)
{
if(pratik[i]>max)
max=pratik[i];
}
System.out.println("Max is = "+max);
}
}