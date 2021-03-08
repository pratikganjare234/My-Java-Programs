package oops;

public class PassingArraysToMethods
{
	public static void main(String args[])
	{
		int[][]a= {
				{1,2,3},
				{3,4,5},
				{7,9,12}
		};
		Display d=new Display();
		d.show(a);
	}

}
class Display
{
	public void show(int [][]p)
	{
		for(int r=0;r<3;r++)
		{
			for(int c=0;c<3;c++)
			{
		System.out.print(p[r][c]+"\t");
			}
			System.out.print("\n");
	}
}
}
