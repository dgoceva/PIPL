package helloWorld;

import java.util.Random;
import java.util.Scanner;

public class ArrayClass {
	private static final int MAXLEN = 5;
	private int[] array;
	private int sum;

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public static int getMAXLEN() {
		return MAXLEN;
	}
	
	public ArrayClass() {
//		super();
		// TODO Auto-generated constructor stub
		array = new int[MAXLEN];
		if (array==null) {
			System.out.println("Memory error");
			System.exit(MAXLEN);
		}
	}
	
	public void inputArray() {
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<array.length;++i) {
			array[i] = sc.nextInt();
		}
		sc.close();
	}
	
	public void generateArray() {
		Random rand = new Random();
		for (int i=0;i<array.length;++i) {
			array[i] = rand.nextInt(100);
		}
	}
	
	public void printArray() {
		System.out.print("[ ");
		for (int x : array) {
			System.out.print(x+" ");
		}
		System.out.println("]");
	}
	
	public void sumArray() {
		sum = 0;
		for(int x : array) {
			sum += x;
		}
	}
	
	public void print() {
		System.out.println("Sum = "+sum);
	}
}
