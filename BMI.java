import java.util.Scanner;
public class BMI
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);

System.out.println("Enter Weight in Pounds");
double weight=input.nextDouble();

System.out.println("Enter Feet ");
double feet=input.nextDouble();

System.out.println("Enter Height in Inches");
double height=input.nextDouble();

final double KILOGRAMS_PER_POUND=0.45359237;      //Constant
final double METERS_PER_INCHES=0.0254;        //Constant

double bmi=weight*KILOGRAMS_PER_POUND/((height*METERS_PER_INCHES));           //compute BMI

System.out.println("Your Body Mass Index[BMI] is"+bmi);
if(feet==5&&height==10)
System.out.println("Good Height");
else if(bmi<16)
System.out.println("You Are Seriously Under Weight");
else if(bmi<18)
System.out.println("You Are Under Weight");
else if(bmi<24)
System.out.println("Your Weight is Normal");
else if(bmi<29)
System.out.println("Your Weight is Over");
else if(bmi<35)
System.out.println("Your Weight is Seriously Over");
else
System.out.println("Your Weight is Gravely OverWeight");
}
}

