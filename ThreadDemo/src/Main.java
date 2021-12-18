
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		main2();
//		main3();
//		main4();
//		main5();
//		main6();
//		System.out.println(Thread.currentThread().getName());
//		main7();
//		main8();
		main9();
	}
	
	public static void main1() {
		Thread thread = new Thread();
		thread.start();
	}
	
	public static void main2() {
		MyThread mythr = new MyThread();
		mythr.start();
	}

	public static void main3() {
		MyRunnable thr = new MyRunnable();
		Thread thread = new Thread(thr);
		thread.start();
	}
	
	public static void main4() {
		Thread thread = new Thread("Name of Thread") {
			public void run() {
				System.out.println("Hello anonymous subclass!");
			}
		};
		thread.start();
		System.out.println(thread.getName());
	}
	
	public static void main5() {
		Runnable mythr = new Runnable() {
			public void run() {
				System.out.println("Hello anonymous runnable!");
			}
		};
		Thread thread = new Thread(mythr,"New Name");
		thread.start();
		System.out.println(thread.getName());
	}
	public static void main6() {
		Runnable mythr = () -> {System.out.println("Lambda Runnable running!");};
		Thread thread = new Thread(mythr);
		thread.start();	
		System.out.println(thread.getName());
	}
	public static void main7() {
		System.out.println(Thread.currentThread().getName());
		for (int i=0; i<10; ++i) {
			new Thread("No "+i) {
				public void run() {
					System.out.println("Thread "+getName()+" is running!");
					try {
						Thread.sleep(1*1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Thread "+getName()+" is running again!");
				}
			}.start();
		}
	}
	public static void main8() {
		MyStopRunnable thr = new MyStopRunnable();
		Thread thread = new Thread(thr);
		thread.start();
		try {
			Thread.sleep(10*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thr.doStop();
		System.out.println("Stop thread!");
	}
	public static void main9() {
		NotThreadSafe shared = new NotThreadSafe();
		
		new Thread(new RunnableNotThreadSafe(shared)).start();
		new Thread(new RunnableNotThreadSafe(shared)).start();
	}
}

