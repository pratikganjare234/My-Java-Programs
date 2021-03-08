import java.util.Scanner;
public class PrintCalender
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);

System.out.print("Enter Full Year(e.g.2001):");
int year=input.nextInt();

System.out.print("Enter Month in Number Between 1 and 12:");
int month=input.nextInt();

printMonth(year,month);
}

static void printMonth(int year,int month)
{
printMonthTitle(year,month);
printMonthBody(year,month);
}

static void printMonthTitle(int year,int month)
{
System.out.println("      "+getMonthName(month)+" "+year);
System.out.println("---------------------------");
System.out.println("Sun Mon Tue Wed Thu Fri Sat");
}

static String getMonthName(int month)
{
String monthName=null;
switch(month)
{
case 1:monthName="January";
break;
case 2:monthName="February";
break;
case 3:monthName="March";
break;
case 4:monthName="April";
break;
case 5:monthName="May";
break;
case 6:monthName="June";
break;
case 7:monthName="July";
break;
case 8:monthName="August";
break;
case 9:monthName="September";
break;
case 10:monthName="October";
break;
case 11:monthName="November;
break;
case 12:monthName="December;
}
return monthName;
}

static void printMonthBody(int year,int month)