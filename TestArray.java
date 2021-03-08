package oops;

public class TestArray 
{
	public static void main(String args[])
	{
		int[]pratik= {1,2,3,4,5,6,7,8};
		int i;
		for(i=0;i<pratik.length;i++)
		{
			System.out.println(pratik[i]+"");
			int total=0;
			for(i=0;i<pratik.length;i++)
			{
				total+=pratik[i];
			}
			System.out.println("Total Is"+total);
			int max=pratik[0];
			for(i=1;i<pratik.length;i++)
			{
				if(pratik[i]>max)
					max=pratik[i];
			}
			System.out.println("Max is"+max);
			
		}
	}

}
