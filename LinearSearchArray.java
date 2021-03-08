//linear search array
public class LinearSearchArray
{
public static int linearSearch(int[]list,int key)
{
for(int i=0;i<list.length;i++)
{
if(list[i]==key)
{
return i;
}
}
return -1;
}
public static void main(String args[])
{
int[]a1={10,20,30,23,73,87,28,39};
int key=23;
System.out.println(key+"found at index :"+linearSearch(a1,key));
}
}

