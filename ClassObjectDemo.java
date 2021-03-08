package oops;

public class ClassObjectDemo
{
	public static void main(String args[])
	{
		double[][]arr=new double[5][6];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
			arr[i][j]=Math.random()*5;
			System.out.print(arr[i][j]+"");
			}
		}
		System.out.println();
	}

}
