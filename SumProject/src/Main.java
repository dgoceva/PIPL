import java.util.Arrays;
import java.util.Random;

public class Main {
	
	public static final int MAX_LEN=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] info = generate();
//		print(info);
//		System.out.println(Arrays.toString(info));
//		System.out.println("Sum is: "+sum(info));
		
		Data info=new Data(MAX_LEN);
		info.print();
		System.out.println("The sum: "+info.sum());
		System.out.println("The average: "+info.average());
		System.out.println("The max: "+info.max());
	}

//	public static int[] generate() {
//		int[] data = new int[MAX_LEN];
//		int x;
//		String s = new String("sample");
//		String sa = "sample";
//		Random rand = new Random();
//		
//		for (int i=0;i<data.length;i++) {
//			data[i] = rand.nextInt(50)-20;
//		}
//		
//		return data;
//	}
//	
//	public static void print(int[] data) {
//		System.out.print("[ ");
//		for(int x:data) {
//			System.out.print(x+" ");
//		}
//		System.out.println("]");
//	}
//	
//	public static int sum(int[] data) {
//		int sum=0;
//		for(int x:data) {
//			sum += x;
//		}
//		return sum;
//	}
}
