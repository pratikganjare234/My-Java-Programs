package oops;

public class AnotherArrayPassUsingMethods 
{
	public static void main(String args[])
	{
		int row=4;
		int col=5;
		int[][]grid=new int[row][col];
		fillArray(grid,row,col,7);
	}
	public static void fillArray(int[][]a,int r,int c,int value)
	{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=value;
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
