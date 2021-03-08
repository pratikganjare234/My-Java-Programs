//First Array Program

import java.util.Scanner;
public class FindLargestNumberInArray
{
public static void main(String args[])
{
final int TN=7;
int[]numbers=new int[TN];                       //create array

Scanner input=new Scanner(System.in);

for(int i=0;i<numbers.length;i++)
{
System.out.println("Enter a Number");
numbers[i]=input.nextInt();                         //input users 
}

int max=numbers[0];
for(int i=0;i<numbers.length;i++)
{
if(numbers[i]>max)
max=numbers[i];
}

int count=0;
for(int i=0;i<numbers.length;i++)
{
if(numbers[i]==max)
count++;
}

String output="The Array is";
for(int i=0;i<numbers.length;i++)
{
output+=numbers[i]+" ";
}

output+="The Largest Numbers is"+max;
output+="The Occurance of largest number is "+count;

System.out.println(output);
}
}