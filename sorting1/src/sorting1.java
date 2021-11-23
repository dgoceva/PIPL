
public class sorting1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = {4, 2, 1, 3};
		selectsort(x);
		int[] y = {4, 2, 1, 3};
		insertsort(y);
	}
	
	public static void print(int[] x) {
		System.out.println();
		for (int i=0; i<x.length;i++)
			System.out.print(x[i] + " ");
	}
	
	public static void selectsort(int[] x) {
		
		// pick elements of array
		// work right to left
		for (int i=x.length-1; i>=0; i--) {
			
			// Find max x[j] in 0..i
			
			// Assume current element x[i] is max.
			// So, position of max so far is the current element on the
			// "rightmost" side of the unsorted portion of the array:
			int j=i;
			
			// Search unsorted portion of list.
			// Check each element and try to find one bigger than x[i]
			for (int k=i-1; k>=0; k--)		// unsorted portion
				
				// If current element is bigger than previous max
				// then current element is max.
				// So, set the position of the new max element.
				if (x[k]>x[j])  j=k;
			
			// Now, swap the biggest element from the unsorted portion
			// into the sorted portion: x[i] and x[j]:
			int tmp = x[i];  x[i] = x[j];  x[j] = tmp;
			
			// The sorted element goes into the "leftmost" side of the
			// sorted portion. Since the loop for i moves one element
			// to the left, the sorted portion now includes the new element.
		}
		print(x);
	}
	
	public static void insertsort(int[] x) {
		
		// Scan through all elements
		for (int i=1; i<x.length; i++) {
			
			// Index i gives current element.
			// Find max x[j] in unsorted region 0..i
			
			int key=x[i];
			int maxpos=i;		// position of max so far
			
			// Move x[j] into sorted portion
			
			while (maxpos>0 && x[maxpos-1]>key) {
				x[maxpos]=x[maxpos-1];
				maxpos--;
			}
			
			x[maxpos]=key;
		}
		print(x);
	}

}
