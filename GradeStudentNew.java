import java.util.Scanner;
public class GradeStudentNew
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("\nEnter the name of Student\n");
String name=sc.nextLine();
System.out.println("\nEnter Roll Number\n");
int roll=sc.nextInt();
System.out.println("\nEnter Marks\n");
int mark=sc.nextInt();
int best=90;
int good=70;
int worst=55;
if(mark>=best)
{
System.out.println("Grade A+");
}
else if(mark>good)
{
System.out.println("Grade A");
}
else if(mark>worst)
{
System.out.println("Grade B");
}
else if(mark<worst)
{
System.out.println("Grade C");
}
}
}

