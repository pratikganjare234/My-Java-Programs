package oops;

public class Star
{
	public static void main(String args[])
	{
		String str=new String("PRATI");
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			System.out.print(str.charAt(j));
			System.out.println("*");
		}
	}
}
