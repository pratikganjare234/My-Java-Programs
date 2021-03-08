import java.util.Scanner;
public class GuessNumber
{
public static void main(String args[])
{
int number=(int)(Math.random()*101);

Scanner input=new Scanner(System.in);
System.out.println("Guess a Magic Number Between 0 and 100");

System.out.println("Enter Your Guess");
int guess=input.nextInt();

if(guess==number)
System.out.println("Your Number is magic Number"+number);
else if(guess>number)
System.out.println("Your Guess is to High");
else
System.out.println("Your Guess is to Low");
}
}


