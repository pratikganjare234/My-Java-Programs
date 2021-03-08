public class Prime49
{
public static void main(String args[])
{
int num=32,i=2;
boolean flag=false;
while(i<=num/2)
{
if(num%i==0)
{
flag=true;
break;
}
++i;
}
if(!flag)
System.out.println("Prime"+num);
else
System.out.println("Not Prime"+num);
}
}
