import java.util.Arrays;
import java.util.Random;

public class Data {
	private int[] elements;
	
	public Data() {
//		super();
		// TODO Auto-generated constructor stub
	}
	public Data(int len) {
		elements = new int[len];
		Random rand = new Random();
		for(int i=0;i<elements.length;i++) {
			elements[i] = rand.nextInt(10);
		}
	}
	public Data(int[] elements) {
//		super();
		this.elements = elements;
	}
	public int sum() {
		int res=0;
		for(int x:elements) {
			res+=x;
		}
		return res;
	}
	private boolean isEmpty() {
		return elements.length==0;
	}
	public double average() {
		int res = sum();
		return isEmpty()?0:(double)res/elements.length;
		
	}
	public int max() {
		int res=elements[0];
		for (int i=1;i<elements.length;i++) {
			if (elements[i]>res) {
				res = elements[i];
			}
		}
		return res;
	}
	public void print() {
		System.out.println("Result");
		System.out.println(elements);
		System.out.println(Arrays.toString(elements));
	}
//	@Override
	public String toString() {
		return "Data [elements=" + Arrays.toString(elements) + "]";
	}
	public int[] getElements() {
		return elements;
	}
	public void setElements(int[] elements) {
		this.elements = elements;
	}
	
}
