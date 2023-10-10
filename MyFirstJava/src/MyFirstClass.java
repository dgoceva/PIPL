import java.util.Arrays;
import java.util.Scanner;

public class MyFirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myStaticMethod();
		System.out.println("This is my first Java program!");
		MyFirstClass obj = new MyFirstClass();
		obj.myMethod();
	}
	static void myStaticMethod() {
		System.out.print(2<10);
	}
	void myMethod() {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		for (int i=0;i<array.length;++i) {
			array[i] = sc.nextInt();
		}
//		for(int i=0;i<5;++i) {
//			System.out.print(array[i]+"\t");
//		}
		for(int n : array) {
			System.out.print(n+"\t");
		}
		System.out.println();
		double[] arr = new double[] {1,2,3};
		System.out.println(Arrays.toString(arr));
		System.out.println(arr);
		arr = new double[2];
		System.out.println(Arrays.toString(arr));
		double[] arr1 = {4,5,6,7};
		System.out.print(2>10);
		System.out.println(2+3);
		System.out.println(""+2+3);
		System.out.println(""+(2+3));
		System.out.println(2+3+"");
	}
}
