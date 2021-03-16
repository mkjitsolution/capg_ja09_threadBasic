package p1;

public class WhatsAppThread implements Runnable{

	Thread t;
	
	public WhatsAppThread() {
		
		t = new Thread(this);
		t.start();
		
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	
	
}



