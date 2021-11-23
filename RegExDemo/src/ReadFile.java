import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile implements AutoCloseable {
	private String[] text;
	
	private ReadFile() {}
	public ReadFile(String fileName) throws IOException {
		try (BufferedReader fis = new BufferedReader(new FileReader(fileName))) {
			text = new String[countLines(fileName)];
			String temp;
			int i=0;
			while ((temp=fis.readLine())!= null) 
				text[i++] = temp;				
		}
	}
	public String[] getText() {
		return text;
	}
	private int countLines(String fileName) throws FileNotFoundException, IOException {
		int lines=0;
		try (BufferedReader fis = new BufferedReader(new FileReader(fileName))){
			String temp;
			while((temp=fis.readLine())!=null)
				lines++;
		}
		return lines;
	}
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		text=null;
	}
}
