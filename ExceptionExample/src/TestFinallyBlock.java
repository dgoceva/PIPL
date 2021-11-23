
public class TestFinallyBlock {
	public static void main(){    
		try{    
			//below code do not throw any exception  
			int data=25/5;    
			System.out.println(data);    
		}    
		//catch won't be executed  
		catch(NullPointerException e){  
			System.out.println(e);  
		}    
		//executed regardless of exception occurred or not  
		finally {  
			System.out.println("finally block is always executed");  
		}    

		System.out.println("rest of the code...");    
	}    

}
