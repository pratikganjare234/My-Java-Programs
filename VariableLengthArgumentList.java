//variable length argument list

public class VariableLengthArgumentList
{
public static void main(String args[])
{
printMax(34,3,3,2,56.5);
printMax(new double[]{1,2,3});
}
public static void printMax(double...number)
{
if(number.length==0)
{
System.out.println("No argument passed");
return;
}
double result=number[0];
for(int i=1;i<number.length;i++)
if(number[i]>result)
result=number[i];
System.out.println("The max value is"+result);
}
}