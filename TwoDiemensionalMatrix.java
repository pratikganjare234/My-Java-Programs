package oops;
import java.util.Scanner;
public class TwoDiemensionalMatrix
{
	public static void main(String args[])
	{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter Rows");
	int row=input.nextInt();
	System.out.println("Enter Coulmn");
	int col=input.nextInt();
	int[][]matrix=new int[row][col];
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			System.out.print(matrix[i][j]+"\t");
		}
		System.out.print("\n");
	}
	}
}
