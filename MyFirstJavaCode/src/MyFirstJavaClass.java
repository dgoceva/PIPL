import java.util.Scanner;

public class MyFirstJavaClass {

	final static int START=0;
	final static int END=300;
	final static int STEP=20;
	
	public MyFirstJavaClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello World!");
//		System.out.print("Въведете име: ");
//		Scanner sc = new Scanner(System.in);
//		String name = sc.nextLine();
//		System.out.println("Hello "+name);
		MyFirstJavaClass obj = new MyFirstJavaClass();
		obj.celConverter();
	}
	
	private void celConverter() {
		double oC;
		
		System.out.println("Result");
		System.out.format("oF\toC%n");
		
		for(int oF=START;oF<=END;oF+=STEP) {
			oC = 5/9.*(oF-32);
			System.out.format("%d\t%.3f%n",oF,oC);
		}
	}

}
