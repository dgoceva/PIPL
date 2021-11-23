// INHERIT4
// more exploration of what inherits for a subclass 
// now I'm exploring more with constructors
// note: I still haven't said much about encapsulation yet!

public class inherit4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Call the constructor w/2 arguments from $Data2$
		new Data2(0, 1);	// outputs m=0, n=1
		
		// Call the constructor w/1 argument from $Data2$
		new Data2(2);		// outputs m=2, n=3
		
		// Call the constructor w/0 arguments from $Data2$
		new Data2();		// outputs m=0, n=0
		
	}

}

class Data1 {
	int m;
	int n;
	Data1 () { }
	Data1 (int m, int n) {
		this.m = m;
		this.n = n;
	}
	void print() {
		System.out.println("m: " + m);
		System.out.println("n: " + n);
	}
}

// Class $Data2$ inherits instance variables $m$ and $n$ from $Data1$.
// Class $Data2$ inherits instance method $print$ from $Data1$.
// Note that subclasses NEVER inherit constructors! Instead you or Java will
// call the $super$ constructor from the superclass.

// Below I give 3 constructors for $Data2$. In the first 2,I give provide
// the call to $super$. Java will look in class $Data1$ for the constructor
// that matches each $super$ call. Java then performs ALL code inside in the
// superclass's constructor.Often you make this kind of $super$ call to set
// instance variables.

// What about the third constructor below? I must write $Data2() {}$ if I
// wish to use the empty constructor. Why? Because I wrote another constructor,
// Java doesn't use the default constructor. Do I have to provide an empty
// constructor? In this case, yes, because I access an empty constructor
// elsewhere in the program (look inside the Main Class). Now, what does that
// mean for the superclass $Data1$? Since I used a non-empty constructor in
// $Data1$, I must now either:
// + write my own $super$ call as the first line in the empty
//	 constructor in $Data2()$
// + write an empty constructor in $Data1$ because Java will call
//	 $super()$ by default
// Below, I let Java call $super()$, so I wrote an empty constructor
// in $Data1$.

class Data2 extends Data1 {
	Data2(int x, int y) {
		super(x, y);	// Java will call $super$ if you do not!
		print();
	}
	Data2(int x) {
		super(x, x+1);
		print();
	}
	Data2() {
		print();
	}
}
