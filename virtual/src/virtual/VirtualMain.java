package virtual;

public class VirtualMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.x();
		B b = new B();
		b.x();
		a = new B();
		a.x();
	}

}

class A {
	void x() {
		System.out.println("A.x");
		y();
	}
	void y() {
		System.out.println("A.y");
	}
}

class B extends A {
	void y() {
		System.out.println("B.y");
	}	
}