// $clone$

public class object4 {

	/**
	 * @param args
	 */
	public static void main(String[] args)  throws OutOfMemoryError {
		// TODO Auto-generated method stub

		// create an identical object, not an alias
		A a1 = new A(1);
		A a2 = (A) (a1.clone());
		System.out.println(a1);
		System.out.println(a2);
		if (a2.equals(a1))  System.out.println("Hooray!");
		else System.out.println("Ugh!");
		
		// works for array, too!
		char[] c = "hello".toCharArray();
		char[] d = (char[]) c.clone();
	}

}

class A {
	int k;
	A(int k) { this.k = k; }
	public boolean equals(A a) {
		return k == a.k;
	}
	
	// like $equals$, you need to provide a specific implementation
	public Object clone() {
		return new A(k);
	}
}