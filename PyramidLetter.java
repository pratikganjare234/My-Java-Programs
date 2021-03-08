public class PyramidLetter
{
public static void main(String args[])
{
String s=new String("SGBAU");
for(int i=0;i<5;i++)
{
for(int j=0;j<=i;j++)
{
System.out.print(s.charAt(j));
}
System.out.println();
}
}
}