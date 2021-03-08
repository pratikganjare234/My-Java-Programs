import java.util.Scanner;
public class SubStractionQuiz
{
public static void main(String args[])
{
final int NOQ=5;
int correctCount=0;
int count=0;

long startTime=System.currentTimeMillis();
String output="";

Scanner input=new Scanner(System.in);

while(count<NOQ)
{
int number1=(int)(Math.random()*10);
int number2=(int)(Math.random()*10);

if(number1<number2)
{
int temp=number1;
number1=number2;
number2=temp;
}

System.out.print("What is"+number1+"-"+number2+"?");
int answer=input.nextInt();

if(number1 - number2==answer)
{
System.out.println("You are Correct");
correctCount++;
}
else
System.out.println("Your answer is wrong"+number1+"-"+number2+"should be"+(number1-number2));
count++;

output+=+number1+"-"+number2+"="+answer+((number1-number2==answer)?"correct":"wrong");
}
long endTime=System.currentTimeMillis();
long testTime=endTime-startTime;

System.out.println("Correct count is"+correctCount+"test time is"+testTime/1000+"seconds"+output);
}
}
