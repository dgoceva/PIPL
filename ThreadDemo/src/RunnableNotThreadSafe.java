
public class RunnableNotThreadSafe implements Runnable {

	NotThreadSafe instance = null;
	
	public RunnableNotThreadSafe(NotThreadSafe instance) {
		super();
		this.instance = instance;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		instance.add("some text");
		System.out.println(instance);
	}

}
