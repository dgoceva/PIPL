public class NestedTryBlock2 {  

	public static void main()  
	{  
		// outer (main) try block  
		try {  

			//inner try block 1   
			try {  

				// inner try block 2  
				try {  
					int arr[] = { 1, 2, 3, 4 };  

					//printing the array element out of its bounds  
					System.out.println(arr[10]);  
				}  

				// to handles ArithmeticException  
				catch (ArithmeticException e) {  
					System.out.println("Arithmetic exception");  
					System.out.println(" inner try block 2");  
				}  
			}  

			// to handle ArithmeticException   
			catch (ArithmeticException e) {  
				System.out.println("Arithmetic exception");  
				System.out.println("inner try block 1");  
			}  
		}  

		// to handle ArrayIndexOutOfBoundsException   
		catch (ArrayIndexOutOfBoundsException e4) {  
//		catch (ArithmeticException e4) {  
			System.out.println(e4);  
			System.out.println(" outer (main) try block");  
		}  
		catch (Exception e5) {  
			System.out.println("Exception");  
			System.out.println(" handled in main try-block");  
		}  
	}  
}  