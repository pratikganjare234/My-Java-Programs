import java.util.Scanner;
public class GretestAmongThreeUsingMethod
{
public static void main(String args[])
{
Scanner greatest=new Scanner(System.in);
System.out.println("Enter Three Numbers");
int N1=greatest.nextInt();
int N2=greatest.nextInt();
int N3=greatest.nextInt();
Max(N1,N2,N3);
}
public static int Max(int num1,int num2,int num3)
{
int bigNum;
int sum;
if(num1>num2&&num1>num3)
bigNum=num1;
if(num2>num1&&num2>num3)
bigNum=num2;
else
bigNum=num3;
System.out.println("The Max Between Three is "+bigNum);
sum=num1+num2+num3;
System.out.println("The Addition Among These Three Number Is : "+sum);
if(sum>500)
{
System.out.println("Limit Cross");
}
else
{
System.out.println("Enjoy !!!!!");
}
for(int i=sum;i>sum;i++)
{
System.out.println("?");
}
return bigNum;
}
}


