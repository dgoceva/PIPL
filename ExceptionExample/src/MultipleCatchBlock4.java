public class MultipleCatchBlock4 {  

	public static void main() {  

		try{    
			String s=null;  
			System.out.println(s.length());  
		}    
		catch(ArithmeticException e)  
		{  
			System.out.println("Arithmetic Exception occurs");  
		}    
		catch(ArrayIndexOutOfBoundsException e)  
		{  
			System.out.println("ArrayIndexOutOfBounds Exception occurs");  
		}    
		catch(Exception e)  
		{  
			System.out.println("Parent Exception occurs");  
		}             
		System.out.println("rest of the code");    
	}  
}  