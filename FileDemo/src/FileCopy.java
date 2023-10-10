import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public FileCopy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		copyFile("izpit_PIK3.pdf");
	}

	public static void copyFile(String name) {
/*		try {
			FileInputStream file = new FileInputStream(name);
			FileOutputStream out = new FileOutputStream(name+".out");
			int temp;
			while((temp=file.read())!= -1) {
				out.write(temp);
			}
			file.close();
			out.close();
*/
		try (FileInputStream file = new FileInputStream(name);
			FileOutputStream out = new FileOutputStream(name+".out.pdf")) {
			int temp;
			while((temp=file.read())!= -1) {
				out.write(temp);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
