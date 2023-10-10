import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyMain {

	public CopyMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		copyFile("./src/CopyMain.java","CopyCopyMain.java");
		copyLines("./src/CopyMain.java","LineCopyMain.java");
	}

	static void copyFile(String in, String out) {
		FileInputStream inFile = null;
		FileOutputStream outFile = null;
		try {
			inFile = new FileInputStream(in);
			outFile = new FileOutputStream(out);
			byte c;
			while ((c = (byte)inFile.read()) != -1) {
				outFile.write(c);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if (inFile!=null) {
						inFile.close();
					}
					if (outFile != null) {
						outFile.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	static void copyLines(String in, String out) {
		BufferedReader inFile = null;
		BufferedWriter outFile = null;
		try {
			inFile = new BufferedReader(new FileReader(in));
			outFile = new BufferedWriter(new FileWriter(out));
			String c;
			while ((c = inFile.readLine()) != null) {
				outFile.write(c+"\n");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if (inFile!=null) {
						inFile.close();
					}
					if (outFile != null) {
						outFile.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
