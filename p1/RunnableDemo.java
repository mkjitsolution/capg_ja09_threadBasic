package p1;


// Resource
class Printer 
{
	public void givePrintOut(String inputMsg)
	{
		
		System.out.println("A");
		System.out.println("B");
		
		
		synchronized (this) {
			
			System.out.println("[");
			System.out.println(inputMsg);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("]");
			
			
		}
		
		
		System.out.println("C");
		System.out.println("D");
		
	}
}

// Thread / Person 
class User implements Runnable
{

	Printer printer;
	String msg;
	Thread t;
	
	public User(Printer printer, String msg) {
		
		this.printer = printer;
		this.msg = msg;
		
		t = new Thread(this);
		t.start();
		
	}

	@Override
	public void run() {
		printer.givePrintOut(msg);
	}
	

}


// Operation
public class RunnableDemo {
	public static void main(String[] args) {
		
		Printer colgPrinter = new Printer(); // only 1 printer shared among Users 
		
		User user1 = new User(colgPrinter, "Hello");
		User user2 = new User(colgPrinter, "Good Morning");
		User user3 = new User(colgPrinter, "Hi");
		
		
		
		
	}

}
