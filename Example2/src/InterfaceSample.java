import java.util.*;
import java.lang.annotation.*;

/**
 * @author dgoceva
 *
 */
public class InterfaceSample {

	private final static int SIZE = 10;
	private Int[] arr = new Int[SIZE];
	private Date[] arr1 = new Date[SIZE];
	private FloatNumber[] arr2 = new FloatNumber[SIZE];
		
	public InterfaceSample() {
		super();
		// TODO Auto-generated constructor stub
		for (int i=0;i<arr.length;i++) {
			arr[i] = new Int();
			arr1[i] = new Date();
			arr2[i] = new FloatNumber();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InterfaceSample ifs = new InterfaceSample();
		ifs.printArr();
		System.out.println(ifs.amax(ifs.arr));
		System.out.println(ifs.amax(ifs.arr1));
		System.out.println(ifs.amax(ifs.arr2));
		FloatNumber f = new FloatNumber();
		System.out.println(f.compareTo("100"));
	}

	public void printArr() {
		for (Int elem:arr)
			System.out.print(elem+"  ");
		System.out.println();
		for (Date elem:arr1)
			System.out.print(elem+"  ");
		System.out.println();
		for (FloatNumber elem:arr2)
			System.out.print(elem+"  ");
		System.out.println();
	}
	
	@SuppressWarnings("unchecked")
	public Comparable amax(Comparable[] arr){
	      Comparable max = null; 
	      for(int i=0;i < arr.length ;i++){
	        if((max == null) || (arr[i].compareTo(max) > 0))
	           max = arr[i];
	      }
	      return(max);
	   }
}

@SuppressWarnings("unchecked")
class Int implements Comparable {
	private int data;
	Random rand = new Random();
	
	public Int() {
		super();
		// TODO Auto-generated constructor stub
		data = rand.nextInt(200);
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return data-((Int)arg0).data;
	}

	@Override
	public String toString() {
		return ""+data;
	}
}

@SuppressWarnings("rawtypes")
class FloatNumber implements Comparable {

	private float data;
	private Random rand = new Random();
	
	public FloatNumber() {
		data = rand.nextFloat();
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (o instanceof FloatNumber) {
			FloatNumber f = (FloatNumber)o;
			if (data<f.data) {
				return -1;
			} else if (data==f.data) {
				return 0;
			}
			return 1;
		}
		else
			throw new TypeNotPresentException("Not supported", null);
	}
	
	@Override
	public String toString() {
		return ""+data;
	}
}
