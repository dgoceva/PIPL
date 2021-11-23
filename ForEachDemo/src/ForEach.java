import java.util.Random;


public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		
		Random r = new Random();
		for (int i=0;i<array.length;i++) {
			array[i] = r.nextInt(1000);
		}
		
		for (int element : array) {
			System.out.print(element+" ");
		}
		System.out.println();
	}

}
