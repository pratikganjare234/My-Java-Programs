public class SelectionSort
{
public static void selectionSort(int[]arr)
{
for(int i=0;i<arr.length;i++)
{
int index=i;
for(int j=i+1;j<arr.length;j++)
{
if(arr[j]<arr[index])
index=j;
}
}
int smallestNumber=arr[index];
arr[index]=arr[i];
arr[i]=smallestNumber;
}
}
public static void main(String args[])
{
int[]arr1={9,4,23,25,67,22,54,66,77,2};
System.out.println("Before Selection Sort");
for(int i:arr1)
{
System.out.print(" "+i);
}
System.out.print();
selectionSort(arr1);
System.out.println("After Selection Sort");
for(int i:arr1)
{
System.out.print(" "+i);
}
}
}