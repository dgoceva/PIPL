
public class TryCatchExample9 {
	public static void main() {  
		try  
		{  
			int arr[]= {1,3,5,7};  
			System.out.println(arr[10]); //may throw exception   
		}  
		// handling the array exception  
		catch(ArrayIndexOutOfBoundsException e)  
		{  
			System.out.println(e);  
		}  
		System.out.println("rest of the code");  
	}  
}
