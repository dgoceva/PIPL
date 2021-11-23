import java.io.FileNotFoundException;  
import java.io.FileOutputStream;  
public class FinalVariable {  
    public static void main() throws FileNotFoundException {  
        FileOutputStream fileStream=new FileOutputStream("javatpoint.txt");  
        try(fileStream){  
             String greeting = "Welcome to javaTpoint.";      
                byte b[] = greeting.getBytes();       
                fileStream.write(b);      
                System.out.println("File written");           
        }catch(Exception e) {  
            System.out.println(e);  
        }         
    }  
}  