
public class TryCatchExample7 {
	public static void main() {  

		try  
		{  
			int data1=50/0; //may throw exception   

		}  
		// handling the exception  
		catch(Exception e)  
		{  
			// generating the exception in catch block  
			int data2=50/0; //may throw exception   

		}  
		System.out.println("rest of the code");  
	}  
}
