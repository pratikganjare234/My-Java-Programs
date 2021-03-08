import java.util.Scanner;
public class ReverseAString
{
public static void main(String args[])
{
String reverse="";
Scanner input=new Scanner(System.in);
System.out.println("Enter a String");
String orignal=input.nextLine();
int length=orignal.length();
for(int i=length-1;i>=0;i--)
{
reverse=reverse+orignal.charAt(i);
}
System.out.println("Reverse a String"+reverse);
}
}