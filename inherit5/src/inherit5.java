// INHERIT5: more about method calls. What's the rule?
// Each method "sends" information back to the object that called the
// method. Even when calling methods from a superclass, the subclass
// will treat any methods or instance variables inside the
// superclass's implementation as if they were writen inside the subclass.

// So, Use $super$ to call a method from a superclass.
// Methods called inside the superclass's method will act as if they were
// called from the subclass!

public class inherit5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		(new Test2("Lalala")).sound();
	}

}

class Test1 {
	String s;
	Test1 (String s) {
		this.s = s;
	}
	void sound() {
		print();
	}
	void print() {
		System.out.println(s+" from Test1");
	}
}

class Test2 extends Test1 {
	Test2(String s) {
		super(s);
	}
	void sound() {
		// call $print$ from class $Test2$
		print();
		// call $print$ from class $Test1$ but use information visible
		// to class $Test1$. Java treat this method call as if the
		// invocation happened "inside" the object created from $Test1$.
		super.sound();
	}
	void print() {
		System.out.println(s);
	}
}
