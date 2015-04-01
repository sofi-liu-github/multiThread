class MultiThread
{
	public static void main(String[] args)
	{
		MyThread myThread = new MyThread();
		myThread.setDaemon(true);
		myThread.start();
		int index = 1;
		while(true)
		{
				if(index++ == 1000)
				break;
				//获取当前的线程并且获取它的名字
		System.out.println("main方法所在的线程的名字：" + Thread.currentThread().getName());	
		}
	}
}
class MyThread extends Thread
{
	//run方法是线程的入口函数
	public void run()
	{
		while(true)
		{
			System.out.println(getName());	
			yield();
		}	
	}	
}