
public class PrivateInterface1 implements Sayable1 {
	void saySomething() {
		System.out.println("From Private Interface");
	}
	static void sayPolitely() {
		System.out.println("static From Private Interface");
	}
	public static void main() {  
		Sayable1 s = new PrivateInterface1(); 
		PrivateInterface1 p = new PrivateInterface1();
		s.say(); 
//		Sayable1.sayPolitely();
		sayPolitely();
		((PrivateInterface1)s).saySomething();
		p.saySomething();
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
