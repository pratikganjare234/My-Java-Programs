import java.util.Scanner;
public class FindGcd
{
public static void main(String args[])
{
Scanner op=new Scanner(System.in);
System.out.println("Enter Two Numbers");
int n1=op.nextInt();
int n2=op.nextInt();
System.out.println("GCD for"+n1+"and"+n2+"is"+gcd(n1,n2));
}
public static int gcd(int n1,int n2)
{
int gcd=1;
for(int k=2;k<=1 && k<=n2;k++)
{
if(n1%k==0 && n2%k==0)
gcd=k;
}
return gcd;
}
}
