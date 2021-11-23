public class TestThrow1 {   
	//function to check if person is eligible to vote or not   
	public static void validate(int age) {  
//		try {
			if(age<18) {  
				//throw Arithmetic exception if not eligible to vote  
				throw new ArithmeticException("Person is not eligible to vote");    
			}  
			else {  
				System.out.println("Person is eligible to vote!!");  
			}  
//		}catch(ArithmeticException e) {
//			System.out.println(e);
//		}
	}  
	//main method  
	public static void main(){  
		//calling the function  
		validate(13); 
		validate(20);
		System.out.println("rest of the code...");    
	}    
}    