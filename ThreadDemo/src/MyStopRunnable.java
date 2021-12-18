
public class MyStopRunnable implements Runnable {

	private boolean doStop = false;
	
	public synchronized void doStop() {
		doStop = true;
	}
	
	public synchronized boolean isRunning() {
		return doStop == false;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(isRunning()) {
			System.out.println("Running...");
			
			try {
				Thread.sleep(3000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
