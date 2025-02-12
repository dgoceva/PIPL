import java.util.GregorianCalendar;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start0 = new GregorianCalendar().getTimeInMillis();
		long start = System.currentTimeMillis();
		long start1 = System.nanoTime();
		StringBuffer sbf = new StringBuffer();
		for(int i = 0; i<10000000; i++){
			sbf.append(":").append(i);
		}
		long end1 = System.nanoTime();
		long end = System.currentTimeMillis();
		long end0 = new GregorianCalendar().getTimeInMillis();
		System.out.println("Time Taken for StringBuffer:"+(end-start));
		System.out.println("NanoTime Taken for StringBuffer:"+(end1-start1));
		System.out.println("Time Taken for StringBuffer:"+(end0-start0));
		
		start0 = new GregorianCalendar().getTimeInMillis();
		start = System.currentTimeMillis();
		start1 = System.nanoTime();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<10000000; i++){
			sb.append(":").append(i);
		}
		end1 = System.nanoTime();
		end = System.currentTimeMillis();
		end0 = new GregorianCalendar().getTimeInMillis();
		System.out.println("Time Taken for StringBuilder:"+(end-start));
		System.out.println("NanoTime Taken for StringBuilder:"+(end1-start1));
		System.out.println("Time Taken for StringBuilder:"+(end0-start0));

		}
}
