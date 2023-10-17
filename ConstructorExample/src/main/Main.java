package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B(5);
		obj.print();
		obj = new B();
		B obj1 = new B();
	}

}

class A {
	int k;
	A(){
//		System.out.println("A constructor");
		print();
	}
	A(int k){
		this.k = k;
		print();
	}
	void print() {
		System.out.println(k);
	}
}

class B extends A {
	B(){
		super();
		System.out.println("B constructor");
//		super();
	}
	B(int k){
		super(k);
	}
}