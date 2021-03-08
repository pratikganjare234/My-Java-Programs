package oops;

public class VarArgLength
{
	public static void main(String args[])
	{
		printMax(34,5,6,7,3,4.6);
		printMax(new double[]{1,2,3});
	}
	public static void printMax(double...numbers)
	{
		if(numbers.length==0)
		{
			System.out.println("No Argument Passed");
			return;
		}
		double result=numbers[0];
		for(int i=1;i<numbers.length;i++)
		{
			result=numbers[i];
			System.out.println("The Max Value is"+result);
		}
		
	}

}
