import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] anArray = new int[10];
	//	float[] floatArray = new float[5];
//		double[] A = new double[6];
//		double[] B = new double[7];
//		
//		inputArray(A);
//		inputArray(B);
//		
//		double[] C = concatenateArrays(A,B);
//		
//		output(A);
//		output(B);
//		output(C);
		
//		double[] data = {1,-2,-3,44,15,-9,-7,21};
//		
//		System.out.println(maxElement(data));
//		System.out.println("Sum is "+sumElements(data,maxElement(data)));
		
	/*	
		input(anArray);
		output(anArray,5,anArray.length);
		int len = extendArray(anArray);
		output(anArray,0,len);
		oddSum(anArray,len);
		countMin(anArray,len);
		
		
		inputFloatArray(floatArray);
		output(floatArray);
		System.out.println("The sum is "+sumArray(floatArray));
		*/
		
		ArrayList<Double> array = new ArrayList<Double>();
		try {
			inputArray(array,"info.dat");
			output(array);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		inputArrayRandom(anArray);
		output(anArray,0,anArray.length);
		System.out.println("The sum: "+sumElementsWith2EqualsLastDigits(anArray,anArray.length));
	}
	
	public static void inputFloatArray(float[] array){
		System.out.println("Input data");
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<array.length; i++) {
			System.out.print("Array["+(i+1)+"]=");
			array[i] = sc.nextFloat();
		}				
	}
	
	public static void inputArrayRandom(int[] array) {
		Random r = new Random();
		for (int i=0;i<array.length;i++){
			array[i] = r.nextInt(30);
		}
	}
	
	public static void inputArray(double[] array){
		System.out.println("Input data");
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<array.length; i++) {
			System.out.print("Array["+(i+1)+"]=");
			array[i] = sc.nextDouble();
		}				
	}

	public static void inputArray(ArrayList<Double> array,String fName) throws FileNotFoundException{
		System.out.println(new File("info.dat").getAbsolutePath());
		Scanner sc = new Scanner(new File(fName));
		while(sc.hasNextDouble()) {
			array.add(sc.nextDouble());
		}	
		sc.close();
	}

	public static void output(float[] anArray){
		for (int i=0; i<anArray.length; i++) {
			System.out.print(anArray[i]+"\t");
		}
		System.out.println();		
	}
	
	public static void output(double[] anArray){
		for (int i=0; i<anArray.length; i++) {
			System.out.print(anArray[i]+"\t");
		}
		System.out.println();		
	}

	public static void output(ArrayList<Double> anArray){
		for (Double d : anArray) {
			System.out.print(d+"\t");
		}
		System.out.println();		
	}

	public static float sumArray(float[] array){
		float sum = 0;
		
		for (int i=0;i<array.length;i++){
			sum += array[i];
		}
		
		return sum;
	}

	public static void input(int[] anArray){
		System.out.println("Input data");
		Scanner sc = new Scanner(System.in);
		for (int i=5; i<anArray.length; i++) {
			System.out.print("Array["+(i-4)+"]=");
			anArray[i] = sc.nextInt();
		}		
	}
	
	public static void output(int[] anArray, int index, int len){
		for (int i=index; i<len; i++) {
			System.out.print(anArray[i]+"\t");
		}
		System.out.println();		
	}
	
	public static void oddSum(int[] anArray,int len){
		int sum = 0;
		
		for (int i=0;i<len;i++){
			if (anArray[i]%2 != 0){
				System.out.print(anArray[i]+"\t");
				sum += anArray[i];
			}
		}
		System.out.println();
		System.out.println("The sum of odd elements is "+sum);
	}
	
	public static void countMin(int[] anArray, int len){
		int min = anArray[0];
		
		for (int i=0;i<len;i++){
			if (min > anArray[i]){
				min = anArray[i];
			}
		}
		
		int count = 0;
		for (int i=0;i<len;i++){
			if (anArray[i] == min){
				count++;
				System.out.print(i+"\t");
			}
		}
		System.out.println();
		
		System.out.println("Min element is "+min+" Count is "+count);
	}

	public static int extendArray(int[] anArray){
		int j=0;
		for (int i=5;i<anArray.length;i++){
			anArray[j++]=anArray[i];
			if (anArray[i]%2==0){
				anArray[j++] = anArray[i]+1;
			}			
		}
		return j;
	}
	
	public static double[] concatenateArrays(double[] A, double[] B){
		double[] C = new double[A.length+B.length];
		int i=0,j=0;
		
		for (int k=0;k<C.length;k++){
			if (i<A.length && j<B.length){
				C[k] = (A[i]<B[j]) ? A[i++] : B[j++];
			}
			else if (i<A.length){
				C[k] = A[i++];
			}
			else {
				C[k] = B[j++];
			}
		}
		
		return C;
	}
	
	public static int maxElement(double[] array){
		int index=0;
		
		for (int i=1;i<array.length;i++){
			if (array[i]>array[index]){
				index = i;
			}
		}
		
		return index;
	}
	
	public static double sumElements(double[] array,int len){
		double sum=0;
		
		for (int i=0;i<len;i++){
			if (array[i]<0){
				sum += array[i];
			}
		}
		
		return sum;
	}
	
	public static int sumElementsWith2EqualsLastDigits(int[] anArray, int len){
		int sum=0;
		
		for (int i=0;i<len;i++){
			if (anArray[i]%10 == anArray[i]/10%10){
				sum += anArray[i];
			}
		}
		return sum;
	}
}

/*
 * for (инициализация;условие за край;стъпка) {
 * тяло
 * }
 */
