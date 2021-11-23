import java.util.Scanner;

public class Root {
	public static void RootMain() {
		int i = 2;
		double r = Math.sqrt(i);

		System.out.print("The square root of ");
		System.out.print(i);
		System.out.print(" is ");
		System.out.print(r);
		System.out.println(".");

		i = 5;
		System.out.print("input i: ");
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		r = Math.sqrt(i);
		System.out.println("The square root of " + i + " is " + r + ".");
		System.out.print("input i: ");
		i = sc.nextInt();
		r = Math.sqrt(i);
		System.out.println("The square root of " + i + " is " + r + ".");
	}
}
