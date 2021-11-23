// ragged arrays
// that is, an array of arrays, where each "sub-array" has different sizes

public class array_ragged0 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// two 1-D arrays using initializer lists
		int[] x = {1, 2};
		int[] y = {3, 4, 5};
		
		// how do you create a 2-D array using arrays x and y?
		
		//--------------------------------------------------------------------
		// try making the 2-D array first:
		//--------------------------------------------------------------------
		int A[][]=new int[2][3];
		A[0]=x;
		A[1]=y;
		
		// values inside A:
		// A[0][0]=1, A[0][1]=2
		// A[1][0]=3, A[1][1]=4, A[1][2]=5
		
		// But... is there a value A[0][2]???
		// No! Why? A[0] is a reference to the array x
		// When Java executed the line A[0]=x, the reference to the
		// 3-element row of A was lost, and a new reference to x was
		// connected to A[0]
		
		// Try accessing A[0][2] anyway:
		// System.out.println(A[0][2]);
		// you will see Java.lang.ArrayIndexOutOfBoundException: 2
		//		at array_ragged0.main(Compiled Code)
		
		//--------------------------------------------------------------------
		// so, you could have formed a 2-D array in other ways
		//--------------------------------------------------------------------
		int[][] B = new int[2][];
		B[0] = x; B[1] = y;			// 1) direct assignement
		B = new int[][] { x, y };	// 2) use anonymous array
		
		//--------------------------------------------------------------------
		// how should you access all elements since you might not
		// know the size of each sub-array in an array of arrays?
		// --> Use named constants for each array length
		//--------------------------------------------------------------------
		
		System.out.println("Number of rows of A: " + A.length);
		for (int i=0; i < A.length; i++)
			System.out.println("Number of columns of A: " + A[i].length);
		
		System.out.println("Number of rows of B: " + B.length);
		for (int i=0; i < B.length; i++)
			System.out.println("Number of columns of B: " + B[i].length);
		
		//--------------------------------------------------------------------
		// now, do something useful, like printing out the array values
		//--------------------------------------------------------------------
		// loop from 0 to # of arrays -- think of A.length as # of rows
		for (int i=0; i < B.length; i++) {
			// loop from 0 to length of each sub-array -->
			// --> think of B[i].length as length of each row
			for (int j=0; j< B[i].length; j++)
				System.out.print(B[i][j] + " ");
			System.out.println();
		}
		
	}

}
