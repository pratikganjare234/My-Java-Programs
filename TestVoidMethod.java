import java.util.Scanner;
public class TestVoidMethod
{
public static void main(String args[])
{
Scanner st=new Scanner(System.in);
System.out.println("Enter The Score");
int sc=st.nextInt();
printGrade(sc);
}
public static void printGrade(double score)
{
if(score<0||score>0)
{
System.out.println("Invalid Score");
}
if(score>=90.0)
{
System.out.println("A Grade");
}
else if(score>=80.0)
{
System.out.println("B Grade");
}
else if(score>=70.0)
{
System.out.println("C Grade");
}
else if(score>=60.0)
{
System.out.println("D Grade");
}
else
{
System.out.println("Fail");
}
}
}
