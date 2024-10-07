import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArrayDemoMain {
	
	ArrayList<Double> data = new ArrayList<Double>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDemoMain mainObj = new ArrayDemoMain();
//		mainObj.inputData();
//		mainObj.outData();
//		inputData();
		mainObj.data.clear();
		mainObj.inputDataRandom();
		mainObj.outData();
		mainObj.removeNegative();
		mainObj.outData();
		mainObj.insertData();
		mainObj.outData();
		mainObj.data.set(2, 1.1);
		mainObj.outData();

	}

	void inputData() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			double value = sc.nextDouble();
			if (value==0) {
				break;
			}
			data.add(value);
		}	
	}
	
	void outData() {
		for (double d : data) {
			System.out.print(d+" ");
		}
		System.out.println();
		System.out.println(data.toString());
	}
	
	void inputDataRandom() {
		Random random = new Random();
		for (int i=0;i<10;++i) {
			data.add(random.nextDouble(-7,10));
		}
	}
	
	void removeNegative() {
		for(int i=0;i<data.size();++i) {
			if (data.get(i)<0) {
				data.remove(i);
			}
		}
	}
	
	void insertData() {
		for (int i=0;i<5;++i) {
			data.add(0,(double) i);
		}		
	}
}
