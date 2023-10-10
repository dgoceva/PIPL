import java.util.Scanner;

public class MyFirstJavaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input name: ");
		String name = sc.next();
//		sc.close();
		System.out.println("Hello World!");
		System.out.println("Hello "+name);
	}

}
