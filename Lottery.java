import java.util.Scanner;
public class BMI
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);

System.out.println("Enter Weight in Pounds");
double weight=input.nextDouble();

System.out.println("Enter Height in Inches");
double height=input.nextDouble();

final double KILOGRAMS_PER_POUND=0.45359237;      //Constant
final doble METERS_PER_INCHES=0.0254;        //Constant

double bmi=weight*KILOGRAMS_PER_POUND/((height*METERS_PER_INCHES));           //compute BMI

System.out.println("Your Body Mass Index[BMI] is"+bmi);
if(bmi<16)


