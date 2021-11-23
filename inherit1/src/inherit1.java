// INHERIT1

class Fruit {
	int k=1;
	void print() {
		System.out.println(k);
	}
}

class Apple extends Fruit {}
// What does $extends$ do? $Apple$ is a subclass of $Fruit$. Thus,
// $Apple$ inherits the instance variable ($k$) and instance method
// ($print$) from superclass ($Fruit$)

// So, you don't need to repeat any code. Ain't life sweet? ;-)

// Actually, I'm talking some shortcuts here, because I've ignored
// constructors (using the defaults) and encapsulation (using "default
// visibility"). You DO need to worry about these things!

public class inherit1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Apple A = new Apple();	// create an $Apple$ object
		A.print();				// access the $print$ method from $Fruit$
	}

}
