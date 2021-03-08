//leap year java program
import java.util.Scanner;
public class LeapYear
{
public static void main(String args[])
{
Scanner LeapInput=new Scanner(System.in);
System.out.println("Enter Year");
int year=LeapInput.nextInt();
boolean isLeapYear=(year%4==0 && year%100!=0)||(year%400==0);
System.out.println(year+"is leap year?"+isLeapYear);
}
}