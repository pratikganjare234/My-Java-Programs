import java.io.*;
public class Main
{
public static void main(String args[])throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
String s;
while((s=in.readLine()) != null)
{
Integer i=new Integer(s);
System.out.print(i*i);
}
}
}
