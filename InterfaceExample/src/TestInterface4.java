
public class TestInterface4 implements Showable1{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	public static void main(){  
		TestInterface4 obj = new TestInterface4();  
		obj.print();  
		obj.show();
	}

}

interface Showable1 extends Printable{
	void show();
}