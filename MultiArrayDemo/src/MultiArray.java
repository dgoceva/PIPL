import java.util.Random;

public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] data;
		data = new int[3][4];
		
		Random rand = new Random();
		for (int i=0; i<data.length;i++)
			for (int j=0; j<data[i].length;j++)
				data[i][j] = rand.nextInt();
		
		for (int i=0; i<data.length; i++)
			for (int j=0; j<data[i].length;j++)
				System.out.print(data[i][j]+"\t");
		System.out.println();
	}
}
