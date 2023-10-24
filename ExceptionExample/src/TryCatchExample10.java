import java.io.FileNotFoundException;  
import java.io.PrintWriter;  

public class TryCatchExample10 {  

	public static void main() {  


		PrintWriter pw;  
		try {  
			pw = new PrintWriter("jtp1.txt"); //may throw exception   
			pw.println("saved");  
		}  
		// providing the checked exception handler  
		catch (FileNotFoundException e) {  

			System.out.println(e+" problem");  
		}         
		System.out.println("File saved successfully");  
	}  
}  