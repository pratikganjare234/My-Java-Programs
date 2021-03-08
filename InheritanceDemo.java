package oops;
import java.util.Calendar;
class Person
{
	String name;
	String sex;
	int birthYear;
	
	int getAge()
	{
		Calendar cr=Calendar.getInstance();
		int currYear=cr.get(Calendar.YEAR);
		return (currYear-birthYear);
	}
	void display()
	{
		System.out.println("Name"+name);
		System.out.println("Sex"+sex);
		System.out.println("Age"+getAge());
	}
}
class Student extends Person
{
	private int yearAddmitted;
	private String degree;
	Student(String n,String s,int y,int ya,String d)
	{
		name=n;
		sex=s;
		birthYear=y;
		yearAddmitted=ya;
		degree=d;
	}
	void display()
	{
		System.out.println("Name"+name);
		System.out.println("Sex"+sex);
		System.out.println("Age"+getAge());
		System.out.println("Year Of Addmition"+yearAddmitted);
		System.out.println("Course"+degree);
	}
}
public class InheritanceDemo 
{
	public static void main(String args[])
	{
		Student s1=new Student("Pratik Ganjare","Male",1998,2018,"MCA");
		Student s2=new Student("Ankita Saurkar","Female",1997,2018,"MCA");
		System.out.println("\nStudent S1\t");
		s1.display();
		System.out.println("\nStudent S2\t");
		s2.display();
		Person p=new Person();
		p.name="Radhe Krishna";
		p.sex="Male";
		p.birthYear=1999;
		System.out.println("\nPerson p:");
		p.display();
	}
}
