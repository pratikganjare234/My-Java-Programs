import java.util.Scanner;
public class GradeStudent
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Number Of Student");
int stud=sc.nextInt();

int[]score=new int[stud];
int best=0;
char grade;

for(int i=0;i<score.length;i++)
{
System.out.println("Enter The Score");
score[i]=sc.nextInt();
if(score[i]>best)
best=score[i];
}

String output=" ";

for(int i=0;i<score.length;i++)
{
if(score[i]>=best-10)
grade='A';
else if(score[i]>=best-20)
grade='C';
else if(score[i]>=best-30)
grade='D';
else if(score[i]>=best-40)
grade='E';
else
grade='F';
output+="Student"+i+"Score is"+score[i]+"and grade is"+grade;
}
System.out.println(output);
}
}


