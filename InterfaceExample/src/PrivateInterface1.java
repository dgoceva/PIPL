
public class PrivateInterface1 implements Sayable1 {
	public static void main() {  
		Sayable1 s = new PrivateInterface1();  
		s.say();  
	}  

}

interface Sayable1{  
	default void say() {  
		saySomething(); // Calling private method  
		sayPolitely(); //  Calling private static method  
	}  
	// Private method inside interface  
	private void saySomething() {  
		System.out.println("Hello... I'm private method");  
	}  
	// Private static method inside interface  
	private static void sayPolitely() {  
		System.out.println("I'm private static method");  
	}  
}  
