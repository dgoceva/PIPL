import java.io.*;
import java.util.Vector;

/**
 * @author dgoceva
 * 
 */
public class ListOfNumbers {

	private Vector vector;
	private static final int SIZE = 10;

	public ListOfNumbers() {
		vector = new Vector(SIZE);
		for (int i = 0; i < SIZE; i++) {
			vector.addElement(new Integer(i));
		}
	}

//	public void writeList() {
//		PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
//
//		for (int i = 0; i < SIZE; i++) {
//			out.println("Value at: " + i + " = " + vector.elementAt(i));
//		}
//
//		out.close();
//	}
	
//	public void writeList() {
//		PrintWriter out = null;
//
//		try {
//			System.out.println("Entering try statement");
//			out = new PrintWriter(new FileWriter("OutFile.txt"));
//			for (int i = 0; i < SIZE; i++)
//				out.println("Value at: " + i + " = " + vector.elementAt(i));
//
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.err.println("Caught " + "ArrayIndexOutOfBoundsException: "
//					+ e.getMessage());
//
//		} catch (IOException e) {
//			System.err.println("Caught IOException: " + e.getMessage());
//
//		} finally {
//			if (out != null) {
//				System.out.println("Closing PrintWriter");
//				out.close();
//
//			} else {
//				System.out.println("PrintWriter not open");
//			}
//		}
//	}
	 
	public void writeList() throws IOException, ArrayIndexOutOfBoundsException{
		PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));

		for (int i = 0; i < SIZE; i++) {
			out.println("Value at: " + i + " = " + vector.elementAt(i));
		}

		out.close();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
//	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		ListOfNumbers lst = new ListOfNumbers();
		lst.writeList();
	}

}
