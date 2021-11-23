import java.util.GregorianCalendar;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		long start=new GregorianCalendar().getTimeInMillis();
		long start = System.currentTimeMillis();
		long start1 = System.nanoTime();
		StringBuffer sbf = new StringBuffer();
		for(int i = 0; i<10000000; i++){
			sbf.append(":").append(i);
		}
		long end1 = System.nanoTime();
		long end = System.currentTimeMillis();
//		long end=new GregorianCalendar().getTimeInMillis();
		System.out.println("Time Taken for StringBuffer:"+(end-start));
		System.out.println("NanoTime Taken for StringBuffer:"+(end1-start1));
		
		start=new GregorianCalendar().getTimeInMillis();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<10000000; i++){
			sb.append(":").append(i);
		}
		end=new GregorianCalendar().getTimeInMillis();
		System.out.println("Time Taken for StringBuilder:"+(end-start));

		}
}
