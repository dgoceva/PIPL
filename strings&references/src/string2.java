import java.util.Arrays;

public class string2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create 2 strings with reference variables $s1$ and $s2$
		// remember that $s1$ and $s2$ are REFERENCES to string objects
		String s1 = new String("hi");
		String s2 = new String("hi");
		
		// so, are $s1$ and $s2$ equal?
		if (s1 == s2) System.out.println("Test 1: equal!");
		else System.out.println("Test 1: not equal!");
		
		// No! $s1$ and $s2$ do NOT refer to the same object!
		// Only the contents of the objects referred to by
		// $s1$ and $s2$ are equal.
		
		// To test equality of two objects, use the $equals()$ method
		// from the $Object$ class.
		if (s1.equals(s2)) System.out.println("Test 2: equal!");
		if (s2.equals(s1)) System.out.println("Test 3: equal!");
		
		// What if you attempt to make an alias?
		s2 = s1; // $s2$ gets the address of $s1$ object
		// yes, an alias means equal addresses
		if (s1 == s2) System.out.println("Test 4: equal!");
		// yes, an alias means the same object
		if (s1.equals(s2)) System.out.println("Test 5: equal!");

		// What if you attempt something like string addition?
		if (s1.equals("h"+"i")) System.out.println("Test 6: equal!");
		// yes, now you have equal strings
		
		// Can you check string literals with $==$ ? Yes:
		if ("hi" == "hi") System.out.println("Test 7: equal!");
		// The following works, too:
		if ("hi".equals("hi")) System.out.println("Test 8: equal!");
		
		// What if you try the following:
		String x = "hi";
		String y = "hi";
		// Can you use the $==$ operator?
		if (x == y) System.out.println("Test 9: equal!");
		// Yes, Java now thinks $x$ and $y$ are aliases and refer to
		// the same string. Note that you do NOT see this behavior when
		// using $new String(...)$. To be safe, you should avoid $==$ with
		// strings and use $equals()$.
		if (x.equals(y)) System.out.println("Test 10: equal!");
		
		System.out.println(s1==x);
		System.out.println(s1.equals(x));
		System.out.println(s1.isEmpty());
		s1 +=":java:my friend";
		System.out.println(Arrays.toString(s1.split(":")));
		System.out.println(s1.contains(":#"));
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(3,6));
		System.out.println(Arrays.toString(s2.getBytes()));
		System.out.println(y.replace("h", "#"));
		int a = Integer.parseInt("55", 10);
		System.out.println(String.valueOf(a));
		System.out.println(""+a);
	}

}
