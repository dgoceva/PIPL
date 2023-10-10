import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello "+(5+3));
		System.out.println("Hello "+5+3);
		System.out.println(5+3+"Hello ");
//		int[] data = input();
//		calculate(data);
		
	}
	
	public static int[] input() {
		int[] retValue = new int[3];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input begin Farenheit T: ");
		retValue[0] = sc.nextInt();
		System.out.print("Input end Farenheit T: ");
		retValue[1] = sc.nextInt();
		System.out.print("Input step Farenheit T: ");
		retValue[2] = sc.nextInt();
		
		return retValue;
	}
	
	public static void calculate(int[] data) {
		float cel;
		System.out.println("Farenheit\tCelsius");
		System.out.println("---------------------------------");
		for (int far = data[0]; far <= data[1]; far += data[2]) {
			cel = Math.round((float)((far - 32) * 5.0 / 9)*100)/100f;
			System.out.println(far+"\t\t"+cel);
		}
	}

}
