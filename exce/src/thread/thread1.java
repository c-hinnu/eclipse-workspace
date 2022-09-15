package thread;
class MyThread implements Runnable
{
	String message;
	MyThread(String msg)
	{
		message=msg;
	}
	public void run()
	{
		for(int count=0;count<5;count++)
		{
			try
			{
				System.out.println("run method"+message);
				Thread.sleep(100);
			}
			catch(InterruptedException ie)
			{
				System.out.println("exception in thread"+ie.getMessage());
			}
		}
	}
}

public class thread1 {

	public static void main(String[] args) {
	
		MyThread obj1=new MyThread("My Thread obj1");
		MyThread obj2=new MyThread("My Thread obj2");
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		t1.start();
		t2.start();

	}

}
