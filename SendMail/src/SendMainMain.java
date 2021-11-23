import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SendMainMain {

	public SendMainMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SendMail.send("dgoceva@abv.bg", "proba", "probata!!!");
		readFile("E:\\UchebniMateriali\\PIK3\\Demos\\SendMail\\distanceLurning.txt");
	}
	
	public static void readFile(String name) {
		try(BufferedReader reader = new BufferedReader(new FileReader(name))) {
			String line;
			while ((line=reader.readLine())!=null) {
				String[] array = line.split("\t");
				String msg = "Вашето потребителско име е: "+array[0] +"\r\n"+
						"Вашата парола е: "+array[1]+"\r\n";
				SendMail.send(array[2], msg);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
