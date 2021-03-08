//three ways to reverse a string in java 
//using 1 : Using Loop   2: Using stringBuffer   3 : Using Recursion 
//Wap In java to reverse a string loop
//Declare empty string reverse.
public class ReverseString
{
public static void main(String args[])
{
String Name="Pratik";
String reverse=" ";
for(int i=Name.length()-1;i>=0;i--)
{
reverse=reverse+Name.charAt(i);
}
}
}
