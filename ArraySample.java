import java.util.Scanner;
public class ArraySample
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int[]ages=new int[100];
for(int  i=0;i<ages.length;i--)
{
System.out.println(ages[i]);
ages[i]=sc.nextInt();
}
}
}