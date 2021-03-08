package oops;
public class StringUse
{
	public static void main(String args[])
	{
		String message=new String("Welcome in Java\n");
		System.out.print(message);
		char[] charArray= {'P','R','A','T','I','K'};        //Array of String
		String message1=new String(charArray);
		System.out.print(message1);
		String s="Java";                      //immutable Strings
		s="\nHTML";
		System.out.print(s);
		String s1="\nWelcome In Java";
		String s2=new String("\nWelcome In Java");
		String s3="\nWelcome To Java";
		System.out.println("\ns1==s2 is"+(s1==s2));
		System.out.println("\ns1==s3 is"+(s1==s3));
		String s4=new String("\nI Am Pratik");
		String s5="I Am A Play Boy";
		String s6="I Like Greek Myths";
		System.out.print(s5.concat(s4));
		System.out.println(s4.equals(s5));
		System.out.println(s4.equals(s6));
		String s7=new String("\nI Am Pratik");
		String s8="I Am A Play Boy";
		String s9="I Like Greek Myths";
		System.out.println(s7.compareTo(s8));
		System.out.println(s7.compareTo(s9));
		String message3=new String("Welcome in Strings\n");
		System.out.print(message3.length());
		System.out.print(message3.charAt(1));
		
	}
}
