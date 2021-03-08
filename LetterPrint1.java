public class LetterPrint1
{
public static void main(String args[])
{
char last='Z',alphabet='A';
for(int i=0;i<=(last -'A'+1);++i)
{
for(int j=0;j<=i;++j)
{
System.out.print(""+alphabet);
}
alphabet++;
System.out.println();
}
}
}