public class MethodOverLoading
{
public static void main(String args[])
{
System.out.println("The Maximum Between Two Int Numbers 3 and 4 is"+Max(3,4));
System.out.println("The Maximum Between Two Float Numbers 2.0 and 3.0 is"+Max(2.0,3.0));
System.out.println("The Maximum Between Three Double Numbers 3.4,4.5 and 3.5 is"+Max(3.4,4.5,3.5));
}
public static int Max(int a1,int a2)
{
if(a1>a2)
return a1;
else 
return a2;
}
public static double Max(double a1,double a2)
{
if(a1>a2)
return a1;
else 
return a2;
}
public static double Max(double a1,double a2,double a3)
{
return Max(a1,a2,a3);
}
}



