public class BinarySearchArray
{
public static int binarySearch(int[]list,int key)
{
int low=0;
int high=list.length-1;
while(high>=low)
{
int mid=(low+high)/2;
if(key<list[mid])
high=mid-1;
else if(key==list[mid])
return mid;
else
low=mid+1;
}
return -low-1;
}
public static void main(String args[])
{
int[]list={2,3,4,6,8,9,10,12,16,18,19};
int key=18;
System.out.println(key+"The Binary Search is found  at index"+binarySearch(list,key));
}
}