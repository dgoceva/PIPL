// sort: both select and insert sort
// demonstrate more about arrays and encapsulation

public class sorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {3,9,6,1,2};
		Arrays AN = new Arrays(nums);
		AN.sort();
		AN.print();
	}

}

class Arrays {
	private int size;
	private int[] selected;
	private int[] inserted;
	private int[] unsorted;
	
	public Arrays(int[] array) {
		unsorted = array;			// store array inside object
		size = array.length;
		selected = new int[size];	// create new array to store sorted values
		inserted = new int[size];	// create new array to store sorted values
		copy_array();
		
		// sorted = unsorted; 		// think this should work, instead? try...
		
	}
	
	// Want to save old array, but need same values to sort.
	// Can't use original and can't use alias "sorted = unsorted"
	// because both ideas would mess up original array.
	private void copy_array() {
		for (int i=0;i<=size-1;i++) {
			selected[i]=unsorted[i];
			inserted[i]=unsorted[i];
		}
	}
	
	public void sort() {
		select_sort();
		insert_sort();
	}
	
	private void select_sort() {
		int min, temp, index, scan;
		
		// outer loop checks each position
		for(index = 0; index < size-1; index++) {
			min = index;
			
			// inner loop finds smallest value
			for(scan = index+1; scan < size; scan++) 
				if (selected[scan] < selected[min])
					min = scan;
			
			// swap values
			temp = selected[min];
			selected[min] = selected[index];
			selected[index] = temp;
		}
	}
	
	private void insert_sort() {
		int index, position, key;
		
		// outer loop checks each position
		for (index = 1; index < size; index++) {
			key = inserted[index];
			position = index;
			
			while (position > 0 && inserted[position-1]>key) {
				inserted[position] = inserted[position-1];
				position--;
			}
			
			inserted[position] = key;
		}
	}
	
	// service method for printing arrays
	public void print() {
		print(0);	// print original
		print(1);	// print select sorted
		print(2);	// print insert sorted
	}
	
	// support method for printing arrays
	private void print(int test) {
		int[] array = new int[size];
		
		// choose which array to print
		if (test == 0) {
			array = unsorted;
			System.out.print("Original array:\t\t");
		}
		else if (test == 1) {
			array = selected;
			System.out.print("Select sorted array:\t");
		}
		else if (test == 2) {
			array = inserted;
			System.out.print("Insert sorted array:\t");
		}
		else {
			System.out.println("Unknown array type!");
			System.exit(0);
		}
		
		// print array
		for (int i=0; i<=array.length-1;i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}
}