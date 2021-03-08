import java.util.Scanner;
public class StudentInf
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Name of Student");
int name=sc.nextInt();
System.out.println("Enter The Class of Student");
int clas=sc.nextInt();
System.out.println("Enter the Fees of Student");
int fees=sc.nextInt();
System.out.println("Student Information/n"+name+"/n"+clas+"/n"+fees);
}
}
