// INHERIT6
// Can you use $super$ on instance variables?
// Yes -- resembles $this$ in behavior, except you can access
// information from the super class.

public class inherit6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new B();
	}

}

class A {
	int k = 2;
}

class B extends A {
	int k = 1;
	B() {
//		super();
		System.out.println("sub: " + k);
		System.out.println("sup: " + super.k);
	}
}
