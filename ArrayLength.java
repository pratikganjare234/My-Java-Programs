package oops;

public class ArrayLength
{
	public static void main(String args[])
	{
		int[][]Data;
		Data=new int[10][];
		Data[0]=new int[20];
		Data[1]=new int[30];
		System.out.println("Data="+Data.length);
		System.out.println("Data[0]"+Data[0].length);
		System.out.println("Data[1]"+Data[1].length);
	}

}
