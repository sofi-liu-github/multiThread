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
				//��ȡ��ǰ���̲߳��һ�ȡ��������
		System.out.println("main�������ڵ��̵߳����֣�" + Thread.currentThread().getName());	
		}
	}
}
class MyThread extends Thread
{
	//run�������̵߳���ں���
	public void run()
	{
		while(true)
		{
			System.out.println(getName());	
			yield();
		}	
	}	
}