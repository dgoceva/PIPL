
public class TestInterface3 implements Printable,Showable{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
	}

	@Override
//	public void Printable.print() {
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	public static void main(){  
		TestInterface3 obj = new TestInterface3();  
		Printable p = new TestInterface3();
		obj.print();  
		obj.show();  
		p.print();
//		p.show();
	}  
}

interface Showable{  
	void show();  
	void print();
}  

