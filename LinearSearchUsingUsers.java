import java.util.Scanner;
public class LinearSearchUsingUsers
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Number of Element");
int num=sc.nextInt();

int[]arr=new int[num];
System.out.println("Enter Those"+num+"Element");

for(int i=0;i<num;i++)
arr[i]=sc.nextInt();

System.out.println("Enter the Number Which u Want to Access From This Numbers of elements");
int keyNumber=sc.nextInt();

for(int i=0;i<num;i++)
{
if(arr[i]==keyNumber)
{
System.out.println(keyNumber+"is at index"+(i+1)+".");
}
}
}
}

