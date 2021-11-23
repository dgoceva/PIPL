// INHERITED 2

// What's different here? I've added a constructor to $Fruit$.
// In INHERITED1 I used the default constructor $Fruit() {}$ to
// create $Fruit$ objects.

// Java requires that SUBCLASSES call the constructor of the
// superclass, using a method called $super$. Technically, $super$ is
// a special kind of method that calls a constructor of the
// superclass. Sometimes we even say "the $super$ constructor."

// + Java ALWAYS calls the $super$ constructor when you create a subclass.
// + A call to $super$ with or without arguments MUSTbe the first line
//   in the constructor of your subclass.
// + If you do not call $super$, Java automatically calls $super()$
//		+ so, you must have an "empty" constructor in the superclass.
//		+ if you use the default constructor, then you get the "empty"
//		  constructor
//		+ if you provide constructors in the superclass, Java does not
//		  provide the default constructor, so YOU must provide it!
// + If you do call $super$, the number of arguments that you use must
//   match the number of arguments in the superclass constructor.

class Fruit {
	int k=1;
	Fruit() {
		print();
	}
	void print() {
		System.out.println(k);
	}
}

class Apple extends Fruit { }
// Java does not see a constructor for $Apple$.
// SO, Java uses the default constructor $Apple() {}$ which
// AUTOMATICALLY calls $super()$ by default. The call to $super()$
// calls the superlass constructor $Fruit()$ which contains code that
// calls $print$ inside $Fruit$ (not $Apple$)

public class inherit2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Apple A = new Apple();	// create an $Apple$ object
	}

}
