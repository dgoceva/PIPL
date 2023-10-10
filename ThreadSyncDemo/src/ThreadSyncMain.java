import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class ThreadSyncMain {

	int count = 0;

	void increment() {
	    count = count + 1;
	}
	
	void incrementSync() {
		synchronized (this) {
		    count = count + 1;
		}
	}
	
	synchronized void incrementSync1() {
		    count = count + 1;
	}
	
    public static void stop(ExecutorService executor) {
        try {
            executor.shutdown();
            executor.awaitTermination(60, TimeUnit.SECONDS);
        }
        catch (InterruptedException e) {
            System.err.println("termination interrupted");
        }
        finally {
            if (!executor.isTerminated()) {
                System.err.println("killing non-finished tasks");
            }
            executor.shutdownNow();
            
        }
    }

	
	public void example1() {
		ExecutorService executor = Executors.newFixedThreadPool(2);

		IntStream.range(0, 100000)
			.forEach(i -> executor.submit(this::incrementSync));

		stop(executor);

		System.out.println(count); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadSyncMain obj = new ThreadSyncMain();
		obj.example1();
	}

}
