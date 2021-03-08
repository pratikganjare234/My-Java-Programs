class Count extends Thread
{
Count()
{
super("My Extending Thread");
System.out.println("My thread  created"+this);
start();
}
public void run()
{
try
{
for(int i=0;i<10;i++)
{
System.out.println("Printing the count"+i);
Thread.sleep(1000);
}
}
catch(InterruptedException e)
{
System.out.println("My Thread Interrupted");
}
System.out.println("My Thread run is over");
}
}
class ExtendingExample
{
public static void main(String args[])
{
Count cnt=new Count();
try
{
while(cnt.isAlive())
{
System.out.println("Main Thread Is Alive Till Child Thread is Live");
Thread.sleep(1500);
}
}
catch(InterruptedException e)
{
System.out.println("Main Thread is Interrupted");
}
System.out.println("Main thread is run over");
}
}