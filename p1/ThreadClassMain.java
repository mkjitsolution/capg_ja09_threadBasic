package p1;


class MyThread extends Thread
{
	
	public MyThread(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		for(int i=0;i<5;i++)
		{
			System.out.println(name+" :- "+i);
			
			try {
				Thread.sleep(800);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}

public class ThreadClassMain {
	
	public static void main(String[] args) {
		
		for(int i=0;i<5;i++)
		{
			System.out.println(" Main Thread :- "+i);
			try {
				Thread.sleep(600);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		MyThread t1 = new MyThread("MyThread-1");
		t1.start();
		
		MyThread t2 = new MyThread("MyThread-2");
		t2.start();
		
		
		
	}

}
