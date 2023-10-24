public class MultipleCatchBlock2 {  

	public static void main() {  

		try{    
			int a[]=new int[5];   
			int []b=null;

//			System.out.println(a[10]); 
			System.out.println(b[0]);
		}    
		catch(ArithmeticException e)  
		{  
			System.out.println("Arithmetic Exception occurs");  
		}    
		catch(ArrayIndexOutOfBoundsException e)  
		{  
			System.out.println("ArrayIndexOutOfBounds Exception occurs");  
		}    
		catch(Exception e2)  
		{  
			System.out.println("Parent Exception occurs");  
		}             
		System.out.println("rest of the code");    
	}  
}  