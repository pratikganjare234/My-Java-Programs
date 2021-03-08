package oops;

public class AdditionOfArray 
{
	public static void main(String args[])
	{
		int[]addition= {2,3,4,5,6};
		int[]sum= {2,3,4,5,6};
		int total=0;
		for(int i=0;i<addition.length;i++)
		{
			for(int j=0;j<sum.length;j++)
			{
			total=sum[j]+addition[i];
			}
		}
		System.out.println("Total is"+total);
	}
}
