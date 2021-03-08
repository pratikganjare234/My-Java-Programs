public class CopyArray
{
public static void main(String args[])
{
int[]sourceArray={1,3,2,1,4,10};
int[]targetArray=new int[sourceArray.length];
for(int i=0;i<sourceArray.length;i++)
{
targetArray[i]=sourceArray[i];
}
}
}