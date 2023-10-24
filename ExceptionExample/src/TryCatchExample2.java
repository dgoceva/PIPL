
public class TryCatchExample2 {
	public static void main() {
		try  
		{  
			int data1=50/20;
//			int data=50/0; //may throw exception   
		}  
		//handling the exception  
		catch(ArithmeticException e)  
		{  
			System.out.println(e);  
		}  
		System.out.println("rest of the code");  

	}  
}
