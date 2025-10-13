// Another handy feature of $Object$ is the $equals$ method.

// In general, if you use $==$  to compare two objects for equality, you
// will just be testing if two objects have the same address. The
// equality relation $==$ does NOT test for equality of objects'
// CONTENTS.

// To test equality of contents, use the $equals$ method inherited
// from $Object$. Note that unless you override $equals$, Java
// typically gives you $==$!

public class object3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		A za = new A();
		A a1 = new A(1);
		A a2 = new A(2);
		A a3 = new A(2);
		
		// Test if $a1$ and $a2$ refer to the same object: You will see
		// 'no' because the references point to different objects.
		if (a1 == a2) System.out.println("Test 1: yes");
		else System.out.println("Test 1: no");
		
		// Test if $a1$ and $a2$ have the same contents: You will see
		// 'no' because the references still point to different objects:
		if (a1.equals(a2)) System.out.println("Test 2: yes");
		else System.out.println("Test 2: no");
		
		// Test if $a2$ and $a3$ have the same contents: Yes, you 
		// STILL see 'no' because Java uses the default meaning $==$:
		if (a3.equals(a2)) System.out.println("Test 3: yes");
		else System.out.println("Test 3: no");
		
		// To use $equals$ to test contents, investigate the
		// implementation in Class $B$.
		B b1 = new B(1);
		B b2 = new B(1);
		if (b1.equals(b2)) System.out.println("Test 4: yes");
		else System.out.println("Test 4: no");
		
		// Strings have $equals$ defined as equality of contents:
		String s1 = new String("hi");
		String s2 = new String("hi");
		if (s1.equals(s2)) System.out.println("Test 5: yes");
		else System.out.println("Test 5: no");
		
		// Arrays do NOT have $equals$ defined as equality of contents:
		int[] x1 = {1,2,3};
		int[] x2 = {1,2,3};
		if (x1.equals(x2)) System.out.println("Test 6: yes");
		else System.out.println("Test 6: no");
	}

}

class A {
	int k;
	A(int k) { this.k = k; }
}

class B extends A {
	B(int k) { super(k); }
	
	public boolean equals(B b) {
		if (k==b.k) return true;
		return false;
	}
}