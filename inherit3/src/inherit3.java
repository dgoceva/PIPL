// INHERIT3

// What's different here?
// I added $int k=2$ to class $Apple$.

class Fruit {
	int k=1;
	Fruit() {
		print();
	}
	void print() {
		System.out.println(k);
	}
}

class Apple extends Fruit {
	int k=2;
}

// When java calls $super()$ which calls $Fruit()$, which $k$ does
// $print$ call? The $k$ from $Apple$ or $Fruit$? $Fruit$, because the
// constructor in $Fruit$ "lives" in $Fruit$. So, $Fruit$'s version of
// $print$ is called, NOT $Apple$'s.

public class inherit3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Apple A = new Apple();	// create an $Apple$ object
		// output: 1
		System.out.println(A.k);
		// output: 2
	}

}
