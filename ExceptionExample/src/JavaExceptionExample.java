
public class JavaExceptionExample {
	public static void main() {
		//code that may raise exception  
//		int data=100/0;  // ArithmeticException

		String s=null;  
//		System.out.println(s.length());//NullPointerException  

		s="abc";  
//		int i=Integer.parseInt(s);//NumberFormatException  

		int a[]=new int[5];  
//		a[10]=50; //ArrayIndexOutOfBoundsException  

		//rest code of the program   
		System.out.println("rest of the code...");  
	}  
}
