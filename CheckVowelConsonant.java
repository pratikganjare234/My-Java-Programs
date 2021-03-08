//Wap to check whether the charecter is vowel or consonant
import java.util.Scanner;
class CheckVowelConsonant
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter A Charecter");
char ch=sc.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
System.out.println("The Charecter is Vowel"+ch);
}
else
{
System.out.println("The Charecter is Consonant"+ch);
}
}
}