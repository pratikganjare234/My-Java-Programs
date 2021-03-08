/*here is a comment*****/
/*This is also a comment/*more comment*/*/
/*this is comment1//more comment*/
// /*this is a// //comment*/
import java.util.Scanner;
public class PrintDemo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Name of Student");
char name=sc.next().charAt(0);
System.out.println("Enter The Class of Student");
String clas=sc.next();
System.out.println("Enter the Fees of Student");
int fees=sc.nextInt();
System.out.println("Student Information\n"+name+"\n"+clas+"\n"+fees);
}
}
