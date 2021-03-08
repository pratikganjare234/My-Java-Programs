import java.util.Scanner;
public class FindAsciiValue
{
public static void main(String args[])
{
Scanner st=new Scanner(System.in);
System.out.println("Enter Charecter");
char ch=st.next().charAt(0);
int ascii=ch;
int castAscii=(int)ch;
System.out.println("The Ascii Value of"+ch+"is"+ascii);
System.out.println("The Ascii value of"+ch+"is"+castAscii);
}
}