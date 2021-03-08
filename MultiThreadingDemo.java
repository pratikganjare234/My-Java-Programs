public class MultiThreadingDemo extends Thread
{
public void run()
{
System.out.println("My Thread Is In Running State");
}
public static void main(String args[])
{
MultiThreadingDemo obj=new MultiThreadingDemo();
obj.start();
}
}