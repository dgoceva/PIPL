import java.util.Random;


public class BreakWithLabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] anArray = new int[3][4];
		
		Random r = new Random();
		for (int i=0;i<anArray.length;i++) {
			for (int j=0;j<anArray[i].length;j++) {
				anArray[i][j] = r.nextInt(20);
			}
		}
		
		for (int i=0;i<anArray.length;i++) {
			for (int j=0;j<anArray[i].length;j++) {
				System.out.print(anArray[i][j]+"\t");
			}
			System.out.println();
		}
		
		int searchFor = 12;
		boolean found = false;
		yes:
		for (int i=0;i<anArray.length;i++) {
			for (int j=0;j<anArray[i].length;j++) {
				if (anArray[i][j]==searchFor) {
					found = true;
					break yes;
				}
			}
		}
		System.out.println(found);
	}

}
