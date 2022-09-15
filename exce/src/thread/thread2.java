package thread;
class ThreadTest extends Thread
{
	private Thread thread;
	private String threadname;
	ThreadTest(String msg)
	{
	threadname=msg;
	System.out.println("creating thread"+threadname);
	}
	public void run()
	{
		System.out.println("running thread"+threadname);
		try
		{
		for(int i=0;i<5;i++)
		{
		System.out.println("thread"+threadname+","+i);
	    Thread.sleep(50);
		}
		}
	catch(InterruptedException ie)
			{
				System.out.println("exception in thread"+threadname);
			}
		System.out.println("thread"+threadname+"continue");
		}
	public void start()
	{
		System.out.println("start method"+threadname);
		if(thread==null)
		{
			thread=new Thread(this,threadname);
			thread.start();
		}
	}
}

public class thread2 {

	public static void main(String[] args) {
		ThreadTest t1=new ThreadTest("first thread");
		t1.start();
		ThreadTest t2=new ThreadTest("first thread");
		t2.start();
		
		
		

	}

}
