
public class PrivateInterface implements Sayable{
	public static void main() {  
		Sayable s = new PrivateInterface();  
		s.say();  
	}  

}

interface Sayable{  
	default void say() {  
		saySomething();  
	}  
	// Private method inside interface  
	private void saySomething() {  
		System.out.println("Hello... I'm private method");  
	}  
}  
