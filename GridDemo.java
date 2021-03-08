package oops;

public class GridDemo 
{
	public static void main(String args[])
	{
		int[][]grid=new int[9][9];
		for(int i=0;i<9;i++)
		{
		for(int j=0;j<9;j++)
		{
			System.out.print(grid[i][j]+"   ");
		}
			System.out.println();
		}
	}

}
