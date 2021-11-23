
public class VirtualMain {

	public VirtualMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		B obj1 = new B();
		A obj3 = new B();
		obj.X();
		obj1.X();
		obj3.X();
	}

}

class A {
	public void X() {
		System.out.println("In A.X");
		F();
	}
	public void F() {
		System.out.println("In A.F");
	}
}
class B extends A{
	public void F() {
		System.out.println("In B.F");
	}
}
