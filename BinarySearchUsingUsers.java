import java.util.Scanner;
public class BinarySearchUsingUsers
{
public static void main(String args[])
{
int low=0;
int high=arr.length-1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Number of Element");
int num=sc.nextInt();

int[]arr=new int[num];
System.out.println("Enter Those"+num+"Element");

for(int mid=0;mid<num;mid++)
arr[mid]=sc.nextInt();

System.out.println("Enter the Number Which u Want to Access From This Numbers of elements");
int keyNumber=sc.nextInt();

while(high>=low)
{
int mid=(low+high)/2;
if(keyNumber<arr[mid])
high=mid-1;
else if(keyNumber==arr[mid])
return mid;
else
low=mid+1;
}
return -low-1;
}
System.out.println(keyNumber+"is found at"+(mid+1)+".");
}


