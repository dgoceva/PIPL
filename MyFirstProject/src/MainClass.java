import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1, y, z;
		z = ++x +1;
		x = 1;
		y = x++ + 1;
		System.out.println("y="+y+", z="+z);
		arrayDemo();
//		SecondClass.print();
		SecondClass obj = new SecondClass();
		obj.print();
		PublicSecondClass objPublic = new PublicSecondClass();
		objPublic.print();
		int[] data = fibSeries(10);
		System.out.println(Arrays.toString(data));
		fibSeriesNew(10);
	}

	static void arrayDemo() {
		int [] array = new int[3];
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<array.length;++i) {
			array[i] = sc.nextInt();
		}
		for (int number : array) {
			System.out.print(number+"  ");
		}
		System.out.println();
		
		array = new int[] {1,2,3,45};
		System.out.println(Arrays.toString(array));
		
		int[] array1 = {11,22,33,44,55};
		System.out.println(Arrays.toString(array1));
	}
	
	static int[] fibSeries(int limit) {
		if (limit<0) {
			System.out.println("No data...");
			return null;
		}
		int[] fib = new int[limit];
		fib[0]=0;fib[1]=1;
		for (int i=2;i<limit;++i) {
			fib[i] = fib[i-1]+fib[i-2];
		}
		return fib;
	}
	static void fibSeriesNew(int limit) {
		int old=0,prev=1,current;

		if (limit<0) {
			System.out.println("No data...");
			return;
		}
		System.out.print(old+" "+prev+" ");
		for (int i=2;i<limit;++i) {
			current = old+prev;
			System.out.print(current+" ");
			old = prev;
			prev = current;
		}
	}
}

class SecondClass {
	void print() {
		System.out.println("Hello");
	}
}

